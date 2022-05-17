
public class TesteReferencias {

	public static void main (String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos Rocha");
		String nome = g1.getNome();

		System.out.println(nome);
		
		Funcionario g2 = new Gerente_1();  // FUNCIONA PORQUE GERENTE É FUNCIONÁRIO.
		String nome1 = g2.getNome();  // SÓ PODE CHAMAR MÉTODOS QUE ESTEJAM PREVISTOS NA CLASSE FUNCIONÁRIO.

		System.out.println(nome1);
		
		
	}
	
}
