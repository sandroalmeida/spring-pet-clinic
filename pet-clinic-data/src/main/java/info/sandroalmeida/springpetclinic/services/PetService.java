package info.sandroalmeida.springpetclinic.services;

import info.sandroalmeida.springpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by sandro on 14/01/19
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
