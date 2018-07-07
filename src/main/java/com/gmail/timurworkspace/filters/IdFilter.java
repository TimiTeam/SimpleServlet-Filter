package com.gmail.timurworkspace.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter("/service")
public class IdFilter implements Filter {


    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("In filter");

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        int id = Integer.parseInt(request.getParameter("id"));

        if (id > 10) {

            chain.doFilter(req, resp);
        }else {
            response.sendRedirect("lowid.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
