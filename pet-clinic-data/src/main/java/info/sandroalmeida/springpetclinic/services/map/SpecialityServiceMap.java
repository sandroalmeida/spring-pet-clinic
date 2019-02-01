package info.sandroalmeida.springpetclinic.services.map;

import info.sandroalmeida.springpetclinic.model.Speciality;
import info.sandroalmeida.springpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by sandro on 22/01/19
 */

@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends AbstractServiceMap<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
