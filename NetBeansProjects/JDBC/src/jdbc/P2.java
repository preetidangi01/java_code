package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;


public class P2 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll no");
        int rno=sc.nextInt();
       //sc.nextLine();
//        System.out.println("Enter your name");
//        String name=sc.nextLine();
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        try
        {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("class load");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
                PreparedStatement ps=con.prepareStatement("update practice set marks= ? where rno=?");
               
               // ps.setString(1,name);
               ps.setInt(1, marks); 
               ps.setInt(2, rno);
               
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
            System.out.println("Exception aa gai bhai");
        }
              
       
//            Logger.getLogger(JDBC2.class.getName()).log(Level.SEVERE, null, ex);
        
           
            
            
    }
}

    

