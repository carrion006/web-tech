import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;

// 
// Decompiled by Procyon v0.5.36
// 

public class print extends HttpServlet
{
    public void doGet(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.setContentType("text/html");
        final PrintWriter writer = httpServletResponse.getWriter();
        final String parameter = httpServletRequest.getParameter("username");
        final String parameter2 = httpServletRequest.getParameter("pass");
        writer.println("<html><body>");
        writer.println("<h2>GET Username: </h2>" + parameter);
        writer.println("<h2>Password: </h2>" + parameter2);
        writer.println("</body></html>");
    }
}
