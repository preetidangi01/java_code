import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {
            int a = Integer.parseInt(req.getParameter("n1"));
            int b = Integer.parseInt(req.getParameter("n2"));
                out.println(" <h2>Calculator Result :-<h2><br>  ");
            if (null != req.getParameter("Addition")){
                out.println("Addition="+(a + b));
            }
            else if(null != req.getParameter("Subtraction")){
                out.println("Subtraction ="+(a - b));
            }
            else if(null != req.getParameter("Multiplaction")){
                out.println("Multiplaction ="+(a * b));
            }
            else if(null != req.getParameter("Division")){
                out.println("Division ="+(a / b));
            }
            else if(null != req.getParameter("Modulas")){
                out.println("Modulas ="+(a % b));
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
