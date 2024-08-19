import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AddTaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String task = request.getParameter("task");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Task Added: " + task + "</h2>");
        out.println("</body></html>");
    }
}
