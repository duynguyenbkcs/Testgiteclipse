package net.codejava.javaee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/sumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i =  Integer.parseInt(request.getParameter("num1"));
		int j =  Integer.parseInt(request.getParameter("num2"));
		int k = i + j;
		
		//response.getWriter().append("The sum is " + k);
		
		//response.sendRedirect("squareServlet?k="+k); //ULR rewriting
		
		//Session
//		HttpSession session = request.getSession();
//		session.setAttribute("k", k);
		
		//Cookie
		Cookie cookie = new Cookie("k", k + "");
		response.addCookie(cookie);
		response.sendRedirect("squareServlet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
