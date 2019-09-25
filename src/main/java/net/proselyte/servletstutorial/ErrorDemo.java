package net.proselyte.servletstutorial;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer code = (Integer) request.getAttribute("javax.servlet.error.status_code");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String title = "Error Handling";
        String docType = "<!DOCTYPE html>";

        writer.println(docType + "<html>\n" +
                "<head>" +
                "<title>" + title + "</title>" +
                "</head>" +
                "<body>"
                );

        writer.println("<h1>Error information</h1>");
        writer.println("Code: " + code);

        writer.println("</body>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
