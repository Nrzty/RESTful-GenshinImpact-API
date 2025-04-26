package br.com.nrzty.GenshinImpactAPI.Character.controller;

import br.com.nrzty.GenshinImpactAPI.Character.model.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.Character.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @PostMapping("/character")
    public ResponseEntity<CharacterEntity> addCharacter(@RequestBody CharacterEntity character) {
        characterService.createCharacter(character);
        return ResponseEntity.ok(character);
    }
}
