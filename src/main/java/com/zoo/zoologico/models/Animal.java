package com.zoo.zoologico.models;

public class Animal {
    private String reino;
    private String filo;
    private String nombreCientifico;
    private String orden;
    private String familia;
    private String edadPromedio;

    public Animal() {
        this.reino = "Animalia";
        this.filo = "Chordata";
    }

    public Animal(String reino, String filo, String nombreCientifico, String orden, String familia, String edadPromedio) {
        this.reino = reino;
        this.filo = filo;
        this.nombreCientifico = nombreCientifico;
        this.orden = orden;
        this.familia = familia;
        this.edadPromedio = edadPromedio;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEdadPromedio() {
        return edadPromedio;
    }

    public void setEdadPromedio(String edadPromedio) {
        this.edadPromedio = edadPromedio;
    }

    public String comer() {
        return "el animal come";
    }

    public String dormir() {
        return "el animal duerme";
    }

    public String correr() {
        return "el animal corre";
    }

    public String comunicar() {
        return "el animal hace sonidos";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", filo='" + filo + '\'' +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", orden='" + orden + '\'' +
                ", familia='" + familia + '\'' +
                ", edadPromedio='" + edadPromedio + '\'' +
                comer() + " " + dormir() + " " + correr() + " " + comunicar() +
                '}';
    }
}
