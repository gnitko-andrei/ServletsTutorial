package net.proselyte.setvletstutorial;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletResponseDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        String title = "HTTP Servlet Response Demo";
        String docType = "<!DOCTYPE html>";

        writer.println(docType +
                "<html>\n" + "<head><title>" + title + "</title></head>\n" +
                "<body>"  + response.getContentType() + "</body>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }

}
