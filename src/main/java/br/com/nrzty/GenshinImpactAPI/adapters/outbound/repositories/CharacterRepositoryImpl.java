package br.com.nrzty.GenshinImpactAPI.adapters.outbound.repositories;

import br.com.nrzty.GenshinImpactAPI.adapters.outbound.entities.JpaCharacterEntity;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CharacterRepositoryImpl implements CharacterRepository {

    private final JpaCharacterRepository jpaCharacterRepository;

    public CharacterRepositoryImpl(JpaCharacterRepository jpaCharacterRepository) {
        this.jpaCharacterRepository = jpaCharacterRepository;
    }

    @Override
    public CharacterEntity createCharacter(CharacterEntity characterEntity) {
        JpaCharacterEntity jpaCharacterEntity = new JpaCharacterEntity(characterEntity);
        JpaCharacterEntity characterCreated = jpaCharacterRepository.save(jpaCharacterEntity);

        return new CharacterEntity(characterCreated);
    }

    @Override
    public List<CharacterEntity> listCharacters() {
        return this.jpaCharacterRepository.findAll()
                .stream()
                .map(character -> new CharacterEntity(
                        character.getId(),
                        character.getName(),
                        character.getRegion(),
                        character.getVision(),
                        character.getRarity(),
                        character.getWeaponType()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCharacter(Long id) {
        this.jpaCharacterRepository.deleteById(id);
    }

    @Override
    public CharacterEntity getCharacterById(Long id) {
        JpaCharacterEntity jpaCharacterEntity = this.jpaCharacterRepository.findById(id)
                .orElseThrow(() ->  new RuntimeException("Character not found!"));

        return new CharacterEntity(
                jpaCharacterEntity.getId(),
                jpaCharacterEntity.getName(),
                jpaCharacterEntity.getRegion(),
                jpaCharacterEntity.getVision(),
                jpaCharacterEntity.getRarity(),
                jpaCharacterEntity.getWeaponType());
    }

    @Override
    public CharacterEntity updateCharacter(Long id, CharacterEntity characterEntity) {
        JpaCharacterEntity existingCharacter = this.jpaCharacterRepository.findById(id)
                .orElseThrow(() ->  new RuntimeException("Character not found!"));

        existingCharacter.setName(characterEntity.getName());
        existingCharacter.setRegion(characterEntity.getRegion());
        existingCharacter.setVision(characterEntity.getVision());
        existingCharacter.setRarity(characterEntity.getRarity());
        existingCharacter.setWeaponType(characterEntity.getWeaponType());

        JpaCharacterEntity updatedCharacterEntity = this.jpaCharacterRepository.save(existingCharacter);

        return new CharacterEntity(
                updatedCharacterEntity.getId(),
                updatedCharacterEntity.getName(),
                updatedCharacterEntity.getRegion(),
                updatedCharacterEntity.getVision(),
                updatedCharacterEntity.getRarity(),
                updatedCharacterEntity.getWeaponType()
        );
    }
}
