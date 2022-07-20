package polimorfismo01;

public class Peixe extends Animal {
	private  String Animal;

	@Override
	public void locomover() {
		System.out.println("NADANDO");
	}

	@Override
	public void alimentar() {
		System.out.println("Agua");
	}

	@Override
	public void emitirSom() {
		System.out.println("BLOOP");
	}
	
	public void soltarBolha() {
		System.out.println( "Soltando bolha bloob");
	}

	public String getAnimal() {
		return Animal;
	}

	public void setAnimal(String animal) {
		Animal = animal;
	}
	
	

}
