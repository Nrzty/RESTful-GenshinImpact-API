package br.com.nrzty.GenshinImpactAPI.Character.model;

import br.com.nrzty.GenshinImpactAPI.weapon.WeaponType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Characters")
public class CharacterEntity {

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

    public CharacterEntity() {

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
