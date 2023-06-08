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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String stringAge = null;
        int intAge = 0;

        if (request.getParameter("age") != null && !request.getParameter("age").equals("")) {
            stringAge = request.getParameter("age");
            try {
                intAge = Integer.parseInt(stringAge);
                /*setting the attributes that will be forwarded to the JSP*/
                request.setAttribute("newAge", "Your next birthday will be  " + ++intAge);
            } catch (Exception ex) {
                request.setAttribute("error", "Please enter a number.");
            }
        } else {
            request.setAttribute("error", "You must give your current age");
        }

        /*
        forwarding to a .jsp file. In this case,
        the JSP file is named agecalculator.jsp
         */
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        return;
    }
}
