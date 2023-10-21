/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            String path = "jdbc:mysql://localhost:3306/javainfo";
            String sql = "";
            HttpSession session = request.getSession();
            ResultSet rs = (ResultSet) session.getAttribute("rs");
            String idpass = "root";
            try {
                con = DriverManager.getConnection(path, idpass, idpass);
                PreparedStatement ps = null;
//                out.println(request.getParameter("saveButton1<br>"));
                if (request.getParameter("saveButton1") != null) {

//                    out.println(request.getParameter("saveButton1")+"fgsdfg");
//                    out.println(request.getParameter(request.getParameter("name")));
                    if (!request.getParameter("name").isEmpty()) {
                        sql = "UPDATE servlet SET name =  ? WHERE  email_id =  ? ";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("name"));
                        ps.setString(2, rs.getString("email_id"));
                    }

                } else if (request.getParameter("saveButton2") != null) {

                    if (!request.getParameter("fname").isEmpty()) {
                        sql = "UPDATE servlet SET fname =  ? WHERE  email_id =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("fname"));
                        ps.setString(2, rs.getString("email_id"));
                    }

                } else if (request.getParameter("saveButton3") != null) {

                    if (!request.getParameter("email").isEmpty()) {
                        sql = "UPDATE servlet SET email_id =  ? WHERE  email_id =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("email"));
                        ps.setString(2, rs.getString("email_id"));
                    }
//                    System.out.print(rs.getString("gmail") + "<br>");
                } else if (request.getParameter("saveButton4") != null) {

                    if (!request.getParameter("mobile").isEmpty()) {
                        sql = "UPDATE servlet SET mobile =  ? WHERE  email_id =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("mobile"));
                        ps.setString(2, rs.getString("email_id"));
                    }

                } else if (request.getParameter("saveButton5") != null) {
                    if (!request.getParameter("password").isEmpty()) {
                        sql = "UPDATE servlet SET password =  ? WHERE  email_id =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("password"));
                        ps.setString(2, rs.getString("email_id"));
                    }
                }
                if (ps.executeUpdate() > 0) {
                    //Object datasave = 1;
                    session.setAttribute("sms", 1);
                    response.sendRedirect(request.getContextPath() + "/Profile");

                } else {
//                    Profile.processRequest(request, response, 1);
                    response.sendRedirect(request.getContextPath() + "/Login");
                }
            } catch (SQLException e) {

                out.println("*****");
                out.println(e);
                e.printStackTrace();
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
