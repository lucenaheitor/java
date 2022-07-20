package polimorfismo01;

public class Mamifero  extends Animal{
	
	private String corPelo;

	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("mAMANDO!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
	
	
	
	
	

}
