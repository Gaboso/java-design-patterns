package com.github.gaboso.creation.factorymethod.website;

import com.github.gaboso.creation.factorymethod.pages.CartPage;
import com.github.gaboso.creation.factorymethod.pages.ItemPage;
import com.github.gaboso.creation.factorymethod.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }

}
