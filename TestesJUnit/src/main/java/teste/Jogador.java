package teste;

public class Jogador implements Comparable<Jogador>{
	protected int pontos;
	public String nome;

	public Jogador(String nome) {
		this.pontos = 0;
		this.nome = nome;
	}

	public void aumentarPontos() {
		this.pontos ++;
	}
	
	public boolean jaGnahou() {
		return pontos >= 10;
	}
	
	@Override
	public int compareTo(Jogador o) {
		return this.nome.compareToIgnoreCase(o.nome);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
