package br.com.nrzty.GenshinImpactAPI.Character.service;

import br.com.nrzty.GenshinImpactAPI.Character.model.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.Character.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    @Autowired
    CharacterRepository characterRepository;

    public CharacterEntity createCharacter(CharacterEntity character) {
        return characterRepository.save(character);
    }
}
