package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Utente;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public List<Utente> utentiRegistrati;
	private HomeServlet hs;
	
	
    public LoginServlet() {
        super();
        utentiRegistrati = hs.utentiRegistrati;

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession sessione = request.getSession();
		
		boolean check = false;
		
		
		
		
		for(int i=0; i < utentiRegistrati.size(); i++) {
			if(username.equals(utentiRegistrati.get(i).getUsername()) && password.equals(utentiRegistrati.get(i).getPassword())) {
				check = true;
				Utente utenteAutentificato = utentiRegistrati.get(i);
				sessione.setAttribute("utenteAutentificato", utenteAutentificato);
				break;
			}
			if(check == true) {
				request.getServletContext().getRequestDispatcher("/home.jsp").include(request, response);
			}else {
				request.getServletContext().getRequestDispatcher("/utenteNonTrovato.jsp").include(request, response);
			}
		}
	}

}
