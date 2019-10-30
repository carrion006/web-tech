import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mysql.jdbc.*;

public class application extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int rollno = Integer.parseInt(req.getParameter("roll"));
		try{
			Driver driver = new Driver();  
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/students","root","Hindustan@123"
				);
			PreparedStatement ps = con.prepareStatement("SELECT * FROM details WHERE rollno = ?");
			ps.setInt(1, rollno);
			out.println("<html><body><table border=1>");
			out.println("<caption>Result:</caption>");
			ResultSet rslt = ps.executeQuery();
			ResultSetMetaData rs = rslt.getMetaData();
			int total = rs.getColumnCount();
			out.println("<tr>");
			for(int i=1;i<=total;i++){
				out.println("<th>" + rs.getColumnName(i) + "</th>");
			}
			out.print("</tr>");
			while(rslt.next()){
				out.print("<tr><td>" + rslt.getInt(1) + "</td><td>" + rslt.getString(2) + "</td><td>" + rslt.getInt(3) + "</td><td>" + rslt.getInt(4) + "</td><td>" + rslt.getInt(5) + "</td><td>" + rslt.getFloat(6) + "</td><td>" + rslt.getString(7) + "</td></tr>");
			}
			out.println("</table>");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			out.close();
		}
	}
} 
