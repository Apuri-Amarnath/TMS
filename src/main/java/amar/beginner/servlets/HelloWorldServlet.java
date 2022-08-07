package amar.beginner.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloWorldServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws jakarta.servlet.ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse resp) throws jakarta.servlet.ServletException, IOException {
        String usernamePostedByTheBrowser = servletRequest.getParameter("username");
        System.out.println(usernamePostedByTheBrowser);
        resp.setContentType("text/html");//setting the content type
        PrintWriter pw = resp.getWriter();//get the stream to write the data

//writing html in the stream
        pw.println("<html><body>");
        pw.println("Welcome to servlet");
        pw.println("Welcome to servlet");
        pw.println("Welcome to servlet");
        pw.println("Welcome to servlet");
        pw.println("Welcome to servlet");
        pw.println("</body></html>");

        pw.close();//closing the stream

    }

    @Override
    public String getServletInfo() {
        return "good servlet";
    }

    @Override
    public void destroy() {

    }
}