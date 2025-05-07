package br.com.nrzty.GenshinImpactAPI.adapters.inbound.dto;

import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterRegion;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterVision;
import br.com.nrzty.GenshinImpactAPI.domain.weapon.WeaponType;

public class CharacterDTO {

    private String name;

    private CharacterRegion region;

    private CharacterVision vision;

    private WeaponType weaponType;

    private int rarity;

    public CharacterDTO(String name, CharacterRegion region, CharacterVision vision, WeaponType weaponType, int rarity) {
        this.name = name;
        this.region = region;
        this.vision = vision;
        this.weaponType = weaponType;
        this.rarity = rarity;
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

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
}
