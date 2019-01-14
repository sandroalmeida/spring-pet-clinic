package info.sandroalmeida.springpetclinic.services;

import java.util.Set;

/**
 * Created by sandro on 14/01/19
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
