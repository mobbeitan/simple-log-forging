import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

public class VulnerableLogExample extends HttpServlet {

    private static final Logger logger = Logger.getLogger(VulnerableLogExample.class.getName());

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        // Get user input from the request body
        String userMessage = request.getParameter("message");

        logger.warning("logging user message");
    }
}
