package info.sandroalmeida.springpetclinic.bootstrap;

import info.sandroalmeida.springpetclinic.model.Owner;
import info.sandroalmeida.springpetclinic.model.PetType;
import info.sandroalmeida.springpetclinic.model.Vet;
import info.sandroalmeida.springpetclinic.services.OwnerService;
import info.sandroalmeida.springpetclinic.services.PetTypeService;
import info.sandroalmeida.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by sandro on 15/01/19
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Sandro");
        owner1.setLastName("Almeida");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ana");
        owner2.setLastName("Lins");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Inga");
        vet1.setLastName("Kirata");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Miuki");
        vet2.setLastName("Yabuza");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");


    }
}
