package projeto_final;

public class ProjetoVideo {

	public static void main(String[] args) {
		
		
		Video video[] = new Video[3];

		
		video[0] = new Video("Aula 1 de JAVA POO");
		video[1] = new Video("Aula 12 de   PHP");
		video[2] = new Video("Aula 3 de HTML5");
		
		
		Usuario user[] = new Usuario[2];
		
		user[0] = new Usuario(" Hugo", 22, " Masculino", "Otakusafado");
		user[1] = new Usuario(" Julia", 22, " Feminino", "EGIRLINHAsafada");
		
		/*System.out.println(video[0].toString());
		System.out.println();
		System.out.println(user[1].toString());
		System.out.println();
		System.out.println(video[2].toString());
		
		video[1].play();*/
		
		
		Visualizacao visu = new Visualizacao(user[0], video[1]);
		System.out.println(visu.toString());
		
	
	}

}
