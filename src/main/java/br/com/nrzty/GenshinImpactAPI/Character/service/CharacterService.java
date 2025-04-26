package br.com.nrzty.GenshinImpactAPI.Character.service;

import br.com.nrzty.GenshinImpactAPI.Character.model.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.Character.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    CharacterRepository characterRepository;

    public List<CharacterEntity> listCharacters(){
        return characterRepository.findAll();
    }

    public CharacterEntity createCharacter(CharacterEntity character) {
        return characterRepository.save(character);
    }

    public void deleteCharacter(CharacterEntity character) {
        characterRepository.delete(character);
    }

    public CharacterEntity getCharacterById(Long id){
        return characterRepository.findById(id).orElseThrow(() -> new RuntimeException("Character not found"));
    }

    public CharacterEntity updateCharacter(Long id, CharacterEntity character) {
        CharacterEntity characterEntity = characterRepository.findById(id).orElseThrow(() -> new RuntimeException("Character not found"));

        characterEntity.setName(character.getName());
        characterEntity.setRegion(character.getRegion());
        characterEntity.setVision(character.getVision());
        character.setRarity(character.getRarity());
        character.setWeaponType(character.getWeaponType());

        return characterRepository.save(characterEntity);
    }
}
