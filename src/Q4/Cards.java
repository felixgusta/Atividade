package Q4;

public class Cards {
    private String nome;
    private String tipo;
    private String efeito;

    public Cards(String nome, String tipo,String efeito) {
        this.nome = nome;
        this.tipo = tipo;
        this.efeito = efeito;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEfeito() {
		return efeito;
	}

	public void setEfeito(String efeito) {
		this.efeito = efeito;
	}
    
}
  

