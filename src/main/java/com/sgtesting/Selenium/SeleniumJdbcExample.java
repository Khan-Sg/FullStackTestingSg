package com.sgtesting.Selenium;

import java.sql.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJdbcExample {

    public static void main(String[] args) {
        // Set the ChromeDriver path (update this path as per your system)
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        // Database credentials
        String url = "jdbc:mysql://@localhost:1521:XE";
        String user = "system";
        String password = "tiger";

        // JDBC objects
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        // Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Connect to the database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");

            // 2. Execute SQL query
            stmt = conn.createStatement();
            String sql = "SELECT username, password FROM users WHERE id = 1";
            rs = stmt.executeQuery(sql);

            // 3. Retrieve data from result set
            String username = "";
            String userPassword = "";
            if (rs.next()) {
                username = rs.getString("username");
                userPassword = rs.getString("password");
            }

            // 4. Use Selenium to automate login using DB data
            driver.get("https://example.com/login");

            WebElement userField = driver.findElement(By.id("username"));
            WebElement passField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            userField.sendKeys(username);
            passField.sendKeys(userPassword);
            loginButton.click();

            System.out.println("Login attempted using credentials from DB.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close all resources
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
            driver.quit();
        }
    }
}
