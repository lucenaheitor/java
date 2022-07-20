package polimorfismo01;

public class Ave  extends Animal{
	private String corPenas;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo grãos!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Cantando");
		
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}
	

}
