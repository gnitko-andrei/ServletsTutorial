package net.proselyte.servletstutorial;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class LocaleDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Locale locale = new Locale("uk_UA");
//        Locale locale = new Locale("us_US");

        String language = locale.getLanguage();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String docType = "<!DOCTYPE html>";
        String title = "Locale Demo";

        PrintWriter writer = response.getWriter();

        if (locale.getLanguage().equalsIgnoreCase("uk_ua")) {
            title = "Демонстрация локализации";
            writer.println(docType + "<html>" +
                    "<head>" +
                    "<title>" + title +
                    "</title>" +
                    "</head>" +
                    "<body>" +
                    "<h1>Данные локализации: </h1>" +
                    "<h2>Локализация: </h2>" + locale +
                    "<h2>Язык:  </h2>" + language +
                    "</body>" +
                    "</html>");
        } else {
            writer.println(docType + "<html>" +
                    "<head>" +
                    "<title>" + title +
                    "</title>" +
                    "</head>" +
                    "<body>" +
                    "<h1>Locale Details: </h1>" +
                    "<h2>Locale: </h2>" + locale +
                    "<h2>Language:  </h2>" + language +
                    "</body>" +
                    "</html>");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
