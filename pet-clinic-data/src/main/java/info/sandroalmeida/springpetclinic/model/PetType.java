package info.sandroalmeida.springpetclinic.model;

/**
 * Created by sandro on 09/01/19
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
