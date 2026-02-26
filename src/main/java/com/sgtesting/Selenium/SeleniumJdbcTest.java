package com.sgtesting.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.*;

public class SeleniumJdbcTest {

    // Utility method for database connection
    public static Connection getOracleConnection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "System",
                "tiger"
        );
    }

    @Test
    public void loginUsingDbData() {
        WebDriver driver = null;
        Connection conn = null;

        try {
            // 1️⃣ Get employee data from Oracle
            conn = getOracleConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT username, password FROM system.tbl_login WHERE ROWNUM = 1";
            ResultSet rs = stmt.executeQuery(query);

            String username = "";
            String password = "";

            if (rs.next()) {
                username = rs.getString("username");
                password = rs.getString("password");
            }

            System.out.println("Using credentials: " + username + " / " + password);

            // 2️⃣ Launch Selenium
            System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://example.com/login");

            // 3️⃣ Automate login using DB data
            WebElement userField = driver.findElement(By.id("username"));
            WebElement passField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            userField.sendKeys(username);
            passField.sendKeys(password);
            loginButton.click();

            Thread.sleep(3000);
            System.out.println("Login completed.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception e) {}
            if (driver != null) driver.quit();
        }
    }
}
