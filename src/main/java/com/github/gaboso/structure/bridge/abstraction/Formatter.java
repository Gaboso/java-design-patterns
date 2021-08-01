package com.github.gaboso.structure.bridge.abstraction;

import com.github.gaboso.structure.bridge.entity.Detail;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);

}

