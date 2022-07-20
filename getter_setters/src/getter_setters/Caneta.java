package getter_setters;

public class Caneta {
	public String modelo;
	 private float ponta;
	 private String cor;
	 private boolean tampada;
	 	 
	 
	public Caneta (String modelo, String cor, float ponta, boolean tampada) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampada = tampada;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean getTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public void status() {
		System.out.println( "Modelo da caneta: " +this.modelo);
		System.out.println("Qual a ponta: " + this.ponta);
		System.out.println("A  cor é: "+ this.cor);
		System.out.println("Esta tampada ou destampada? "+ this.tampada);
	}
	 
	 

}
