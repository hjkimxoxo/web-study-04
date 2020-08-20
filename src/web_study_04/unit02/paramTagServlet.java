package web_study_04.unit02;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/actionTag")
public class paramTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userID = request.getParameter("userID");
		String loginCheck= request.getParameter("loginCheck");

//		
//		String user = URLEncoder.encode("고객님","UTF-8");
//		String admin = URLEncoder.encode("관리자","UTF-8");
		
		//<%-- <%=URLDecoder.decode(request.getParameter("userName"),"UTF-8") %>
		//(<%=request.getParameter("userID")%>)님 환영합니다. --%>
		
		if(loginCheck.equals("user")) {
			request.setAttribute("name", "고객님");
			request.setAttribute("userID", userID);
			
			RequestDispatcher dispatcher =request.getRequestDispatcher("09_userMain.jsp"); 
			dispatcher.forward(request, response);
		}else {
			request.setAttribute("name", "관리자");
			request.setAttribute("userID", userID);
			
			RequestDispatcher dispatcher =request.getRequestDispatcher("09_managerMain.jsp"); 
			dispatcher.forward(request, response);
		}
		
	}

}
