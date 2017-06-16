package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Lina on 2017.06.16.
 */
@WebServlet (value = "/thirdServlet")
public class MyThirdServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        req.setAttribute("name", name);
        req.setAttribute("surname", surname);

        req.getRequestDispatcher("secondPage.jsp").forward(req, resp);
    }
}
