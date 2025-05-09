package br.com.nrzty.GenshinImpactAPI.adapters.outbound.entities;

import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterRegion;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterVision;
import br.com.nrzty.GenshinImpactAPI.domain.weapon.WeaponType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "characters")
public class JpaCharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @Enumerated(EnumType.STRING)
    private CharacterRegion region;

    @Enumerated(EnumType.STRING)
    private CharacterVision vision;

    @Min(value = 4)
    @Max(value = 5)
    private int rarity;

    @Enumerated(EnumType.STRING)
    private WeaponType weaponType;

    public JpaCharacterEntity(CharacterEntity characterEntity) {
        this.id = characterEntity.getId();
        this.name = characterEntity.getName();
        this.region = characterEntity.getRegion();
        this.vision = characterEntity.getVision();
        this.rarity = characterEntity.getRarity();
        this.weaponType = characterEntity.getWeaponType();
    }

    public JpaCharacterEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterRegion getRegion() {
        return region;
    }

    public void setRegion(CharacterRegion region) {
        this.region = region;
    }

    public CharacterVision getVision() {
        return vision;
    }

    public void setVision(CharacterVision vision) {
        this.vision = vision;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}

