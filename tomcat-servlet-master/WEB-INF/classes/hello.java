import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hello extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>Hello World from Java servlet</h1>");
		pw.println("</body></html>");
	}
}