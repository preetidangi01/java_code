
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PILR
 */
public class OneOprand extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {
            try {
                int n = Integer.parseInt(req.getParameter("n"));
                if (req.getParameter("CheckAge") != null) {
                    out.println(checkAge(n));
                } else if (req.getParameter("CheckEvenOdd") != null) {
                    out.println(checkEvenOdd(n));
                } else if (req.getParameter("checkPrime") != null) {
                    out.println(checkPrime(n));
                } else if (req.getParameter("checkSeries") != null) {
                    out.println(checkSeries(n));
                }
            } catch (NumberFormatException e) {
                out.println("Invalide Input");
            }
        }
    }

    public String checkAge(int n) {
        if (n < 0) {
            return "Invalid";
        } else if (n < 13) {
            return "child";
        } else if (n < 20) {
            return "teen";
        } else if (n < 45) {
            return "Young";
        } else if (n > 45) {
            return "baba";
        } else {
            return "Invalid";
        }
    }

    public String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Number is Even";
        } else {
            return "Number is Odd ";
        }
    }

    public String checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "It is a prime number";
        } else {
            return "Not a prime number";
        }
    }
    public String checkSeries(int n){
		int fact=1,sum=0,i=1,x=1;
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact=fact*j;
			}
			if(i%2==0)
			{
			sum=sum-fact;
			}else
			{
				sum=sum+fact;
			}
			x=x+2;
		}
		
		System.out.println(sum);
        return null;
	}

    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        processRequest(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        processRequest(req, res);
    }

    @Override
    public String getServletInfo() {
        return "short description";
    }

}
