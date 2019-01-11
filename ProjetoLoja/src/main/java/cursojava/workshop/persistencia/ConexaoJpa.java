package cursojava.workshop.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoJpa {

	private static EntityManagerFactory emf;
	
	private static EntityManagerFactory criarEntityManagerFactory(){
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("exemplo");
		}
		return emf;
	}
	
	public static EntityManager criarEntityManager(){
		return criarEntityManagerFactory().createEntityManager();
	}
	
}

