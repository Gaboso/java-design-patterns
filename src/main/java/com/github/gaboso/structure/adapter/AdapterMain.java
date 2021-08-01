package com.github.gaboso.structure.adapter;

import com.github.gaboso.structure.adapter.adapter.Employee;
import com.github.gaboso.structure.adapter.client.EmployeeClient;

import java.util.List;

public class AdapterMain {

    public static void main(String[] args) {
        var client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }

}
