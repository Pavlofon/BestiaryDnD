package ru.gindemit.bestiarydnd.dto.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreaturePostRequest {
    private String creatureSize;
    private String creatureType;
    private int creatureDangerIndicator;
    private String creatureName;
    private String creatureDescription;
}
