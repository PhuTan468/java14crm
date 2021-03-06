package cybersoft.javabackend.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="userServlet", urlPatterns = {
		"/user"
})
public class UserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException{
		req.getRequestDispatcher("/WEB-INF/views/user/user.jsp").forward(req, resp);
	}
}
