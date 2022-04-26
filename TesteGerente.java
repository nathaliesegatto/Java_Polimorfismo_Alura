
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco Rocha");
		g1.setCpf("22334251386");
		g1.setSalario(9000.0);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salário: R$ " + g1.getSalario());
		
		boolean autenticou = g1.autentica(23465);
		
		System.out.println("Senha correta: " + autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
