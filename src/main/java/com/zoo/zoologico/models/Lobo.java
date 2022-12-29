package com.zoo.zoologico.models;

public class Lobo extends Canino {
    public Lobo() {
        super();
        super.setNombreCientifico("Canus lupus");
        super.setEdadPromedio("16 años");
    }

    @Override
    public String comer() {
        return "Los lobos comen carne";
    }

    @Override
    public String dormir() {
        return "Los lobos duermen";
    }

    @Override
    public String correr() {
        return "Los lobos corren";
    }

    @Override
    public String comunicar() {
        return "Los lobos ahuyan";
    }
}
