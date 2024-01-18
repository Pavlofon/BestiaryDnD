package ru.gindemit.bestiarydnd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gindemit.bestiarydnd.dto.request.CreaturePostRequest;
import ru.gindemit.bestiarydnd.mapper.RequestMapper;
import ru.gindemit.bestiarydnd.model.Creature;
import ru.gindemit.bestiarydnd.repository.CreatureRepository;

import java.io.FileNotFoundException;

@Service
@RequiredArgsConstructor
public class CreatureService {
    private final CreatureRepository creatureRepository;
    private final RequestMapper mapper;
    //private static Long count = 2L;

    public Creature getCreatureById(Long id) throws FileNotFoundException {
        return creatureRepository.findById(id).orElseThrow(()-> new FileNotFoundException("Creature no found"));
    }

    public Creature createCreature(CreaturePostRequest request){
        System.out.println(request);
        Creature creature = mapper.requestToCreature(request);
        System.out.println(creature);
        //creature.setId(count);
        //count++;
        creature = creatureRepository.save(creature);
        return creature;
    }

}
