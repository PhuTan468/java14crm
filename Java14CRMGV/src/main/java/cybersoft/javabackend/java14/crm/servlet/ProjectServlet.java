package cybersoft.javabackend.java14.crm.servlet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="projectServlet", urlPatterns = {
		"/project"
})
public class ProjectServlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp ) throws  IOException, ServletException{
			req.getRequestDispatcher("/WEB-INF/views/project/project.jsp")
			.forward(req, resp);
		}
}
