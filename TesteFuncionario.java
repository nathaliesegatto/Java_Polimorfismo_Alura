
public class TesteFuncionario {

	public static void main(String[] args) {
		
		// Funcionario nico = new Funcionario(); // n�o compila porque "Funcionario" n�o � mais concreto, e sim abstrato
		
				
		Gerente_1 nico = new Gerente_1 ();
		nico.setNome("nico steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2500.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
