package net.proselyte.setvletstutorial;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StatusCodeDemo extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(403, "Access denied!!!");
//        response.sendRedirect("/SimpleServlet");
//        response.setStatus(404);
    }

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
