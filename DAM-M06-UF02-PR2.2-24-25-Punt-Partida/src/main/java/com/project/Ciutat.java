package com.project;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Ciutat implements Serializable {
    
    public long ciutatId;

    public String nom;

    public String pais;

    public int poblacio;

    public Set<Ciutada> ciutadans = new HashSet<>();

    public Ciutat(){}

    public Ciutat(String nom, String pais, int codiPostal){
        this.nom = nom;
        this.pais = pais;
        this.poblacio = codiPostal;
    }

    public void setCiutadans(Set<Ciutada> ciutadans) {
        if (ciutadans != null) {
            ciutadans.forEach(this::addCiutada);
        }
    }
    public void setCiutatId(long ciutatId) {
        this.ciutatId = ciutatId;
    }
    public void setPoblacio(int codiPostal) {
        this.poblacio = codiPostal;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Set<Ciutada> getCiutadans() {
        return ciutadans;
    }
    public long getCiutatId() {
        return ciutatId;
    }
    public int getPoblacio() {
        return poblacio;
    }
    public String getNom() {
        return nom;
    }
    public String getPais() {
        return pais;
    }

    public void addCiutada(Ciutada ciutada) {
        ciutadans.add(ciutada);
        ciutada.setCiutat(this);
    }

    public void removeCiutada(Ciutada ciutada) {
        ciutadans.remove(ciutada);
        ciutada.setCiutat(null);    
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Ciutada ciutada : ciutadans) {
            if (str.length() > 0) {
                str.append(" | ");
            }
            str.append(ciutada.getNom());
        }
        return this.getCiutatId() + ": " + this.getNom() +", "+ this.getPais()+ ", "+ this.getPoblacio()+ ", ciutadans: [" + str + "]";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Ciutat ciutat = (Ciutat) o;
        return ciutatId == ciutat.ciutatId;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(ciutatId);
    }
}
