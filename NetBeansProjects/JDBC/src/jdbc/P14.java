
package jdbc;
import java.sql.*;
//import java.sql.Connection;
import java.util.Scanner;

public class P14 {
 
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter Roll no");
//        int rno=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter your name");
//        String name=sc.nextLine();
//        System.out.println("Enter your Marks");
//        int marks=sc.nextInt();
       
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class load");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
            PreparedStatement ps=con.prepareStatement("select * from practice where marks>85");
//             ps.setInt(1,marks);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData md = rs.getMetaData();
             int count = md.getColumnCount();
            //               int column=md.getColumnName(count);
            //               int column1=md.
             System.out.println(count);
             int i = 1;
             System.out.println("\t"+md.getColumnName(1)+"\t"+md.getColumnName(2)+"\t\t"+md.getColumnName(3));

             while(rs.next())
             {
                System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
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
            System.out.println("Exception aa gai bhai");
        }    
    }
}
