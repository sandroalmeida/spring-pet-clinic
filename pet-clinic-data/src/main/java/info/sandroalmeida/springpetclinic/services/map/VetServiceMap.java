package info.sandroalmeida.springpetclinic.services.map;

import info.sandroalmeida.springpetclinic.model.Vet;
import info.sandroalmeida.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by sandro on 14/01/19
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
