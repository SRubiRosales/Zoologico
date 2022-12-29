package com.zoo.zoologico.models;

public class PerroSalvaje extends Canino {
    public PerroSalvaje() {
        super();
        super.setNombreCientifico("Cuon alpinus");
        super.setEdadPromedio("11 años");
    }

    @Override
    public String comer() {
        return "Los perros salvajes comen carne";
    }

    @Override
    public String dormir() {
        return "Los perros salvajes duermen mucho";
    }

    @Override
    public String correr() {
        return "Los perros salvajes corren";
    }

    @Override
    public String comunicar() {
        return "Los perros salvajes rugen";
    }
}
