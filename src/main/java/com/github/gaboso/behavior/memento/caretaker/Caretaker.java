package com.github.gaboso.behavior.memento.caretaker;

import com.github.gaboso.behavior.memento.memento.EmployeeMemento;
import com.github.gaboso.behavior.memento.originator.Employee;

import java.util.Stack;

public class Caretaker {

    private final Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }

}
