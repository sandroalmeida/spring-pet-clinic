package info.sandroalmeida.springpetclinic.services;

import info.sandroalmeida.springpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by sandro on 14/01/19
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
