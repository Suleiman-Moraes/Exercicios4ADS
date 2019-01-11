package br.com.senaigo.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.senaigo.primefaces.entidade.Usuario;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("usuarioDao")
public class UsuarioDaoJpa extends PersistenciaJpa<Usuario> implements UsuarioDao{

   private static final long serialVersionUID = 1L;

}
