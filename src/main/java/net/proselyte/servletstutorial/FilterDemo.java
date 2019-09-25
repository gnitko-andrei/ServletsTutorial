package net.proselyte.servletstutorial;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class FilterDemo implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String ipAdress = request.getRemoteAddr();
        String dateTime = new Date().toString();

        System.out.println("\n\n==============================================\n");

        System.out.println("Request");
        System.out.println("Date/Time: " + dateTime);
        System.out.println("IP: " + ipAdress);

        System.out.println("\n\n==============================================\n");
        filterChain.doFilter(request, response);
    }

    public void destroy() {

    }
}
