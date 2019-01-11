package br.com.senaigo.onzevencedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senaigo.onzevencedor.dao.ClubeDAO;
import br.com.senaigo.onzevencedor.entity.Clube;
import lombok.Getter;

@Service("clubeService")
public class ClubeService {

	@Getter
	@Autowired
	private ClubeDAO dao;

	public List<Clube> getAllClubes() {
		return dao.findAll();
	}

	public List<Clube> getClubesByName(String nomeClube) {
		return dao.findByName(nomeClube);
	}

	public Clube createClube(Clube clube) {
		return dao.create(clube);
	}

	public void updateClube(Clube clube) {
		dao.update(clube);
	}

	public void deleteClube(Clube clube) {
		dao.delete(clube);
	}

	public void setDao(ClubeDAO dao) {
		this.dao = dao;
	}
}