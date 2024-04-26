package oop.webApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oop.webApp.model.RegisterBean;
import oop.webApp.service.IRegisterService;
//import oop.webApp.service.RegisterDeo;
import oop.webApp.service.RegisterServiceImpl;

@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddUserServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String upwd = request.getParameter("pass");
		String uemail = request.getParameter("email");
		String umobile = request.getParameter("repass");
		
		PrintWriter out = response.getWriter();
		out.print(uname);
		out.print(upwd);
		out.print(uemail);
		out.print(umobile);
		
		/*
		//doGet(request, response);
		RequestDispatcher dispatcher = null;
		response.setContentType("text/html");
		try {
		
		RegisterBean registerBean = new RegisterBean();
		
		registerBean.setuName(request.getParameter("name"));
		registerBean.setuMail(request.getParameter("email"));
		registerBean.setuPass(request.getParameter("pass"));
		registerBean.setuR_Pass(request.getParameter("re_pass"));
		
		IRegisterService iRegisterService = new RegisterServiceImpl();
		iRegisterService.addUser(registerBean);
		
		request.setAttribute("user", registerBean);
		dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		*/
		//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		//dispatcher.forward(request, response);
		
//		RegisterDeo registerDeo = new RegisterDeo();
//
//		String userRegistered = null;
//		try {
//			userRegistered = registerDeo.registerUser(registerBean);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		if(userRegistered.equals("SUCCESS")) {
//			request.setAttribute("user", registerBean);
//			RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/user.jsp");
//			requestDispatcher.forward(request, response);
//		}else {  //On Failure, display a message to the User.
//			request.setAttribute("errMessage", userRegistered);
//			request.getRequestDispatcher("signup.jsp").forward(request, response);
//		}	
	}	
}
