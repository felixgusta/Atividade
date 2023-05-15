  package Questao01;

public class Caminhao {
	private String placa;
	private String nomeMotorista;
	private boolean carregaPerecivel;
	
	
	public Caminhao(String placa,String nomeMotorista) {
		this.placa = placa;
		this.nomeMotorista = nomeMotorista;	

	}
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNomeMotorista() {
		return nomeMotorista;
	}
	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}
	public boolean getCarregaPerecivel() {
		return carregaPerecivel;
	}
	public void setCarregaPerecivel(boolean carregaPerecivel) {
		this.carregaPerecivel = carregaPerecivel;
	}

}

