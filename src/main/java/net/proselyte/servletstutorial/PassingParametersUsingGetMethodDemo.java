package net.proselyte.servletstutorial;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PassingParametersUsingGetMethodDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        String title = "Passing parameters using GET method";

        String docType = "<!DOCTYPE html>";

        writer.println(
                "<html>\n" +
                        "<head><title>" + title + "</title></head>" +
                        "<body><h2>Speciality: </h2>" +
                        request.getParameter("speciality") +
                        "<h2>Experience: </h2>" +
                        request.getParameter("experience") +
                        "</body>\n" + "</html>"

        );
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

}
