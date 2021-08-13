package com.github.gaboso.structure.adapter.client;

import com.github.gaboso.structure.adapter.adapter.Employee;
import com.github.gaboso.structure.adapter.adapter.EmployeeAdapterCSV;
import com.github.gaboso.structure.adapter.adapter.EmployeeAdapterLdap;
import com.github.gaboso.structure.adapter.entity.EmployeeCSV;
import com.github.gaboso.structure.adapter.entity.EmployeeDB;
import com.github.gaboso.structure.adapter.entity.legacy.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);

        var employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        var employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }

}
