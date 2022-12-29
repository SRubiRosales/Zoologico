package com.zoo.zoologico.models;

public class Mamifero extends Animal{
    public Mamifero() {
        super();
        super.setFamilia("Mamíferos");
    }

    @Override
    public String comer() {
        return "Los mamíferos comen";
    }

    @Override
    public String dormir() {
        return "Los mamíferos duermen";
    }

    @Override
    public String correr() {
        return "Los mamíferos corren";
    }

    @Override
    public String comunicar() {
        return "Los mamíferos emiten sonidos";
    }
}
