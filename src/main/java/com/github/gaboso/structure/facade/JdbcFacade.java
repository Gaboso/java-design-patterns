package com.github.gaboso.structure.facade;

import com.github.gaboso.structure.facade.subsystem.DbSingleton;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        var count = 0;
        try (
            Connection connection = instance.getConnection();
            var statement = connection.createStatement();
        ) {
            count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        var count = 0;

        try (
            var connection = instance.getConnection();
            var statement = connection.createStatement();
        ) {
            count = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some street', 'Layton')");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try (
            var connection = instance.getConnection();
            var statement = connection.createStatement();
            var resultSet = statement.executeQuery("SELECT * FROM Address");
        ) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                var address = new Address();
                address.setId(resultSet.getString(1));
                address.setStreetName(resultSet.getString(2));
                address.setCity(resultSet.getString(3));

                addresses.add(address);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return addresses;
    }
}


class Address {

    private String id;
    private String streetName;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
