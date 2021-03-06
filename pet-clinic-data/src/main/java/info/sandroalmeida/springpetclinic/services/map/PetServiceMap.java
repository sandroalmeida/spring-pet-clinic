package info.sandroalmeida.springpetclinic.services.map;

import info.sandroalmeida.springpetclinic.model.Pet;
import info.sandroalmeida.springpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by sandro on 14/01/19
 */

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
