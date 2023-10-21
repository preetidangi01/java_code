import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.print("""
                      <!DOCTYPE html>
                      
                      <html>
                      
                      <head>
                          <title>TODO supply a title</title>
                          <meta charset="UTF-8">
                          <meta name="viewport" content="width=device-width, initial-scale=1.0">
                          <style>
                              #first {
                                  /* background-color: gray; */
                                  height: 500px;
                                  width: 100%;
                                  display: flex;
                                  flex-direction: column;
                                  align-items: center;
                                  justify-content: center;
                              }
                              #first form
                              {
                                 
                                  background-color: cadetblue;
                                  display: flex;
                                  flex-direction: column;
                                  align-items: center;
                                  border: 2px solid;
                                  justify-content: center;
                                  height: 400px;
                                  border-radius: 10px;
                                  width: 30%;
                              }
                              form span {
                                  background-color: aliceblue;
                                  height: 30px;
                                  /* border: 1px solid; */
                                  display: flex;
                                  align-items: center;
                                  justify-content: center;
                                  width: 100%;
                              }
                              form span input{
                                  /* background-color: aliceblue; */
                                  margin-top: 10px;
                                  height: 30px;
                                  /* border: 1px solid; */
                                  width: 80%;
                              }
                          </style>
                      </head>
                      
                      <body>
                          <div id="first">
                              <form action='LoginData'>
                      
                                  <span> User Id</span>
                                  <span><input type="text" name='Name' required></span>
                      
                      
                                  <span>Password</span>
                                  <span><input type="text" name='password' required></span>
                      
                      
                                  <span><input type="submit" name="login" value="login"></span>
                                  <span> <a href="Registration.html">New user</a></span>                                          
                      </body>
                      
                      </html>""");
            try {
                String email = request.getParameter("Name");
                String password = request.getParameter("password");
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localcost:3306/javainfo", "root", "root");
                out.println("Sucess");

                PreparedStatement ps = con.prepareStatement("select * from servlet where email_id =? and password = ?");
                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("rs", rs);
                    response.sendRedirect("SDashboard");

                } else {
                    response.sendRedirect("Login");
                }

            } catch (Exception e) {
            }
            response.sendRedirect("Login");
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
