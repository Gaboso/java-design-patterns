package com.github.gaboso.structure.bridge.implementor;

import com.github.gaboso.structure.bridge.abstraction.Printer;
import com.github.gaboso.structure.bridge.entity.Detail;
import com.github.gaboso.structure.bridge.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));

        return details;
    }

}
