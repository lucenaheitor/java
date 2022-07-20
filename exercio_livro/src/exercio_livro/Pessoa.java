package exercio_livro;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected  String sexo;
	
	public void fazerAniversario() {
		this.idade++;
		
	}

	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome =nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	

}
