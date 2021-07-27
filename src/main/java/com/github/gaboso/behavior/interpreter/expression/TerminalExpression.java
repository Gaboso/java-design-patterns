package com.github.gaboso.behavior.interpreter.expression;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        var tokenizer = new StringTokenizer(context);

        while (tokenizer.hasMoreTokens()) {
            String test = tokenizer.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }

        return false;
    }
}
