package projeto_final;

public class Visualizacao {
	protected Usuario viwer;
	protected Video Filme;
	
	
	
	public Visualizacao(Usuario viwer, Video filme) {
		super();
		this.setViwer(viwer);
		Filme = filme;
	}



	public Usuario getViwer() {
		return viwer;
	}



	public void setViwer(Usuario viwer) {
		this.viwer = viwer;
	}



	public Video getFilme() {
		return Filme;
	}



	public void setFilme(Video filme) {
		Filme = filme;
	}



	@Override
	public String toString() {
		return "Visualizacao [viwer=" + viwer + ", Filme=" + Filme + "]";
	}
	
	
	
	
	
	
	
	
	

}
