package com.github.gaboso.structure.composite.composite;


import com.github.gaboso.structure.composite.component.MenuComponent;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
