package com.sgtesting.Selenium;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    @Test
    public void readRecordsFromTable()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
            System.out.println("Connection established successfully");
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM system.tbl_employees";
            ResultSet rs =stmt.executeQuery(query);
            while(rs.next())
            {
                String fname=rs.getString("EMPLOYEE_FIRST_NAME");
                String address=rs.getString("EMPLOYEE_ADDRESS");
                System.out.printf("%-12s", fname);
                System.out.printf("%-12s", address);
                System.out.printf("\n");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static String getEmployeeId(String query)
    {
        Connection conn=null;
        String employee_Id=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
            Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(query);
            rs.next();
            employee_Id=rs.getString("ID");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return employee_Id;
    }
}
