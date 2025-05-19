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
    private long Id;
    private String name;
    private String address;
    private int difficultyLevel;
    private SurfBreak surfBreak;
    private String photoUrl;
    private Date seasonStart;
    private Date seasonEnd;
    private double longitude;
    private double latitude;
    
    public SurfSpot() {
        // Constructeur par défaut requis par JPA
    }

    public SurfSpot(long Id, String name, String address, int difficultyLevel, SurfBreak surfBreak, String photoUrl, Date seasonStart, Date seasonEnd, double longitude, double latitude) {
        this.Id = Id;
        this.name = name;
        this.address= address;
        this.difficultyLevel = difficultyLevel;
        this.surfBreak = surfBreak;
        this.photoUrl = photoUrl;
        this.seasonStart = seasonStart;
        this.seasonEnd = seasonEnd;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


}
