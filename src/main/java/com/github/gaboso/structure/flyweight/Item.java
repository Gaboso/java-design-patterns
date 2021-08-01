package com.github.gaboso.structure.flyweight;

//Instances of Item will be the Flyweights
class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}