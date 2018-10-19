package org.proxi.spring.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.proxi.spring.dao.CrudClientDAO;
import org.proxi.spring.model.Client;
import org.proxi.spring.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * La ServletConnexion permet de rediriger vers la page d'accueil si les Login et Password fixés sont bons. Dans le cas contraire elle renvoi vers une JSP avec un message d'erreur 
 * @author Adminl
 *
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Autowired
	CrudClientDAO dao;
	
	public ServletConnexion() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String pwd = request.getParameter("password");

		Conseiller cons = new Conseiller(login, pwd);

		HttpSession maSession = request.getSession();
		maSession.setAttribute("conseillerlog", cons);
		
		try {
			List<Client> maListe = dao.findAll();
			maSession.setAttribute("CleClient", maListe);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
//		response.sendRedirect("accueil.jsp");
		
		// TODO : remettre l'acces avec mot de passe ci dessous
		

		if (("yann".equalsIgnoreCase(login)) && ("yann".equalsIgnoreCase(pwd))) {

			response.sendRedirect("accueil.jsp");

		} else {

			response.sendRedirect("loginErreur.jsp");
		}

		doGet(request, response);
	}
}
