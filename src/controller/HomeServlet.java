package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Utente;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public List<Utente> utentiRegistrati;

	public HomeServlet() {
		super();
		utentiRegistrati = new ArrayList<Utente>();
	}

	public void init(ServletConfig config) throws ServletException {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*String username = request.getParameter("username");
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
				request.getServletContext().getRequestDispatcher("/utenteRegistrato.jsp").include(request, response);
			}else {
				request.getServletContext().getRequestDispatcher("/utenteNonTrovato.jsp").include(request, response);
			}
		}*/

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String nome = request.getParameter("nuovoNome");
		String cognome = request.getParameter("nuovoCognome");
		String mail = request.getParameter("nuovoMail");
		String telefono = request.getParameter("nuovoTelefono");
		String username = request.getParameter("nuovoUsername");
		String password = request.getParameter("nuovoPassword");

		Utente utente = new Utente(nome, cognome, mail, telefono, username, password);

		utentiRegistrati.add(utente);
		
		request.setAttribute("utenti", utentiRegistrati);

		

		request.getServletContext().getRequestDispatcher("/utenteRegistrato.jsp").include(request, response);
		

	}

}
