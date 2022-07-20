package herança02;

public class Bolsista  extends Aluno{
	private  int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Bolsa renovada: " + this.getNome());
		
	}
	@Override
	public  void pagarMensalidade() {
		System.out.println(this.getNome() + " Bolsista, 15% de Descoonto");
		
	}
	public int getBolsa() {
		return bolsa;
	}
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
	

}

