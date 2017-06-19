package com.kcs.students.app.servlet;

import com.kcs.students.app.Student;
import com.kcs.students.app.service.StudentAdministrationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Lina on 2017.06.16.
 */
@WebServlet(value = "/getStudents")
public class GetStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        StudentAdministrationService service = new StudentAdministrationService();
        List<Student> students = service.getStudents();

        req.setAttribute("students", students);

        req.getRequestDispatcher("studentsResult.jsp").forward(req, resp);
    }

    /**
     * Created by Lina on 2017.06.19.
     */

}
