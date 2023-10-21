
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
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                HttpSession session = request.getSession();
                if (!request.getParameter("password").equals(request.getParameter("cpassword"))) {
                    session.setAttribute("error", 2);
                    response.sendRedirect(request.getContextPath() + "/Registration");
                    return;
                }
                if (!checkMobileNumber(request.getParameter("contact"))) {
                    session.setAttribute("error", 3);
                    response.sendRedirect(request.getContextPath() + "/Registration");
                    return;
                }
                if (!checkName(request.getParameter("Name"))) {
                    session.setAttribute("error", 4);
                    response.sendRedirect(request.getContextPath() + "/Registration");
                    return;
                }
                if (!checkName(request.getParameter("FName"))) {
                    session.setAttribute("error", 5);
                    response.sendRedirect(request.getContextPath() + "/Registration");
                    return;
                }
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo", "root", "root");
                PreparedStatement ps = con.prepareStatement("insert into servlet(name,fname,email_id,password,mobile) values(?,?,?,?,?)");
                ps.setString(1, request.getParameter("Name"));
                ps.setString(2, request.getParameter("FName"));
                ps.setString(3, request.getParameter("email"));
                ps.setString(4, request.getParameter("password"));
                ps.setString(5, request.getParameter("contact"));
                int i = ps.executeUpdate();
                if (i > 0) {
                    response.sendRedirect(request.getContextPath() + "/Login.html");
                }
            } catch (ClassNotFoundException | SQLException e) {
                out.println("" + e);
            }

        }
    }

    public static boolean checkMobileNumber(String mobileNumber) {
        if (mobileNumber.length() != 10) {
            return false;
        }
        for (int i = 0; i < mobileNumber.length(); i++) {
            try {
                int n = mobileNumber.charAt(i) - '0';
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public boolean checkName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) < 97 || name.charAt(i) > 122) && (name.charAt(i) < 67 || name.charAt(i) > 122)) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
