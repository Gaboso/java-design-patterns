package com.github.gaboso.behavior.interpreter;

import com.github.gaboso.behavior.interpreter.expression.AndExpression;
import com.github.gaboso.behavior.interpreter.expression.Expression;
import com.github.gaboso.behavior.interpreter.expression.OrExpression;
import com.github.gaboso.behavior.interpreter.expression.TerminalExpression;

public class InterpreterMain {

    static Expression buildInterpreterTree() {
        Expression terminalLions = new TerminalExpression("Lions");
        Expression terminalTigers = new TerminalExpression("Tigers");
        Expression terminalBears = new TerminalExpression("Bears");

        Expression alternationTigersAndBears = new AndExpression(terminalTigers, terminalBears);
        Expression lionsOrTigersAndBears = new OrExpression(terminalLions, alternationTigersAndBears);

        return new AndExpression(terminalBears, lionsOrTigersAndBears);
    }

    public static void main(String[] args) {
        String context = "Lions Bears";

        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

}
