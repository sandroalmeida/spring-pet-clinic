package info.sandroalmeida.springpetclinic.repositories;

import info.sandroalmeida.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sandro on 31/01/19
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
