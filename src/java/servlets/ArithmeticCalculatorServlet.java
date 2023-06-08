package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fortune Agbone
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
        .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        String operation = request.getParameter("operation");
        /*
        String selectAddition = request.getParameter("+");
        String selectSubtraction = request.getParameter("-");
        String selectMultiplication = request.getParameter("*");
        String selectModulus = request.getParameter("%");
        */
                
        
        
    try{
        if(firstNum == null || firstNum.equals("") || secondNum == null || secondNum.equals(""))
        {
            request.setAttribute("result", "Invalid Parameters");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
            .forward(request, response);
            
            return;
        }
        else if(operation.equals("+"))
        {
            int addition = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
            request.setAttribute("result", addition);
        }
        else if(operation.equals("-"))
        {
            int subtraction = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
            request.setAttribute("result", subtraction);
        }
        else if(operation.equals("*"))
        {
            int multiplication = (Integer.parseInt(firstNum) * Integer.parseInt(secondNum));
            request.setAttribute("result", multiplication);
        }
        else if(operation.equals("%"))
        {
            int modulus = Integer.parseInt(firstNum) % Integer.parseInt(secondNum);
            request.setAttribute("result", modulus);
        }
        else
        {
            request.setAttribute("result", "Invalid Parameters");
        }
    }
    catch(Exception ex)
    {
        request.setAttribute("result", "Please enter a valid number");
    }
       
     /*
     forwarding to a .jsp file. In this case,
     the JSP file is named calculateage.jsp
     */
    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    return;
    }
}
