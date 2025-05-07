package br.com.nrzty.GenshinImpactAPI.domain.character;

import br.com.nrzty.GenshinImpactAPI.adapters.outbound.entities.JpaCharacterEntity;
import br.com.nrzty.GenshinImpactAPI.domain.weapon.WeaponType;


public class CharacterEntity {

    private Long id;

    private String name;

    private CharacterRegion region;

    private CharacterVision vision;

    private int rarity;

    private WeaponType weaponType;

    public CharacterEntity() {

    }

    public CharacterEntity(JpaCharacterEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.region = entity.getRegion();
        this.vision = entity.getVision();
        this.rarity = entity.getRarity();
        this.weaponType = entity.getWeaponType();
    }

    public CharacterEntity(Long id, String name, CharacterRegion region, CharacterVision vision, int rarity, WeaponType weaponType) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.vision = vision;
        this.rarity = rarity;
        this.weaponType = weaponType;
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
