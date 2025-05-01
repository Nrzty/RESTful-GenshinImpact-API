package br.com.nrzty.GenshinImpactAPI.adapters.outbound.repositories;

import br.com.nrzty.GenshinImpactAPI.adapters.outbound.entities.JpaCharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCharacterRepository extends JpaRepository<JpaCharacterEntity, Long> {

}
