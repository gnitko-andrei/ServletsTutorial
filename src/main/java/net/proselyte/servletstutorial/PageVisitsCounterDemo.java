package net.proselyte.servletstutorial;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PageVisitsCounterDemo extends HttpServlet {
    private volatile  int visitsCounter;

    public void  init() {
        visitsCounter = 0;
    }

    synchronized void increaseAmountOfVisits() {
        visitsCounter++;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        increaseAmountOfVisits();

        response.setContentType("text/html");

        String docType = "<!DOCTYPE html>";
        String title = "Visits Counter Demo";
        PrintWriter writer = response.getWriter();

        writer.println(docType + "<html>" +
                "<head>" +
                "<title>" + title +
                "</title>" +
                "</head>" +
                "<body>" +
                "<h1>Visits amount: </h1>" +
                visitsCounter +
                "</body>" +
                "</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
