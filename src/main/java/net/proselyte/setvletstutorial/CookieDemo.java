package net.proselyte.setvletstutorial;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie sessionId = new Cookie("session_id", request.getRemoteAddr() + new Date().toString());
        Cookie languade = new Cookie("language", request.getLocale().toString());

        response.addCookie(sessionId);
        response.addCookie(languade);

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        String title = "Cookies Demo";
        String dockType = "<!DOCTYPE html>";

        Cookie[] cookies = request.getCookies();

        writer.println(dockType + "<html><head><title>" + title +
                "</title></head><body>"
        );

        if(cookies != null) {
            writer.println("Cookies");
            for (int i = 0; i < cookies.length; i++){
                writer.println("<hr/>");
                writer.println("Name: " + cookies[i].getName());
                writer.println("<br/>");
                writer.println("Value: " + cookies[i].getValue());
                writer.println("<hr/>");
            }
        } else {
            writer.println("No cookies");
        }

        writer.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
