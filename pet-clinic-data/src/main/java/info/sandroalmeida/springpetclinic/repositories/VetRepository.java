package info.sandroalmeida.springpetclinic.repositories;

import info.sandroalmeida.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sandro on 31/01/19
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
