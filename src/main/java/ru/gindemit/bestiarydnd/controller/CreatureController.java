package ru.gindemit.bestiarydnd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gindemit.bestiarydnd.dto.request.CreaturePostRequest;
import ru.gindemit.bestiarydnd.service.CreatureService;

import java.io.FileNotFoundException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/creatures")
public class CreatureController {
    private final CreatureService creatureService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getClaimbyId(@PathVariable Long id) throws FileNotFoundException {
        return ResponseEntity.ok(creatureService.getCreatureById(id));
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity<?> createCreature(@RequestBody CreaturePostRequest request) {
        return ResponseEntity.ok(creatureService.createCreature(request));
    }

}
