package com.github.gaboso.structure.bridge;

import com.github.gaboso.structure.bridge.abstraction.Formatter;
import com.github.gaboso.structure.bridge.abstraction.Printer;
import com.github.gaboso.structure.bridge.entity.Movie;
import com.github.gaboso.structure.bridge.implementor.HtmlFormatter;
import com.github.gaboso.structure.bridge.implementor.MoviePrinter;
import com.github.gaboso.structure.bridge.implementor.PrintFormatter;

public class BridgeMain {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();

        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
    }

}
