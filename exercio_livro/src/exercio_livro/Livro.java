package exercio_livro;

public class Livro implements Publicacao {
	private String tiulo;	
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	

	public String detalhes() {
		return "Livro [tiulo=" + tiulo + "\n, autor=" + autor + "\n, totalPaginas=" + totalPaginas + "\n, pagAtual="
				+ pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor + "]";
	}

	public Livro(String tiulo, String autor, int totalPaginas, Pessoa leitor) {
		super();
		this.tiulo = tiulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = true;
		this.pagAtual = 0;
		this.leitor = leitor;
	}


	public String getTiulo() {
		return tiulo;
	}

	public void setTiulo(String tiulo) {
		this.tiulo = tiulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void folhear(int pagina) {
		if(pagina > this.totalPaginas) {
			this.pagAtual =0;
		}else {
			this.pagAtual= pagina;
		}
		
	}

	@Override
	public void avancarPage() {
		 this.pagAtual++;
		
	}

	@Override
	public void voltarPage() {
		this.pagAtual--;
	}
	
	
	
	
	
	
	

}
