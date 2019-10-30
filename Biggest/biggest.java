import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class biggest extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int n3 = Integer.parseInt(request.getParameter("n3"));
		out.println("<html><body>");
		if(n1 > n2 && n1 > n3)
			out.println("n1 ( " + n1 + ") is greater");
		else if(n2 > n1 && n2 > n3)
			out.println("n2 (" + n2 + ") is greater");
		else if(n3 > n1 && n3 > n2)
			out.println("n3 (" + n3 + ") is greater");
		out.println("</body></html>");
	}
}
