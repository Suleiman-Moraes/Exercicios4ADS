package cursojava.workshop.persistencia;

import javax.persistence.Query;

import cursojava.workshop.modelo.Cliente;
import cursojava.workshop.modelo.MercadoException;

public class ClienteDao extends Persistencia<Cliente> {

	public ClienteDao() {
		super(Cliente.class);
	}
	
	public void incluir(Cliente cliente) throws MercadoException {
		Cliente c = consultar(cliente.getEmail());
		if(c == null){
			super.incluir(cliente);
		}else{
			throw new MercadoException("Já existe um cliente com este email cadastrado.");
		}
	}

	public Cliente autenticar(String email, String senha)
			throws MercadoException {
		try {
			Query query = em
					.createQuery("SELECT c FROM Cliente c WHERE c.email = :email AND c.senha = :senha");
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			return (Cliente) query.getSingleResult();
		} catch (Exception e) {
			throw new MercadoException("Usuário ou senha incorretos");
		}
	}

}
