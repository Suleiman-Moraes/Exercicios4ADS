package cursojava.workshop.execucao;

import java.util.Date;

import cursojava.workshop.modelo.Cep;
import cursojava.workshop.modelo.Cliente;
import cursojava.workshop.modelo.EnumUf;
import cursojava.workshop.modelo.Municipio;
import cursojava.workshop.modelo.Pedido;
import cursojava.workshop.modelo.Produto;
import cursojava.workshop.persistencia.CepDao;
import cursojava.workshop.persistencia.ClienteDao;
import cursojava.workshop.persistencia.MunicipioDao;
import cursojava.workshop.persistencia.PedidoDao;
import cursojava.workshop.persistencia.ProdutoDao;

public class TesteContatoJpa {
	public static void main(String[] args) {
		try {
			MunicipioDao municipioDao = new MunicipioDao();
			Municipio municipio = null;
			municipio = new Municipio();
			municipio.setDescricao("Goiânia");
			municipio.setUf(EnumUf.GO);
//			municipio.setId(1);
			municipio = municipioDao.alterar(municipio);
			
			CepDao dao = new CepDao();
			Cep cep = new Cep();
			cep.setCep("74356800");
			cep.setBairro("Real Conquista");
			cep.setLogradouro("Rua RC 37");
			cep.setMunicipio(municipio);
			cep = dao.alterar(cep);
			
			Cliente cliente = new Cliente();
			cliente.setEmail("suleimanmoraes@gmail.com");
			cliente.setNome("Suleiman Moraes");
			cliente.setSenha("12345678");
			cliente.setCep(cep);
			ClienteDao d4 = new ClienteDao();
			cliente = d4.alterar(cliente);
			
			Produto produto = new Produto();
			produto.setDescricao("Coca-Cola");
			produto.setFoto("Latinha de Coca trincando");
			produto.setPreco(2);
			ProdutoDao d3 = new ProdutoDao();
			produto = d3.alterar(produto);
			
			Produto p2 = new Produto();
			p2.setDescricao("Coca-Cola Média");
			p2.setFoto("Garrafinha de Coca trincando");
			p2.setPreco(2.5);
			p2 = d3.alterar(p2);
			
			Pedido pedido = new Pedido();
			pedido.setData(new Date());
			pedido.setCliente(cliente);
			pedido.addProduto(produto);
			pedido.addProduto(p2);
			PedidoDao d2 = new PedidoDao();
			pedido = d2.alterar(pedido);
			
			System.out.println("Deu bom");
		} catch (Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
	}
}