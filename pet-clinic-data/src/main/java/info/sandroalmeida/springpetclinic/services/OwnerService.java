package info.sandroalmeida.springpetclinic.services;

import info.sandroalmeida.springpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by sandro on 14/01/19
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
