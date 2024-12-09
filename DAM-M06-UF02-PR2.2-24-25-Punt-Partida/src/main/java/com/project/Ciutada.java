package com.project;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Ciutada implements Serializable {
    
    public long ciutadaId;

    public Ciutat ciutat;

    public String nom;

    public String cognom;

    public int edat;

    public Ciutada() {}

    public Ciutada(String nom, String cognom, int edat){
        this.ciutat = null;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public void setCiutadaId(long ciutadaId) {
        this.ciutadaId = ciutadaId;
    }
    public void setCiutat(Ciutat ciutat) {
        this.ciutat = ciutat;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public long getCiutadaId() {
        return ciutadaId;
    }
    public Ciutat getCiutat() {
        return ciutat;
    }
    public String getCognom() {
        return cognom;
    }
    public int getEdat() {
        return edat;
    }
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return this.getCiutadaId() + ": " + this.getNom() + ", " + this.getCognom() + ", " + this.getEdat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Ciutada ciutada = (Ciutada) o;
        return ciutadaId == ciutada.ciutadaId;
    }
    @Override
    public int hashCode() {
        return Long.hashCode(ciutadaId);
    }

}
