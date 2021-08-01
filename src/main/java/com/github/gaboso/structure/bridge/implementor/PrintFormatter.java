package com.github.gaboso.structure.bridge.implementor;

import com.github.gaboso.structure.bridge.abstraction.Formatter;
import com.github.gaboso.structure.bridge.entity.Detail;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        var builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail : details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }

}
