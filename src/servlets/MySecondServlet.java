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
@WebServlet(value = "/secondServlet")
public class MySecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "Benas");
        req.setAttribute("surname", "Rimsa");
        req.getRequestDispatcher("secondPage.jsp").forward(req, resp);
    }
}
