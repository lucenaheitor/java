package tipos_primitivos;

public class TesteTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int idade = 30;
		String valor = Integer.toString(idade);
		System.out.println(valor);*/
		
		String valor = "30.5";
		//int idade - Integer.parseInt(valor)
		float  idade = Float.parseFloat(valor);
		System.out.printf("%.3f", idade);
				

	}

}
