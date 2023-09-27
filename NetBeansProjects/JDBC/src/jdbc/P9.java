package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;
public class P9 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Serial no");
        int sno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your Department");
        String dep=sc.nextLine();
        System.out.println("Enter your salary");
        int salary=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Contact_no");
        String contact=sc.nextLine();
       
        try
        {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("class load");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
                PreparedStatement ps=con.prepareStatement("insert into Faculty values(?,?,?,?,?)");
               
                 ps.setInt(1, sno);
                 ps.setString(2,name);
                 ps.setString(3,dep);
                 ps.setInt(4, salary);
                 ps.setString(5 ,contact);
                
               
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
            System.out.println("Exception aa gai bhai___________"+e);
        }
    }
}

