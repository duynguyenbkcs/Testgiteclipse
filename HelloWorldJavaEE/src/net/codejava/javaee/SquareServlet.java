package net.codejava.javaee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/squareServlet")
public class SquareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SquareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//int k = Integer.parseInt(request.getParameter("k")); //ULR rewriting
		
//		HttpSession session = request.getSession(); //Session
//		int k = (int) session.getAttribute("k");
		
		int k = 0;
		Cookie cookies[] = request.getCookies();
		for (Cookie c: cookies) {
			if (c.getName().equals("k")){
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		k = k * k;
		response.getWriter().append("k is : " + k);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
