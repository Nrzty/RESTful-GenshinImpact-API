package br.com.nrzty.GenshinImpactAPI.utils.mappers;

import br.com.nrzty.GenshinImpactAPI.adapters.inbound.dto.CharacterDTO;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterMapper {
    public static CharacterDTO toDTO(CharacterEntity characterEntity) {
        return new CharacterDTO(
                characterEntity.getName(),
                characterEntity.getRegion(),
                characterEntity.getVision(),
                characterEntity.getWeaponType(),
                characterEntity.getRarity()
        );
    }

    public static List<CharacterDTO> toDTOList(List<CharacterEntity> entities){
        return entities.stream()
                .map(CharacterMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static CharacterEntity toEntity(CharacterDTO dto) {
        CharacterEntity characterEntity = new CharacterEntity();

        characterEntity.setName(dto.getName());
        characterEntity.setRegion(dto.getRegion());
        characterEntity.setVision(dto.getVision());
        characterEntity.setWeaponType(dto.getWeaponType());
        characterEntity.setRarity(dto.getRarity());

        return characterEntity;
    }
}
