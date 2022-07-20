package poliformismo_sobrecarga;

public class Cachorro  extends Lobo{
	
	
	@Override
	public  void emitirSom() {
		System.out.println("latir");
	}
	
	public void reagir( String frase) {
		if( frase== "Comida" || frase == "Olá") {
			System.out.println("Feliz");
		}else{
			System.out.println("Rosnar pra essa cadela ? ");
		}
		
	}
	
	public void reagir( int hora, int min) {
		if( hora <=12) {
			System.out.println("Abanar rabo");
			
		}else if( hora <=18) {
			System.out.println("Ignorar");
			
		}else {
			System.out.println("Latir");
		}
		
	}
	public void reagir(boolean dono) {
		if( dono == true) {
			System.out.println("Ficar feliz");
			
		}else {
			System.out.println("Morder");
		}
		
	}
	
	public void reagir( int idade, float peso) {
		if(idade <= 5){
			if( peso <= 10) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
			
		}else {
			if(peso <= 10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
			
		}
	}

}  
