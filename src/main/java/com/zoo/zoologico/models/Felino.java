package com.zoo.zoologico.models;

public class Felino extends Mamifero{
    public Felino() {
        super();
        super.setOrden("Carnívoros");
    }

    @Override
    public String comer() {
        return "Los felinos comen carne";
    }

    @Override
    public String dormir() {
        return "Los felinos duermen mucho";
    }

    @Override
    public String correr() {
        return "Los felinos corren";
    }

    @Override
    public String comunicar() {
        return "Los felinos ronronean";
    }
}
