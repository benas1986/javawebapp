package com.kcs.students.app.servlet;

import com.kcs.students.app.StudentDetailInfo;
import com.kcs.students.app.service.StudentAdministrationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Lina on 2017.06.19.
 */
@WebServlet(value = "/getStudentDetailInfo")
public class GetStudentInfoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       int id = Integer.valueOf(req.getParameter("id"));

        StudentAdministrationService service = new StudentAdministrationService();
        StudentDetailInfo studentDetailInfo = service.getStudentDetailInfo(id);

        req.setAttribute("studentDetailInfo", studentDetailInfo);

        req.getRequestDispatcher("StudentDetail.jsp").forward(req, resp);
    }

}
