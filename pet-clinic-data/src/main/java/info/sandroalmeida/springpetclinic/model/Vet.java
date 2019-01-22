package info.sandroalmeida.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sandro on 09/01/19
 */
public class Vet extends Person{

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
