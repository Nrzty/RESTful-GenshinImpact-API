package br.com.nrzty.GenshinImpactAPI.domain.artifact;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "artifact")
public class ArtifactEntity {

    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    private String setName;

    @NotBlank
    private String bonus2Pieces;

    @NotBlank
    private String bonus4Pieces;

    @Min(4)
    @Max(5)
    private int rarity;

    @Enumerated(EnumType.STRING)
    private ArtifactType artifactType;

    public ArtifactEntity() {

    }

    public ArtifactEntity(long id, String setName, String bonus2Pieces, String bonus4Pieces, int rarity, ArtifactType artifactType) {
        this.id = id;
        this.setName = setName;
        this.bonus2Pieces = bonus2Pieces;
        this.bonus4Pieces = bonus4Pieces;
        this.rarity = rarity;
        this.artifactType = artifactType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getBonus2Pieces() {
        return bonus2Pieces;
    }

    public void setBonus2Pieces(String bonus2Pieces) {
        this.bonus2Pieces = bonus2Pieces;
    }

    public String getBonus4Pieces() {
        return bonus4Pieces;
    }

    public void setBonus4Pieces(String bonus4Pieces) {
        this.bonus4Pieces = bonus4Pieces;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public ArtifactType getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
    }
}
