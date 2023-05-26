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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String stringAge = request.getParameter("age");
        int intAge = Integer.parseInt(stringAge);
        
        /*setting the attributes that will be forwarded to the JSP*/
        request.setAttribute("age", intAge);
        
        /*forwarding to a .jsp file. In the case, the JSP file is named
          calculateage.jsp
        */
        getServletContext().getRequestDispatcher("/WEB-INF/calculateage.jsp")
                .forward(request, response);
    }
}
