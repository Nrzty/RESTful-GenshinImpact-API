package br.com.nrzty.GenshinImpactAPI.application.service;

import br.com.nrzty.GenshinImpactAPI.application.useCases.CharacterUseCases;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import org.springframework.stereotype.Service;

import java.util.List;

//TODO ADICIONAR OS MÉTODOS À CLASSE
@Service
public class CharacterServiceImpl implements CharacterUseCases {


    @Override
    public CharacterEntity createCharacter(CharacterEntity character) {
        return null;
    }

    @Override
    public List<CharacterEntity> listCharacters() {
        return List.of();
    }

    @Override
    public void deleteCharacter(Long id) {

    }

    @Override
    public CharacterEntity getCharacterById(Long id) {
        return null;
    }

    @Override
    public CharacterEntity updateCharacter(Long id, CharacterEntity character) {
        return null;
    }
}
