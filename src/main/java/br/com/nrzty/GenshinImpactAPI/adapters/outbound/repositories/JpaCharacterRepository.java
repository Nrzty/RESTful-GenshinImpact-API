package br.com.nrzty.GenshinImpactAPI.adapters.outbound.repositories;

import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {

}
