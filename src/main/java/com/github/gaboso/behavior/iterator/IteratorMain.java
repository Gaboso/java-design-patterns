package com.github.gaboso.behavior.iterator;

import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        var bikeRepository = new BikeRepository();

        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");

        Iterator<String> bikeIterator = bikeRepository.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        for (String bike : bikeRepository) {
            System.out.println(bike);
        }
    }

}
