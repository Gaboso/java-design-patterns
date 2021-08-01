package com.github.gaboso.structure.bridge.abstraction;

import com.github.gaboso.structure.bridge.entity.Detail;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();

}
