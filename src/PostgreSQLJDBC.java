import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgreSQLJDBC {

    public static void  databaseConnection(User newUser) {

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/edina",
                            "edina", "edina");
            //System.out.println("Opened database successfully");
            stmt = c.createStatement();

            String userData = "CREATE TABLE PERSON" +
                    "(ID INT PRIMARY KEY    NOT NULL, " +
                    " NAME           TEXT    NOT NULL, " +
                    " WEIGHT            INT     NOT NULL, " +
                    " HEIGHT            INT     NOT NULL)";
            stmt.executeUpdate(userData);

            String foodData = "CREATE TABLE FOOD " +
                    "(ID INT PRIMARY KEY     NOT NULL, " +
                    " NAME           TEXT    NOT NULL, " +
                    " FOOD_ID   INT          NOT NULL, " +
                    " FOREIGN KEY (FOOD_ID) REFERENCES PERSON (ID), " +
                    " CALORY            FLOAT     NOT NULL, " +
                    " TYPE            TEXT     NOT NULL)";
            stmt.executeUpdate(foodData);

            String sql = String.format("INSERT INTO PERSON VALUES ('1', '%s', '%d', '%d')", newUser.name, newUser.height, newUser.height);
            stmt.executeUpdate(sql);
            //String sqlFood = String.format("INSERT INTO FOOD VALUES ('1', '%s', '1', '%s', '%d')", newFood.name, newFood.calory, newFood.type);
            //stmt.executeUpdate(sqlFood);

            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }


    public static void main(String args[]) {

    }
}