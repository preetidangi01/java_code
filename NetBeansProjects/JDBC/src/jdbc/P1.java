package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
public class P1 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll no");
        int rno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        String name=sc.nextLine();
      
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        try
        {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("class load");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
                PreparedStatement ps=con.prepareStatement("insert into practice values(?,?,?)");
                ps.setInt(1, rno);
                ps.setString(2,name);
                ps.setInt(3, marks);
                int i=ps.executeUpdate();
                if(i>=0)
                {
                    System.out.println("Success.....");
                }
                else
                {
                    System.out.println("Not Run...");
                            
                }
                
        }
        catch(Exception e)
        {
            System.out.println("Exception aa gai bhai");
        }
              
       
//            Logger.getLogger(P1.class.getName()).log(Level.SEVERE, null, ex);
        
           
            
            
    }
}
