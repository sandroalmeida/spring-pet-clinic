package info.sandroalmeida.springpetclinic.bootstrap;

import info.sandroalmeida.springpetclinic.model.Owner;
import info.sandroalmeida.springpetclinic.model.Vet;
import info.sandroalmeida.springpetclinic.services.OwnerService;
import info.sandroalmeida.springpetclinic.services.VetService;
import info.sandroalmeida.springpetclinic.services.map.OwnerServiceMap;
import info.sandroalmeida.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by sandro on 15/01/19
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Sandro");
        owner1.setLastName("Almeida");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ana");
        owner2.setLastName("Lins");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Inga");
        vet1.setLastName("Kirata");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Miuki");
        vet2.setLastName("Yabuza");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");


    }
}
