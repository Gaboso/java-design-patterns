package com.github.gaboso.creation.factorymethod.website;

import com.github.gaboso.creation.factorymethod.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }

}
