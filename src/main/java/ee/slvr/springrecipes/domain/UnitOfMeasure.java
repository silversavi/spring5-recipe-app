package ee.slvr.springrecipes.domain;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter//@Data might cause problems -> change to @Getter and @Setter
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
