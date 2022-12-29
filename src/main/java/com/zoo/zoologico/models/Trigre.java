package com.zoo.zoologico.models;

public class Trigre extends Felino{
    public Trigre() {
        super();
        super.setNombreCientifico("Panthera tigris");
        super.setEdadPromedio("8 a 10 años");
    }

    @Override
    public String comer() {
        return "Los tigres comen carne";
    }

    @Override
    public String dormir() {
        return "Los tigres duermen mucho";
    }

    @Override
    public String correr() {
        return "Los tigres corren";
    }

    @Override
    public String comunicar() {
        return "Los tigres rugen";
    }
}
