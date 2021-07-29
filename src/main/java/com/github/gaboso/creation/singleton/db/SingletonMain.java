package com.github.gaboso.creation.singleton.db;

import java.sql.SQLException;

public class SingletonMain {

    public static void main(String[] args) {
        var instance = DbSingleton.getInstance();
        long timeBefore;
        long timeAfter;

        System.out.println("Instance: " + instance);

        timeBefore = System.currentTimeMillis();
        var connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println("Time spent to create 1st connection: " + (timeAfter - timeBefore) + "ms");


        try (var statement = connection.createStatement()) {
            statement
                .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created.");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println("Time spent to create 2nd connection: " + (timeAfter - timeBefore) + "ms");

        System.out.println("Connection: " + connection);

        try (
            var statement = connection.createStatement();
            var resultSet = statement.executeQuery("Select * from Address");
        ) {
            System.out.println("Result Set: "+resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
