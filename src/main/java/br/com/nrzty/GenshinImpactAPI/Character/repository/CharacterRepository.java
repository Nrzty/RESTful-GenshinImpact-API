package br.com.nrzty.GenshinImpactAPI.Character.repository;

import br.com.nrzty.GenshinImpactAPI.Character.model.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {

}
