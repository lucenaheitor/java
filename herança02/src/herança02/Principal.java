package heran?a02;

public class Principal {

	public static void main(String[] args) {
		
		
		Visitante visitante = new Visitante();
		
		visitante.setNome(" Carlos");
		visitante.setIdade(22);
		visitante.setSexo(" masculino");
		System.out.println(visitante.toString());
		
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Pedro");
		aluno.setMatricula(451412451-0);
		aluno.setCurso("Medicina");
		aluno.pagarMensalidade();
		
		System.out.println(aluno.toString());
		
		Bolsista bolsista = new Bolsista();
		bolsista.setNome("Lucas");
		bolsista.renovarBolsa();
		bolsista.setMatricula(1622285);
		bolsista.setBolsa(15);
		bolsista.pagarMensalidade();
		System.out.println(bolsista);

	}

}
