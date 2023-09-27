package jdbc;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*; 
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class P {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter city Id");
        int cid=sc.nextInt();
        System.out.println("Enter City Name");
        String cname=sc.next();
//        sc.nextLine();Bhopal
        System.out.println("Enter State Id");
        int sid=sc.nextInt();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class load");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root","root");
            PreparedStatement ps=con.prepareStatement("insert into city values(?,?,?)");
//            PreparedStatement ps=con.prepareStatement("delete from Student where roll=45");
            
            ps.setInt(1,cid ); 
            ps.setString(2, cname);
            ps.setInt(3, sid);
            
            int i=ps.executeUpdate();
            if(i>0){
                System.out.println("Success");
            } 
            else
            {
               System.out.println("Class not Found");
            }
        } catch (SQLException ex) {
           
        } catch (ClassNotFoundException ex) {
            
        }
    }
    
}
