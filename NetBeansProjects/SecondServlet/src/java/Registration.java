import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Registration extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n"
                    + "\n"
                    + "<html>\n"
                    + "\n"
                    + "    <head>\n"
                    + "        <title>TODO supply a title</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "        <style>\n"
                    + "            #main {\n"
                    + "                /* background-color: lightsalmon; */\n"
                    + "                height: 500px;\n"
                    + "                width: 100%;\n"
                    + "                display: flex;\n"
                    + "                flex-direction: column;\n"
                    + "                align-items: center;\n"
                    + "                justify-content: center;\n"
                    + "\n"
                    + "            }\n"
                    + "\n"
                    + "            #main form {\n"
                    + "                background-color: lightgrey;\n"
                    + "                display: flex;\n"
                    + "                flex-direction: column;\n"
                    + "                /* align-items: center; */\n"
                    + "                border: 2px solid;\n"
                    + "                /* justify-content: center; */\n"
                    + "                height: 450px;\n"
                    + "                border-radius: 15px;\n"
                    + "                width: 30%;\n"
                    + "            }\n"
                    + "\n"
                    + "            form span {\n"
                    + "                /* background-color: aliceblue; */\n"
                    + "                height: 30px;\n"
                    + "                /* border: 1px solid; */\n"
                    + "                display: flex;\n"
                    + "                align-items: center;\n"
                    + "                justify-content: center;\n"
                    + "                width: 100%;\n"
                    + "            }\n"
                    + "\n"
                    + "            form span input {\n"
                    + "                /* background-color: aliceblue; */\n"
                    + "                margin-top: 10px;\n"
                    + "                height: 30px;\n"
                    + "                /* border: 1px solid; */\n"
                    + "                width: 80%;\n"
                    + "                margin-top: 5px;\n"
                    + "                padding: 1px;\n"
                    + "            }\n"
                    + "        </style>\n"
                    + "    </head>\n"
                    + "\n"
                    + "    <body>\n"
                    + "        <div id=\"main\">\n"
                    + "            <form action=\"RegistrationData\">\n"
                    + "                <center><h1>Registration Form</h1> </center>\n"
                    + "\n"
                    + "\n"
                    + "                <span>Name</span>\n"
                    + "                <span><input type=\"text\" name=\"Name\" required></span>\n"
                    + "\n"
                    + "                <span>Father Name</span>\n"
                    + "                <span><input type=\"text\" name=\"FName\" required></span>\n"
                    + "\n"
                    + "                <span>Email Id</span>\n"
                    + "                <span><input type=\"text\" name=\"email\" required></span>\n"
                    + "\n"
                    + "                <span>Password </span>\n"
                    + "                <span><input type=\"password\" name=\"password\" required></span>\n"
                    + "\n"
                    + "                <span>Conform Password </span>\n"
                    + "                <span><input type=\"password\" name=\"cpassword\" required></span>\n"
                    + "\n"
                    + "                <span>Contact </span>\n"
                    + "                <span><input type=\"text\" name=\"contact\" required></span>\n"
                    + "\n"
                    + "                <span> </span>\n"
                    + "                <span><input type=\"submit\" name=\"login.html\" value=\"Registration\"></span>\n"
                    + "\n"
                    + "                <span><a href=\"Login.html\">Login</a></span>\n"
                    + "            </form>\n");
            HttpSession session = request.getSession();
            int x = (Integer) session.getAttribute("error");
            if (x == 1) {
                out.print(" <br> <br> <label for='inputField'>Email id already Exist </label>");
            }
            if (x == 2) {
                out.print(" <br> <br> <label for='inputField'>Password Not match </label>");
            }
            if (x == 3) {
                out.print(" <br> <br> <label for='inputField'>Invalide Mobile number </label>");
            }
            if (x == 4) {
                out.print(" <br> <br> <label for='inputField'>Invalide Name </label>");
            }
            if (x == 5) {
                out.print(" <br> <br> <label for='inputField'>Invalide Father Name</label>");
            }
            out.print("    </body>\n"
                    + "\n"
                    + "</html>"
            );
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
