package com.github.gaboso.structure.bridge.implementor;

import com.github.gaboso.structure.bridge.abstraction.Formatter;
import com.github.gaboso.structure.bridge.entity.Detail;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        var builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>");
        builder.append("Classification");
        builder.append("</th>");
        builder.append("<th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail : details) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr>");
        }
        builder.append("</table>");

        return builder.toString();
    }

}
