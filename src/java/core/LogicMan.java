package core;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LogicMan", urlPatterns = { "/logicman.be" })
public class LogicMan extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String intent = request.getParameter("intent");

        if (intent.equals("test")) {
            String first = request.getParameter("first");
            String second = request.getParameter("second");

            request.setAttribute("feedback", first + " " + second);
        } else if (intent.equals("login")) {
            String phone = request.getParameter("phone");
            String pin = request.getParameter("pin");

            if (phone.equals("08107721911") && pin.equals("2130")) {
                request.setAttribute("msg", "Welcome, " + phone);
            }
        }

        getServletContext().getRequestDispatcher("/dash.jsp").forward(request, response);
    }

}
