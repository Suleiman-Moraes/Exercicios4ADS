package codigo01.br.com.ambientinformatica.treinamento.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExemploPost extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String salario = request.getParameter("salario");
		out.println("<html>");
		out.println("<head><title>Exemplo de Servlet com requisição do Post</title></head>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("<pre>");
		out.println("Nome: " + nome.toUpperCase());
		out.println("Endereco: " + endereco.toUpperCase());
		out.println("Salario: " + salario);
		out.println("</pre>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
