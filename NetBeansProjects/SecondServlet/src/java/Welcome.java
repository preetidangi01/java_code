/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PILR
 */
public class Welcome extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             
            out.println("<!DOCTYPE html>\n"
                    + "<!-- Coding By CodingNepal - www.codingnepalweb.com -->\n"
                    + "<html lang=\"en\">\n"
                    + "  <head>\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <title>MyWelcome</title>\n"
                    + "    <link rel=\"stylesheet\" href=\"style.css\">\n"
                    + "    <!-- Google Fonts Links For Icon -->\n"
                    + "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0\">\n"
                    + "    <style>\n"
                    + "        /* Importing Google font - Poppins */\n"
                    + "@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');\n"
                    + "\n"
                    + "* {\n"
                    + "  margin: 0;\n"
                    + "  padding: 0;\n"
                    + "  box-sizing: border-box;\n"
                    + "  font-family: 'Poppins', sans-serif;\n"
                    + "}\n"
                    + "\n"
                    + "header {\n"
                    + "  position: fixed;\n"
                    + "  top: 0;\n"
                    + "  left: 0;\n"
                    + "  width: 100%;\n"
                    + "  padding: 20px;\n"
                    + "}\n"
                    + "\n"
                    + "header .navbar {\n"
                    + "  display: flex;\n"
                    + "  align-items: center;\n"
                    + "  justify-content: space-between;\n"
                    + "  max-width: 1200px;\n"
                    + "  margin: 0 auto;\n"
                    + "}\n"
                    + "\n"
                    + ".navbar .logo {\n"
                    + "  color: #fff;\n"
                    + "  font-weight: 600;\n"
                    + "  font-size: 2.1rem;\n"
                    + "  text-decoration: none;\n"
                    + "}\n"
                    + "\n"
                    + ".navbar .logo span {\n"
                    + "  color: #C06B3E;\n"
                    + "}\n"
                    + "\n"
                    + ".navbar .menu-links {\n"
                    + "  display: flex;\n"
                    + "  list-style: none;\n"
                    + "  gap: 35px;\n"
                    + "}\n"
                    + "\n"
                    + ".navbar a {\n"
                    + "  color: #fff;\n"
                    + "  text-decoration: none;\n"
                    + "  transition: 0.2s ease;\n"
                    + "}\n"
                    + "\n"
                    + ".navbar a:hover {\n"
                    + "  color: black;\n"
                    + "}\n"
                    + "\n"
                    + ".hero-section {\n"
                    + "  height: 100vh;\n"
                    + "  /* background-image: ; */\n"
                    + "  background-color: lightskyblue;\n"
                    + "  background-position: center;\n"
                    + "  background-size: cover;\n"
                    + "  display: flex;\n"
                    + "  align-items: center;\n"
                    + "  padding: 0 20px;\n"
                    + "}\n"
                    + "\n"
                    + ".hero-section .content {\n"
                    + "  max-width: 1200px;\n"
                    + "  margin: 0 auto;\n"
                    + "  width: 100%;\n"
                    + "  color: #fff;\n"
                    + "}\n"
                    + "\n"
                    + ".hero-section .content h2 {\n"
                    + "  font-size: 3rem;\n"
                    + "  max-width: 600px;\n"
                    + "  line-height: 70px;\n"
                    + "}\n"
                    + "\n"
                    + ".hero-section .content p {\n"
                    + "  font-weight: 300;\n"
                    + "  max-width: 600px;\n"
                    + "  margin-top: 15px;\n"
                    + "}\n"
                    + "\n"
                    + ".hero-section .content button {\n"
                    + "  background: #fff;\n"
                    + "  padding: 12px 30px;\n"
                    + "  border: none;\n"
                    + "  font-size: 1rem;\n"
                    + "  border-radius: 6px;\n"
                    + "  margin-top: 38px;\n"
                    + "  cursor: pointer;\n"
                    + "  font-weight: 500;\n"
                    + "  transition: 0.2s ease;\n"
                    + "}\n"
                    + "\n"
                    + ".hero-section .content button:hover {\n"
                    + "  color: #fff;\n"
                    + "  background: black;\n"
                    + "}\n"
                    + "\n"
                    + "#close-menu-btn {\n"
                    + "  position: absolute;\n"
                    + "  right: 20px;\n"
                    + "  top: 20px;\n"
                    + "  cursor: pointer;\n"
                    + "  display: none;\n"
                    + "}\n"
                    + "\n"
                    + "#hamburger-btn {\n"
                    + "  color: #fff;\n"
                    + "  cursor: pointer;\n"
                    + "  display: none;\n"
                    + "}\n"
                    + "\n"
                    + "@media (max-width: 768px) {\n"
                    + "  header {\n"
                    + "    padding: 10px;\n"
                    + "  }\n"
                    + "\n"
                    + "  header.show-mobile-menu::before {\n"
                    + "    content: \"\";\n"
                    + "    position: fixed;\n"
                    + "    left: 0;\n"
                    + "    top: 0;\n"
                    + "    width: 100%;\n"
                    + "    height: 100%;\n"
                    + "    backdrop-filter: blur(5px);\n"
                    + "  }\n"
                    + "\n"
                    + "  .navbar .logo {\n"
                    + "    font-size: 1.7rem;\n"
                    + "  }\n"
                    + "\n"
                    + "    \n"
                    + "  #hamburger-btn, #close-menu-btn {\n"
                    + "    display: block;\n"
                    + "  }\n"
                    + "\n"
                    + "  .navbar .menu-links {\n"
                    + "    position: fixed;\n"
                    + "    top: 0;\n"
                    + "    left: -250px;\n"
                    + "    width: 250px;\n"
                    + "    height: 100vh;\n"
                    + "    background: #fff;\n"
                    + "    flex-direction: column;\n"
                    + "    padding: 70px 40px 0;\n"
                    + "    transition: left 0.2s ease;\n"
                    + "  }\n"
                    + "\n"
                    + "  header.show-mobile-menu .navbar .menu-links {\n"
                    + "    left: 0;\n"
                    + "  }\n"
                    + "\n"
                    + "  .navbar a {\n"
                    + "    color: #000;\n"
                    + "  }\n"
                    + "\n"
                    + "  .hero-section .content {\n"
                    + "    text-align: center;\n"
                    + "  }\n"
                    + "\n"
                    + "  .hero-section .content :is(h2, p) {\n"
                    + "    max-width: 100%;\n"
                    + "  }\n"
                    + "\n"
                    + "  .hero-section .content h2 {\n"
                    + "    font-size: 2.3rem;\n"
                    + "    line-height: 60px;\n"
                    + "  }\n"
                    + "  \n"
                    + "  .hero-section .content button {\n"
                    + "    padding: 9px 18px;\n"
                    + "  }\n"
                    + "}\n"
                    + "    </style>\n"
                    + "  </head>\n"
                    + "  <body>\n"
                    + "    <header>\n"
                    + "      <nav class=\"navbar\">\n"
                    + "        <a class=\"logo\" href=\"#\">WelcomePage<span></span></a>\n"
                    + "        <ul class=\"menu-links\">\n"
                    + "          <span id=\"close-menu-btn\" class=\"material-symbols-outlined\">close</span>\n"
                    + "          <li><a href=\"#\">Home</a></li>\n"
                    + "          <li><a href=\"#\">About Us</a></li>\n"
                    + "          <li><a href=\"#\">Our Skills</a></li>\n"
                    + "          <li><a href=\"#\"> Services</a></li>\n"
                    + "          <li><a href=\"#\">Contact us</a></li>\n"
                    + "        </ul>\n"
                    + "        <span id=\"hamburger-btn\" class=\"material-symbols-outlined\">menu</span>\n"
                    + "      </nav>\n"
                    + "    </header>\n"
                    + "\n"
                    + "    <section class=\"hero-section\">\n"
                    + "      <div class=\"content\">\n"
                    + "        <h2>Welcome</h2>\n"
                    + "        <p>\n"
                    + "         Lorem ipsum, dolor sit amet consectetur adipisicing elit. Eaque quam ad possimus suscipit necessitatibus dicta alias ratione nisi, quos debitis!\n"
                    + "        </p>\n"
                    + "        <button><a href='Login.html'>Continue</a></button>\n"
                    + "      </div>\n"
                    + "    </section>\n"
                    + "\n"
                    + "    <script>\n"
                    + "      const header = document.querySelector(\"header\");\n"
                    + "      const hamburgerBtn = document.querySelector(\"#hamburger-btn\");\n"
                    + "      const closeMenuBtn = document.querySelector(\"#close-menu-btn\");\n"
                    + "\n"
                    + "      // Toggle mobile menu on hamburger button click\n"
                    + "      hamburgerBtn.addEventListener(\"click\", () => header.classList.toggle(\"show-mobile-menu\"));\n"
                    + "\n"
                    + "      // Close mobile menu on close button click\n"
                    + "      closeMenuBtn.addEventListener(\"click\", () => hamburgerBtn.click());\n"
                    + "    </script>\n"
                    + "    \n"
                    + "  </body>\n"
                    + "</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
