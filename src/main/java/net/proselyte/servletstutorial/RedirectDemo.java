package net.proselyte.servletstutorial;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RedirectDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String docType = "<!DOCTYPE html>";
        String title = "Redirect Demo";
        String redirectionWebsite = "https://proselyte.net/";
        PrintWriter writer = response.getWriter();

        writer.println(docType + "<html>" +
                "<head>" +
                "<title>" + title +
                "</title>" +
                "</head>" +
                "<body>" +
                "<h1>You will be redirected to https://proselyte.net/</h1>" +
                "</body>" +
                "</html>"
        );

        response.setStatus(response.SC_MOVED_PERMANENTLY);
        response.setHeader("Location", redirectionWebsite);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
