package info.sandroalmeida.springpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by sandro on 20/01/19
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "especialities")
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;

}
