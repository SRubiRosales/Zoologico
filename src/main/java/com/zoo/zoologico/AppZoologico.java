package com.zoo.zoologico;

import com.zoo.zoologico.models.*;

import java.util.HashMap;
import java.util.Map;

public class AppZoologico {
    public static void main(String[] args) {
        Map<String, Animal> animalesZoologico = new HashMap<>();
        //Instanciacion de clases
        Lobo lobo = new Lobo();
        PerroSalvaje perroSalvaje = new PerroSalvaje();
        Trigre tigre = new Trigre();
        Leon leon = new Leon();

        //Se agregan los animales al collection
        animalesZoologico.put("lobo", lobo);
        animalesZoologico.put("perroSalvaje", perroSalvaje);
        animalesZoologico.put("tigre", tigre);
        animalesZoologico.put("leon", leon);

        //Se imprime en consola la informacion de los animales
        animalesZoologico.forEach((s, animal) -> System.out.println(animal));
    }
}
