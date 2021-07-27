package com.github.gaboso.behavior.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            var largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
        }

        bikes[index] = bike;
        index++;

    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
