package com.github.gaboso.creation.factorymethod.website;

import com.github.gaboso.creation.factorymethod.pages.AboutPage;
import com.github.gaboso.creation.factorymethod.pages.CommentPage;
import com.github.gaboso.creation.factorymethod.pages.ContactPage;
import com.github.gaboso.creation.factorymethod.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }

}
