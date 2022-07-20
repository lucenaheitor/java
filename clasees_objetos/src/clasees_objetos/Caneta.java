package clasees_objetos;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int  carga;
	boolean tampada;
	
	void status() {
		System.out.println("modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada? " + this.tampada);
	}
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO: Caneta tampada"); 
		}else {
			System.out.println("Rabiscando");
		}
	}
	void tampar() {
		this.tampada = true;
		
	}
	 void destampar() {
		 this.tampada = false;
		 
	 }
}
