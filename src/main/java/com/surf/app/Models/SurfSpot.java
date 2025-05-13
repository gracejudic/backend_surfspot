package com.surf.app.Models;

import java.sql.Date;


import com.surf.app.Enum.SurfBreak;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class SurfSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String adress;
    private int difficultyLevel;
    private SurfBreak surfBreak;
    private String photoUrl;
    private Date seasonStart;
    private Date seasonEnd;

    public SurfSpot(int Id, String name, String adress, int difficultyLevel, SurfBreak surfBreak, String photoUrl, Date seasonStart, Date seasonEnd) {
        this.Id = Id;
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.surfBreak = surfBreak;
        this.photoUrl = photoUrl;
        this.seasonStart = seasonStart;
        this.seasonEnd = seasonEnd;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public SurfBreak getSurfBreak() {
        return surfBreak;
    }

    public void setSurfBreak(SurfBreak surfBreak) {
        this.surfBreak = surfBreak;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(Date seasonStart) {
        this.seasonStart = seasonStart;
    }

    public Date getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(Date seasonEnd) {
        this.seasonEnd = seasonEnd;
    }


}
