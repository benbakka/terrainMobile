package com.emsi.geo.beans;

import java.io.Serializable;

public class Restaurant implements Serializable {
    private String nom;
    private String adresse;
    private String description;
    private Float latitude;
    private Float longitude;
    private String heure_open;
    private String heure_close;
    private boolean weekend;

    public Restaurant(String nom, String adresse, String description, Float latitude, Float longitude, String heure_open, String heure_close, boolean weekend) {
        this.nom = nom;
        this.adresse = adresse;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.heure_open = heure_open;
        this.heure_close = heure_close;
        this.weekend = weekend;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getHeure_open() {
        return heure_open;
    }

    public void setHeure_open(String heure_open) {
        this.heure_open = heure_open;
    }

    public String getHeure_close() {
        return heure_close;
    }

    public void setHeure_close(String heure_close) {
        this.heure_close = heure_close;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
