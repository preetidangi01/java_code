
package rgpvhome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DataStoreclass 
{
    public static void storeData(String name, String fname,String mname, String gender,String dob, String gmail, String mobile)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Registration no");
//        int rno=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter your name");
//        String name=sc.nextLine();
//        System.out.println("Enter your father name");
//        String fname=sc.nextLine();
//        System.out.println("Enter your mother name");
//        String mname=sc.nextLine();
//        System.out.println("Enter your gender");
//        String gender=sc.nextLine();
//        System.out.println("Enter your dob");
//        String dob=sc.nextLine();
//        System.out.println("Enter your gmail");
//        String gmail=sc.nextLine();
//        System.out.println("Enter your mobile");
//        String mobile=sc.nextLine();
        try
        {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("class load");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rgpv","root","root");
                PreparedStatement ps=con.prepareStatement("insert into registration(Name,Father,Mother,gander,dob,gmail,mobile) values(?,?,?,?,?,?,?)");
                //ps.setInt(1, rno);
                ps.setString(1,name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, gender);
                ps.setString(5, dob);
                ps.setString(6, gmail);
                ps.setString(7, mobile);
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
            System.out.println("Exception aa gai bhai---------------"+e);
        }
    }
}
