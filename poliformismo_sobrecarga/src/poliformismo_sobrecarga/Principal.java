package poliformismo_sobrecarga;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro  dog = new Cachorro();
		Lobo wolf = new Lobo();
		
		
		dog.emitirSom();
		wolf.emitirSom();
		dog.setPeso(13);
		dog.reagir("Comida");
		dog.reagir(false);
		
		

	}

}
