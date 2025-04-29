package br.com.nrzty.GenshinImpactAPI.Character.controller;

import br.com.nrzty.GenshinImpactAPI.Character.model.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.Character.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<List<CharacterEntity>> listAllCharacters(){
        List<CharacterEntity> characters = characterService.listCharacters();
        return ResponseEntity.ok().body(characters);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterEntity> getCharacterById(@PathVariable Long id){
        return ResponseEntity.ok().body(characterService.getCharacterById(id));
    }

    @PostMapping("/character")
    public ResponseEntity<CharacterEntity> addCharacter(@RequestBody CharacterEntity character) {
        characterService.createCharacter(character);
        return ResponseEntity.status(201).body(character);
    }

    @PostMapping("/{id}")
    public ResponseEntity<CharacterEntity> updateCharacter(@PathVariable Long id, @RequestBody CharacterEntity character) {
        characterService.updateCharacter(id, character);
        return ResponseEntity.ok(character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id){
        characterService.deleteCharacter(id);
    }
}
