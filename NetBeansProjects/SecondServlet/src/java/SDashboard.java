
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;

public class SDashboard extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try{
                HttpSession session = request.getSession();
                response.setHeader("Cache-Control", "No-Cache");
                response.setHeader("Cache-Control", "No-Store");
                ResultSet rs = (ResultSet) session.getAttribute("rs");
                if (rs != null) {
                String name= rs.getString("name");
                out.print("<!DOCTYPE html>");
                out.print("<html lang='en'>");
                out.print("  <head>");
                out.print("    <meta charset='UTF-8' />");
                out.print("    <meta name='viewport' content='width=device-width, initial-scale=1.0'/>");
                out.print("    <title>My Dash Board</title>");
                out.print("    <link");
                out.print("rel='stylesheet'");
                out.print("href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css'");
                out.print("    />");
                out.print("    <style>");
                out.print("* {");
                out.print("  margin: 0;");
                out.print("  padding: 0;");
                out.print("  box-sizing: border-box;");
                out.print("  font-family: 'Open Sans', sans-serif;}");
                out.print("nav {");
                out.print("  top: 0;");
                out.print("  left: 0;");
                out.print("  width: 100%;");
                out.print("  padding: 20px;");
                out.print("  background: whitesmoke;}");
                out.print("nav .nav-content {");
                out.print("  height: 100%;");
                out.print("  max-width: 1200px;");
                out.print("  margin: auto;");
                out.print("  display: flex;");
                out.print("  align-items: center;");
                out.print("  justify-content: space-between;}");
                out.print("nav .logo a {");
                out.print("  font-weight: 500;");
                out.print("  font-size: 35px;");
                out.print("  color: black;}");
                out.print(".nav-content .nav-links {");
                out.print("  display: flex;}");
                out.print(".nav-content .nav-links li {");
                out.print("  list-style: none;");
                out.print("  margin-left: 80px;}");
                out.print(".nav-links li a {");
                out.print("  text-decoration: none;");
                out.print("  color: #0e2431;");
                out.print("  font-size: 18px;");
                out.print("  font-weight: 500;}");
                out.print(".nav-links li a:hover {");
                out.print("  color: blue;}");
                out.print("#second_row {");
                out.print("  height: 500px;");
                out.print("  width: 100%;");
                out.print("  display: flex;");
                out.print("  justify-content: space-evenly;");
                out.print("  align-items: center;}");
                out.print("#second_row_one,");
                out.print("#second_row_two {");
                out.print("  height: 450px;");
                out.print("  width: 49%;");
                out.print("  background-color: gray;}");
                out.print(".footer {");
                
                out.print("  width: 100%;");
                out.print("  background: #10182f;");
                out.print("  border-radius: 6px;}");
                out.print(".footer .footer-row {");
                out.print("  display: flex;");
                out.print("  justify-content: space-evenly;");
                out.print("  padding: 60px;}");
                out.print(".footer-row .footer-col h4 {");
                out.print("  color: #fff;");
                out.print("  font-size: 1.2rem;");
                out.print("  font-weight: 400;}");
                out.print(".footer-col .links {");
                out.print("  margin-top: 20px;}");
                out.print(".footer-col .links li {");
                out.print("  list-style: none;");
                out.print("  margin-bottom: 10px;}");
                out.print(".footer-col .links li a {");
                out.print("  text-decoration: none;");
                out.print("  color: #bfbfbf;}");
                out.print(".footer-col .links li a:hover {");
                out.print("  color: #fff;}");
                out.print(".footer-col p {");
                out.print("  margin: 20px 0;");
                out.print("  color: #bfbfbf;");
                out.print("  max-width: 300px;}");
                out.print(".footer-col form {");
                out.print("  display: flex;");
                out.print("  gap: 5px;}");
                out.print(".footer-col input {");
                out.print("  height: 40px;");
                out.print("  border-radius: 6px;");
                out.print("  background: none;");
                out.print("  width: 100%;");
                out.print("  border: 1px solid #7489c6;");
                out.print("  caret-color: #fff;");
                out.print("  color: #fff;");
                out.print("  padding-left: 10px;}");
                out.print(".footer-col input::placeholder {");
                out.print("  color: #ccc;}");
                out.print(".footer-col form button {");
                out.print("  background: #fff;");
                out.print("  outline: none;");
                out.print("  border: none;");
                out.print("  padding: 10px 15px;");
                out.print("  border-radius: 6px;");
                out.print("  cursor: pointer;");
                out.print("  font-weight: 500;}");
                out.print(".footer-col form button:hover {");
                out.print("  background: #cecccc;}");
                out.print(".footer-col .icons {");
                out.print("  display: flex;");
                out.print("  margin-top: 30px;");
                out.print("  gap: 30px;}");
                out.print(".footer-col .icons i {");
                out.print("  color: #afb6c7;}");
                out.print(".footer-col .icons i:hover {");
                out.print("  color: #fff;}");
                out.print("    </style>");
                out.print("  </head>");
                
                
                
                out.print("  <body>");
                out.print("<nav>");
                out.print("  <div class='nav-content'>");
                out.print("<div class='logo'>");
                out.print("  <a href='#'>"+name+" </a>");
                out.print("</div>");
                out.print("<ul class='nav-links'>");
                out.print("  <li><a href='#'>Home</a></li>");
                out.print("  <li><a href='#'>About</a></li>");
                out.print("  <li><a href='#'>Gallary</a></li>");
                out.print("  <li><a href='Profile'>Profile</a></li>");
                out.print("  <li><a href='Logout'>Logout</a></li>");
                out.print("</ul>");
                out.print("  </div>");
                out.print("</nav>");
                out.print("<div id='second_row'>");
                out.print("  <div id='second_row_one'></div>");
                out.print("  <div id='second_row_two'></div>");
                out.print("</div>");
                out.print("<section class='footer'>");
                out.print("  <div class='footer-row'>");
                out.print("<div class='footer-col'>");
                out.print("  <h4>Info</h4>");
                out.print("  <ul class='links'>");
                out.print("    <li><a href='#'>About Us</a></li>");
                out.print("    <li><a href='#'>Compressions</a></li>");
                out.print("    <li><a href='#'>Customers</a></li>");
                out.print("    <li><a href='#'>Service</a></li>");
                out.print("    <li><a href='#'>Collection</a></li>");
                out.print("  </ul>");
                out.print("</div>");
                out.print("<div class='footer-col'>");
                out.print("  <h4>Newsletter</h4>");
                out.print("  <p>");
                out.print("    Subscribe to our newsletter for a weekly dose of news, updates,");
                out.print("    helpful tips, and exclusive offers.");
                out.print("  </p>");
                out.print("  <form action='#'>");
                out.print("    <input type='text' placeholder='Your email' required />");
                out.print("    <button type='submit'>SUBSCRIBE</button>");
                out.print("  </form>");
                out.print("  <div class='icons'>");
                out.print("    <i class='fa-brands fa-facebook-f'></i>");
                out.print("    <i class='fa-brands fa-twitter'></i>");
                out.print("    <i class='fa-brands fa-linkedin'></i>");
                out.print("    <i class='fa-brands fa-github'></i>");
                out.print("  </div>");
                out.print("</div>");
                out.print("</div>");
                out.print("</section>");
                out.print("  </body>");
                out.print("</html>");
            } else {
                response.sendRedirect("Login.html");
            }
            }
            catch(Exception e)
            {
                out.println(""+e);
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
