package br.com.nrzty.GenshinImpactAPI.application.useCases;

import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;

import java.util.List;

public interface CharacterUseCases {

    public CharacterEntity createCharacter(CharacterEntity character);

    public List<CharacterEntity> listCharacters();

    public void deleteCharacter(Long id);

    public CharacterEntity getCharacterById(Long id);

    public CharacterEntity updateCharacter(Long id, CharacterEntity character);
}
