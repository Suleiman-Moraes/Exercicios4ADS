package cursojava.workshop.modelo;

public enum EnumSexo {
	M("Masculino"), F("Feminino");

	private String desc;

	EnumSexo(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
}
