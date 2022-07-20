package polimorfismo01;

public class Repetil  extends Animal{
	
	private  String corEscama;

	@Override
	public void locomover() {
		System.out.println("Rastajando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comer  sua mãe");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Repetil: ");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
