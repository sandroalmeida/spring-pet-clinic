package info.sandroalmeida.springpetclinic.repositories;

import info.sandroalmeida.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sandro on 31/01/19
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
