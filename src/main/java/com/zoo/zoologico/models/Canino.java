package com.zoo.zoologico.models;

public class Canino extends Mamifero {
    public Canino() {
        super();
        super.setOrden("Carnívoros");
    }

    @Override
    public String comer() {
        return "Los caninos comen carne";
    }

    @Override
    public String dormir() {
        return "Los caninos duermen";
    }

    @Override
    public String correr() {
        return "Los caninos corren";
    }

    @Override
    public String comunicar() {
        return "Los caninos ladran";
    }
}
