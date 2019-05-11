package info.sandroalmeida.springpetclinic.services;

import info.sandroalmeida.springpetclinic.model.Owner;

import java.util.List;

/**
 * Created by sandro on 14/01/19
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
