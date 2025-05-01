package br.com.nrzty.GenshinImpactAPI.application.service;

import br.com.nrzty.GenshinImpactAPI.application.useCases.CharacterUseCases;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.adapters.outbound.repositories.JpaCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService implements CharacterUseCases {


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
    public CharacterEntity updateCharacter(CharacterEntity character) {
        return null;
    }
}
