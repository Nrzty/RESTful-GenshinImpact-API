package br.com.nrzty.GenshinImpactAPI.adapters.inbound.controller;

import br.com.nrzty.GenshinImpactAPI.adapters.inbound.assembler.CharacterModelAssembler;
import br.com.nrzty.GenshinImpactAPI.adapters.inbound.dto.CharacterDTO;
import br.com.nrzty.GenshinImpactAPI.application.useCases.CharacterUseCases;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.application.service.CharacterServiceImpl;
import br.com.nrzty.GenshinImpactAPI.utils.mappers.CharacterMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/character")
public class CharacterController {

    private final CharacterUseCases characterUseCases;
    private final CharacterModelAssembler characterAssembler;

    public CharacterController(CharacterUseCases characterUseCases, CharacterModelAssembler characterAssembler) {
        this.characterUseCases = characterUseCases;
        this.characterAssembler = characterAssembler;
    }

    @GetMapping
    public ResponseEntity<List<CharacterDTO>> listAllCharacters(){
        List<CharacterEntity> characters = characterUseCases.listCharacters();

        List<CharacterDTO> characterDTOS = characters.stream().map(characterAssembler::toModel).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(characterDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterDTO> getCharacterById(@PathVariable Long id){
        CharacterEntity character = characterUseCases.getCharacterById(id);
        return ResponseEntity.status(HttpStatus.OK).body(characterAssembler.toModel(character));
    }

    @PostMapping()
    public ResponseEntity<CharacterDTO> addCharacter(@RequestBody CharacterDTO characterDTO) {
        CharacterEntity createdCharacter = characterUseCases.createCharacter(CharacterMapper.toEntity(characterDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body(CharacterMapper.toDTO(createdCharacter));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CharacterDTO> updateCharacter(@PathVariable Long id, @RequestBody CharacterDTO characterDTO) {
        CharacterEntity updatedCharacter = characterUseCases.updateCharacter(id, CharacterMapper.toEntity(characterDTO));
        return ResponseEntity.status(HttpStatus.OK).body(CharacterMapper.toDTO(updatedCharacter));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id){
        characterUseCases.deleteCharacter(id);
        return ResponseEntity.noContent().build();
    }
}
