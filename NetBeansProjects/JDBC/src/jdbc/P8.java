package jdbc;
import java.sql.*;
import java.util.Scanner;

public class P8 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class load");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
            PreparedStatement ps=con.prepareStatement("select * from practice where marks between 90 and 99 ");

            ResultSet rs = ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
             int count = md.getColumnCount();
            //int column=md.getColumnName(count);
            //int column1=md.
            System.out.println(count);
            int i = 1;
            System.out.println("\t"+md.getColumnName(1)+"\t"+md.getColumnName(2)+"\t\t"+md.getColumnName(3));

            while(rs.next())
            {
               System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }

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
            System.out.println("Exception aa gai bhai----------" +e);
        }
    }
}

