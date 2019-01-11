package cursojava.workshop.persistencia;

import javax.persistence.EntityManager;

import cursojava.workshop.modelo.MercadoException;


public class Persistencia <E>{

	private Class<E> classe;
	protected EntityManager em;
	
	public Persistencia(Class<E> classe) {
		this.classe = classe;
		em = ConexaoJpa.criarEntityManager();
	}
	
	public void abrirTransacao(){
		em.getTransaction().begin();
	}
	
	public void commitTransacao(){
		em.getTransaction().commit();
	}
	
	public void fechar(){
		em.close();
	}
	

	public void incluir(E v) throws MercadoException{
		try {
			abrirTransacao();
			em.persist(v);
			commitTransacao();
		} catch (Exception e) {
			throw new MercadoException("Erro ao realizar a inclus?o");
		}
	}
	
	public void excluir(Object id) throws MercadoException{
		try {
			abrirTransacao();
			E obj = em.find(classe, id);
			em.remove(obj);
			commitTransacao();
		} catch (Exception e) {
			throw new MercadoException("Erro ao realizar a exclus?o");
		}
	}
	
	public E alterar(E v) throws MercadoException{
		try {
			abrirTransacao();
			E obj = em.merge(v);
			commitTransacao();
			return obj;
		} catch (Exception e) {
			throw new MercadoException("Erro ao realizar a altera??o");
		}
	}
	
	public E consultar(Object id) throws MercadoException{
		try {
			return em.find(classe, id);
		} catch (Exception e) {
			throw new MercadoException("Erro ao realizar a consulta");
		}
	}
	
}
