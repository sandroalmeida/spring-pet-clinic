package info.sandroalmeida.springpetclinic.model;

/**
 * Created by sandro on 20/01/19
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
