package com.github.gaboso.behavior.visitor.with.element;

import com.github.gaboso.behavior.visitor.with.visitor.AtvPartVisitor;

public interface AtvPart {

    void accept(AtvPartVisitor visitor);

}
