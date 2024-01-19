package ru.gindemit.bestiarydnd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gindemit.bestiarydnd.dto.request.CreaturePostRequest;
import ru.gindemit.bestiarydnd.mapper.RequestMapper;
import ru.gindemit.bestiarydnd.model.Creature;
import ru.gindemit.bestiarydnd.repository.CreatureRepository;

import java.io.FileNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CreatureService {
    private final CreatureRepository creatureRepository;
    private final RequestMapper mapper;

    public Creature getCreatureById(Long id) throws FileNotFoundException {
        return creatureRepository.findById(id).orElseThrow(()-> new FileNotFoundException("Creature no found"));
    }

    public List<Creature> getAllCreature(){
        return creatureRepository.findAll();
    }

    public Creature createCreature(CreaturePostRequest request){
        Creature creature = mapper.requestToCreature(request);
        creature = creatureRepository.save(creature);
        return creature;
    }

    public String deleteCreature(Long id) throws FileNotFoundException {
        creatureRepository.delete(getCreatureById(id));
        return "Creature with" + id + " deleted";
    }

}
