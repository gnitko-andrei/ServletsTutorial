package net.proselyte.setvletstutorial;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ServletRequestDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String title = "HTTP Request example";

        String contentType = "<!DOCTYPE html>\n";
        writer.println(contentType +"<html>\n" +
                "<body>" +
                "<h1>HTTP Servlet Request example </h1>"
        );

        Enumeration headers = request.getHeaderNames();

        while (headers.hasMoreElements()) {
            String parameterName = (String) headers.nextElement();
            String parameterValue = request.getHeader(parameterName);
            writer.println("<h3>" + parameterName + ": " + parameterValue +
                    "</h3>\n");
        }
        writer.println("</body>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
