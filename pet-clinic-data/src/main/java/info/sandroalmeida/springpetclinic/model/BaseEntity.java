package info.sandroalmeida.springpetclinic.model;

import java.io.Serializable;

/**
 * Created by sandro on 14/01/19
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
