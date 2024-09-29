package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class registerServlet
 */
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDowImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        
		//UserDao userDao = new UserDaoImpl();
        if (userDao.addUser(user)) {
        	System.out.println("User added");
            response.sendRedirect("login.jsp?registration=success");
        } else {
            response.sendRedirect("register.jsp?error=1");
        }
	}

}
