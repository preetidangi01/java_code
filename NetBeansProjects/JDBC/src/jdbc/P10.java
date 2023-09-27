package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//import java.sql.*;
//import java.util.Scanner;
public class P10 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary");
        int salary=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Contact");
        String contact=sc.nextLine();
        System.out.println("Enter Serial no");
        int sno=sc.nextInt();
       
        try
        {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("class load");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
                PreparedStatement ps=con.prepareStatement("update Faculty set  salary=?,contact_no=? where sno=?");
               
                ps.setInt(1,salary);
                ps.setString(2, contact);
                ps.setInt(3,sno);
               
                int i=ps.executeUpdate();
                if(i>=0)
                {
                    System.out.println("Success...");
                }
                else
                {
                    System.out.println("UnSuccess...");
                }
                
        }
        catch(Exception e)
        {
            System.out.println("Exception aa gai bhai-------"+e);
        }
    }
}


