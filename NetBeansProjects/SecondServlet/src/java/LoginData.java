
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginData extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                HttpSession session = request.getSession();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo", "root", "root");
                PreparedStatement ps = con.prepareStatement("select * from servlet where email_id =? and password = ?");
                ps.setString(1, request.getParameter("Name"));
                ps.setString(2, request.getParameter("password"));
                System.out.println(request.getParameter("Name"));
                System.out.println(request.getParameter("password"));
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    session.setAttribute("rs", rs);
                   response.sendRedirect(request.getContextPath() + "/SDashboard");
                } else {
                    out.println("------------------------");
                    response.sendRedirect("Login.html");
                }
            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();

             //   System.out.println(e);
                
                out.print(e);
                response.sendRedirect("Login.html");
                
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
