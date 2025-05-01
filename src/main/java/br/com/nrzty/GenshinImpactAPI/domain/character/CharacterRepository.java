package br.com.nrzty.GenshinImpactAPI.domain.character;

import java.util.List;

public interface CharacterRepository {

    CharacterEntity createCharacter(CharacterEntity characterEntity);

    List<CharacterEntity> listCharacters();

    void deleteCharacter(Long id);

    CharacterEntity getCharacterById(Long id);

    CharacterEntity updateCharacter(Long id, CharacterEntity characterEntity);
}
