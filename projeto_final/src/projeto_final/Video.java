package projeto_final;

public class Video implements AcoesVideo {
	
	private String Titulo;
	private int review;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	

	public Video(String titulo) {
	
		Titulo = titulo;
		this.review = 1;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	
	

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		this.reproduzindo = true;
	
		
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}

	@Override
	public void like() {
		this.curtidas++ ;
	
		
	}




	@Override
	public String toString() {
		return "Video [Titulo=" + Titulo + ", review=" + 
	             review + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	

}
