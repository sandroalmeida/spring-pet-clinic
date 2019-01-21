package info.sandroalmeida.springpetclinic.model;

import java.util.Set;

/**
 * Created by sandro on 09/01/19
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
