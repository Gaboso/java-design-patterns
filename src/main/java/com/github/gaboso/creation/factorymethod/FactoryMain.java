package com.github.gaboso.creation.factorymethod;

import com.github.gaboso.creation.factorymethod.website.Website;
import com.github.gaboso.creation.factorymethod.website.WebsiteFactory;
import com.github.gaboso.creation.factorymethod.website.WebsiteType;

public class FactoryMain {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }

}
