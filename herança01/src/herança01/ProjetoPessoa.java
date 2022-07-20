package herança01;

public class ProjetoPessoa {

	public static void main(String[] args) {
		
		
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		
		p1.setNome("jOSÉ");
		p2.setNome("marcia");
		p3.setNome("Saitama");
		p4.setNome("Cleonice");
		
		
		p2.setCurso("Informatica ");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		
		p3.receberAumento(550.20f);
		p2.cancelarMatricula();
		p4.mudarTrabalho();
		
		
		System.out.println(p1.toString());
		
		
		
		
	
	}

}
