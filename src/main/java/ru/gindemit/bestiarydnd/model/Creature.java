package ru.gindemit.bestiarydnd.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "creatures")
@ToString
public class Creature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String creatureSize;
    private String creatureType;
    private int creatureDangerIndicator;
    private String creatureName;
    private String creatureDescription;

}
