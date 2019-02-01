package info.sandroalmeida.springpetclinic.bootstrap;

import info.sandroalmeida.springpetclinic.model.*;
import info.sandroalmeida.springpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by sandro on 15/01/19
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count == 0)
            loadData();

    }

    private void loadData() {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Sandro");
        owner1.setLastName("Almeida");
        owner1.setAddress("000 Somewhere St");
        owner1.setCity("Vancouver");
        owner1.setTelephone("604 000 0000");
        ownerService.save(owner1);

        Pet sandroPet = new Pet();
        sandroPet.setPetType(savedDogPetType);
        sandroPet.setOwner(owner1);
        sandroPet.setBirthDate(LocalDate.now());
        sandroPet.setName("Tiffany");
        owner1.getPets().add(sandroPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ana");
        owner2.setLastName("Lins");
        owner1.setAddress("000 Somewhere Av");
        owner1.setCity("Burnany");
        owner1.setTelephone("604 000 0000");
        ownerService.save(owner2);

        Pet anaPet = new Pet();
        anaPet.setPetType(savedCatPetType);
        anaPet.setOwner(owner2);
        anaPet.setBirthDate(LocalDate.now());
        anaPet.setName("Tapioca");
        owner2.getPets().add(anaPet);

        Visit anaPetVisit = new Visit();
        anaPetVisit.setPet(anaPet);
        anaPetVisit.setDate(LocalDate.now());
        anaPetVisit.setDescription("Ana's Cat Visit");

        System.out.println("Loaded Owners ...");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Vet vet1 = new Vet();
        vet1.setFirstName("Inga");
        vet1.setLastName("Kirata");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Miuki");
        vet2.setLastName("Yabuza");
        vet1.getSpecialities().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");
    }
}
