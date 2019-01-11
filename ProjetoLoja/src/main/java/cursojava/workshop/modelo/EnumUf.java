package cursojava.workshop.modelo;
public enum EnumUf{
        
    AC("Acre"),
    AL("Alagoas"),
    AP("Amap�"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Cear�"),
    DF("Distrito Federal"),
    ES("Esp�rito Santo"),
    GO("Goi�s"),
    MA("Maranh�o"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Par�"),
    PB("Para�ba"),
    PE("Pernambuco"),
    PR("Paran�"),
    PI("Piau�"),
    RJ("Rio De Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rond�nia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SE("Sergipe"),
    SP("S�o Paulo"),
    TO("Tocantins");
    
    private String descricao;
    
	EnumUf(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}