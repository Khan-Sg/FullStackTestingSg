package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgraceConnections{
    public static void main(String[] args) {
        // PostgreSQL connection parameters
        String url = "jdbc:postgresql://localhost:5432/gentechDB"; // your database name
        String user = "SGtesting";  // your DB username
        String password = "SGtesting"; // your DB password

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL successfully!");

            // Example query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users"); // replace with your table

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}