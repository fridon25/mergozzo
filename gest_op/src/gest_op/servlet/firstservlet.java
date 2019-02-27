package gest_op.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class firstservlet
 */
@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public firstservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//Cookie(nome,valore)
		
		String iddipendente=request.getParameter("dati");
		Cookie[] cookies = request.getCookies();
		if(cookies == null || cookies.length == 0 )
		{
			//operazione eseguita dal server 
			//per passare al client uno o più cookies
			//che il client deve memorizzare
			Cookie mioCookie = new Cookie("iddipendente", iddipendente);
			response.addCookie(mioCookie);
			
		}
		else
		{
			for (int i=0; i < cookies.length; i++)
			{
				System.out.println(cookies[i].getName() + " " + cookies[i].getValue());
			}
			
		}
		HttpSession sessione = request.getSession();
		
		if (sessione.getAttribute("iddipendente") == "")
		{
			sessione.setAttribute("iddipendente", iddipendente);
		}
		
		System.out.println(sessione.getAttribute("iddipendente"));
//		System.out.println(iddipendente);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>" + iddipendente + "</body></html>");
		
	}

}
