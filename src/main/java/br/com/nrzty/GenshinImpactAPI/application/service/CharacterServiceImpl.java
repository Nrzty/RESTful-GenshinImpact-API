package br.com.nrzty.GenshinImpactAPI.application.service;

import br.com.nrzty.GenshinImpactAPI.application.useCases.CharacterUseCases;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterUseCases {

    private CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public CharacterEntity createCharacter(CharacterEntity character) {
        return characterRepository.createCharacter(character);
    }

    @Override
    public List<CharacterEntity> listCharacters() {
        return characterRepository.listCharacters();
    }

    @Override
    public void deleteCharacter(Long id) {
        characterRepository.deleteCharacter(id);
    }

    @Override
    public CharacterEntity getCharacterById(Long id) {
        return characterRepository.getCharacterById(id);
    }

    @Override
    public CharacterEntity updateCharacter(Long id, CharacterEntity character) {
        return characterRepository.updateCharacter(id, character);
    }
}
