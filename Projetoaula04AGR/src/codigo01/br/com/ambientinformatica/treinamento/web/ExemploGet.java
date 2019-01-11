package codigo01.br.com.ambientinformatica.treinamento.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExemploGet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String nascimento = request.getParameter("nascimento");

		out.println("<html>");
		out.println("<head><title>Servlet1</title></head>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("<p>"+ nome + " nasceu em " + nascimento +".</p>");
		out.println("</body>");
		out.println("</html>"); 
		out.close();
	}
}
