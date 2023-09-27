package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

//import java.sql.*;
//import java.util.Scanner;
public class P12 {

    public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
      
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class load");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
            PreparedStatement ps=con.prepareStatement("select  max(salary) from Faculty");

            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
             int count = rsmd.getColumnCount();
            //int column=md.getColumnName(count);
            System.out.println(count);
            int i = 1;
//          System.out.println("\t"+md.getColumnName(1)+"\t"+md.getColumnName(2)+"\t\t"+md.getColumnName(3)+"\t\t"+md.getColumnName(4)+"\t\t"+md.getColumnName(5));
            System.out.println("\t"+rsmd.getColumnName(1));
//          System.out.println("\t"+rsmd.getColumnTypeName(1));
            while(rs.next())
            {
//              System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
                System.out.println("\t"+rs.getString(1));
             }

            //ps.setString(1,name);
            //ps.setInt(1, rno);
//               int i=ps.executeUpdate();
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
            System.out.println("Exception aa gai bhai--------"+e);
        }
    }
}
