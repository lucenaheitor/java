package exercio_livro;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		
		Pessoa[] pessoa= new Pessoa[3];
		Livro[] livro = new Livro[3];
		
		pessoa[0] = new Pessoa("Vitor", 21, "Masculino");
		pessoa[1] = new Pessoa("Sakura", 18, "Feminino");
		pessoa[2] = new Pessoa("Genivaldo", 43, "Helicoptero de combate GH-1863");

		livro[0]= new Livro("Java edi��o 8 ", " jesus cristo ",  900, pessoa[0]);
		livro[1] = new Livro("Competitive programing ", "Deus ", 350, pessoa[1] );
		livro[2] = new Livro("POO C++ ", "Microsoft ", 400, pessoa[2]);
		
		
		livro[0].abrir();
		livro[0].folhear(1000);
		System.out.println(livro[0].detalhes());
	}

}
