package com.zoo.zoologico.models;

public class Leon extends Felino {
    public Leon() {
        super();
        super.setNombreCientifico("Panthera Leo");
        super.setEdadPromedio("12 a 16 años");
    }

    @Override
    public String comer() {
        return "Los leones comen carne";
    }

    @Override
    public String dormir() {
        return "Los leones duermen mucho";
    }

    @Override
    public String correr() {
        return "Los leones corren";
    }

    @Override
    public String comunicar() {
        return "Los leones rugen";
    }
}
