
//import com.mysql.cj.Session;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Profile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            ResultSet rs = (ResultSet) session.getAttribute("rs");

            out.print("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "  <head>\n"
                    + "    <meta charset=\"UTF-8\" />\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n"
                    + "    <title>Profle</title>\n"
                    + "    <style>\n"
                    + "      * {\n"
                    + "        margin: 0;\n"
                    + "        padding: 0;\n"
                    + "        box-sizing: border-box;\n"
                    + "        font-family: candara;\n"
                    + "      }\n"
                    + "      .main {\n"
                    + "        width: 100%;\n"
                    + "        height: 100vh;\n"
                    + "        display: flex;\n"
                    + "        align-items: center;\n"
                    + "        justify-content: center;\n"
                    + "      }\n"
                    + "      .profile-card {\n"
                    + "        display: flex;\n"
                    + "        flex-direction: column;\n"
                    + "        align-items: center;\n"
                    + "        height: 600px;\n"
                    + "        width: 80%;\n"
                    + "        border-radius: 25px;\n"
                    + "        padding: 30px;\n"
                    + "        border: 1px solid #ffffff40;\n"
                    + "        background-color: lightskyblue;\n"
                    + "        box-shadow: 0 5px 20px rgba(0, 0, 0, 0.4);\n"
                    + "      }\n"
                    + "      .image {\n"
                    + "        position: relative;\n"
                    + "        height: 150px;\n"
                    + "        width: 150px;\n"
                    + "      }\n"
                    + "      .image .profile-pic {\n"
                    + "        width: 100%;\n"
                    + "        height: 100%;\n"
                    + "        border-radius: 50%;\n"
                    + "        box-shadow: 0 5px 20px rgba(0, 0, 0, 0.4);\n"
                    + "      }\n"
                    + "      form {\n"
                    + "        width: 100%;\n"
                    + "        position: relative;\n"
                    + "      }\n"
                    + "      table {\n"
                    + "        position: absolute;\n"
                    + "        margin-top: 30px;\n"
                    + "        width: 100%;\n"
                    + "      }\n"
                    + "      table tr {\n"
                    + "        /* width: 100%; */\n"
                    + "        display: flex;\n"
                    + "        /* flex-direction: row; */\n"
                    + "      }\n"
                    + "      table tr td {\n"
                    + "        font-size: 18px;\n"
                    + "        width: 100%;\n"
                    + "        height: 35px;\n"
                    + "        color: black;\n"
                    + "        display: flex;\n"
                    + "        flex-direction: row;\n"
                    + "        /* background-color: yellow; */\n"
                    + "      }\n"
                    + "\n"
                    + "      table tr td a {\n"
                    + "        font-size: 18px;\n"
                    + "        width: 40%;\n"
                    + "        height: 35px;\n"
                    + "        color: black;\n"
                    + "        text-decoration: none;\n"
                    + "      }\n"
                    + "      table tr td a:hover {\n"
                    + "        color: grey;\n"
                    + "      }\n"
                    + "      input {\n"
                    + "        width: 90%;\n"
                    + "        height: 30px;\n"
                    + "        font-size: 15px;\n"
                    + "        border-radius: 10px;\n"
                    + "        border: none;\n"
                    + "      }\n"
                    + "      input:hover {\n"
                    + "        background-color: gray;\n"
                    + "      }\n"
                    + "      #editToggle {\n"
                    + "        display: none;\n"
                    + "      }\n"
                    + "      /* -------------------------------------------- */\n"
                    + "      input[type=\"checkbox\"] {\n"
                    + "        display: none;\n"
                    + "      }\n"
                    + "\n"
                    + "      input[type=\"checkbox\"]:checked + input[type=\"text\"] {\n"
                    + "        pointer-events: auto;\n"
                    + "        background-color: #fff;\n"
                    + "        border: 1px solid #ccc;\n"
                    + "        color: #333;\n"
                    + "      }\n"
                    + "\n"
                    + "      button {\n"
                    + "        display: none;\n"
                    + "      }\n"
                    + "      table tr td label{\n"
                    + "        background-color: #ccc;\n"
                    + "        border-radius: 10px;\n"
                    + "        width: 20px;\n"
                    + "        height: 20px;\n"
                    + "      }\n"
                    + "      table tr td label:hover {\n"
                    + "        background-color: gray;\n"
                    + "      }\n"
                    + "      input[type=\"checkbox\"]:checked + input[type=\"text\"] + button {\n"
                    + "        display: inline-block;\n"
                    + "      }\n"
                    + "      /* ---------------------------------------- */\n"
                    + "    </style>\n"
                    + "  </head>\n"
                    + "  <body>\n"
                    + "    <section class=\"main\">\n"
                    + "      <div class=\"profile-card\">\n"
                    + "        <!-- <div class=\"image\">\n"
                    + "          <img src=\"images/profile.jpg\" alt=\"\" class=\"profile-pic\" />\n"
                    + "        </div> -->\n"
                    + "        <div class=\"data\">\n"
                    + "          <br />\n"
                    + "          <br />\n"
                    + "           <h2>PROFILE</h2> \n"
                    + "        </div>\n"
                    + "\n"
                    + "        <form action='UpdateData'>\n"
                    + "          <table>\n"
                    + "            <tr>\n"
                    + "              <td>\n"
                    + "                <span>Name : </span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <span>" + rs.getString("name") + "</span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <label for=\"editToggle1\">Edit</label>\n"
                    + "              </td>\n"
                    + "              <td class=\"save_btn\">\n"
                    + "                <input type=\"checkbox\" id=\"editToggle1\" />\n"
                    + "                <input type=\"text\" id=\"editableField1\" name =\"name\"/>\n"
                    + "                <button id=\"saveButton1\" name =\"saveButton1\" value = \"saveButton1\">Save</button>\n"
                    + "              </td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "              <td>\n"
                    + "                <span>Father :</span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <span>" + rs.getString("Fname") + "</span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <label for=\"editToggle2\">Edit</label>\n"
                    + "              </td>\n"
                    + "              <td class=\"save_btn\">\n"
                    + "                <input type=\"checkbox\" id=\"editToggle2\" />\n"
                    + "                <input type=\"text\" id=\"editableField2\" name =\"fname\"/>\n"
                    + "                <button id=\"saveButton2\" name =\"saveButton2\" >Save</button>\n"
                    + "              </td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "              <td>\n"
                    + "                <span>Gmail : </span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <span>" + rs.getString("email_id") + "</span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <label for=\"editToggle3\">Edit</label>\n"
                    + "              </td>\n"
                    + "              <td class=\"save_btn\">\n"
                    + "                <input type=\"checkbox\" id=\"editToggle3\" />\n"
                    + "                <input type=\"text\" id=\"editableField3\" name =\"email\"/>\n"
                    + "                <button id=\"saveButton3\" name =\"saveButton3\">Save</button>\n"
                    + "              </td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "              <td>\n"
                    + "                <span>Mobile : </span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <span>" + rs.getString("mobile") + "</span>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <label for=\"editToggle4\">Edit</label>\n"
                    + "              </td>\n"
                    + "              <td class=\"save_btn\">\n"
                    + "                <input type=\"checkbox\" id=\"editToggle4\" />\n"
                    + "                <input type=\"text\" id=\"editableField4\" name =\"mobile\"/>\n"
                    + "                <button id=\"saveButton4\" name =\"saveButton4\" value = \"saveButton4\">Save</button>\n"
                    + "              </td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "              <td>Change Password :</td>\n"
                    + "              <td></td>\n"
                    + "              <td class=\"save_btn\">\n"
                    + "                <label for=\"editToggle5\">Edit</label>\n"
                    + "              </td>\n"
                    + "              <td>\n"
                    + "                <input type=\"checkbox\" id=\"editToggle5\" />\n"
                    + "                <input type=\"text\" id=\"editableField5\" name =\"password\"/>\n"
                    + "                <button id=\"saveButton5\" name =\"saveButton5\" value = \"saveButton5\">Save</button>\n"
                    + "              </td>\n"
                    + "            </tr>\n"
                    + "            <tr>\n"
                    + "              <td>\n"
                    + "                <a href=\"SDashboard\" class=\"btn\">Home</a>\n"
                    + "              </td>\n"
                    + "            </tr>\n"
                    + "          </table>\n"
                    + "        </form>\n"
                    + "      </div>\n"
                    + "    </section>\n"
                    + "  </body>\n"
                    + "</html>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}