package ru.gindemit.bestiarydnd.mapper;

import org.springframework.stereotype.Component;
import ru.gindemit.bestiarydnd.dto.request.CreaturePostRequest;
import ru.gindemit.bestiarydnd.model.Creature;

@Component
public class RequestMapper {
    public Creature requestToCreature(CreaturePostRequest request){
        return requestToCreature(request, new Creature());
    }

    public Creature requestToCreature(CreaturePostRequest request, Creature creature){
        creature.setCreatureName(request.getCreatureName());
        creature.setCreatureDescription(request.getCreatureDescription());
        creature.setCreatureSize(request.getCreatureSize());
        creature.setCreatureType(request.getCreatureType());
        creature.setCreatureDangerIndicator(request.getCreatureDangerIndicator());
        return creature;
    }
}
