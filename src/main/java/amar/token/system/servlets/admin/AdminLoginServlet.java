package amar.token.sytem.servlets.admin;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AdminLoginServlet implements Servlet {
    private static final String ADMIN_USER_NAME = "sysadmin";
    private static final String ADMIN_USER_PWD = "sysAdm!n";
    @Override
    public void init(ServletConfig servletConfig) throws jakarta.servlet.ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse resp) throws jakarta.servlet.ServletException, IOException {
        resp.setContentType("text/html");//setting the content type
        PrintWriter pw = resp.getWriter();//get the stream to write the data
        pw.println("<html><body>");
        String usernamePostedByTheBrowser = servletRequest.getParameter("username");
        String pwdPostedByTheBrowser = servletRequest.getParameter("password");
        if (usernamePostedByTheBrowser.equals(ADMIN_USER_NAME) && ADMIN_USER_PWD.equals(pwdPostedByTheBrowser)) {
            pw.println("Welcome to servlet");
        } else {
            pw.println("Neevu awaru?");
        }
        pw.println("</body></html>");
        pw.close();
    }

    @Override
    public String getServletInfo() {
        return "good servlet";
    }

    @Override
    public void destroy() {

    }
}