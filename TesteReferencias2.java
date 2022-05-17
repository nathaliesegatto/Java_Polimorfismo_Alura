
public class TesteReferencias2 {

	public static void main (String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos Rocha");
		g1.setSalario(9000.0);
		
//		Funcionario f1 = new Funcionario(); // não compila porque "Funcionario" não é mais concreto, e sim abstrato
		Funcionario f1 = new Designer();
		f1.setNome("Camila Silveira");
		f1.setSalario(3000.0);
		
		EditorVideo_1 e1 = new EditorVideo_1();
		e1.setNome("Elias Buarque");
		e1.setSalario(2500.0);
		

//		ControleBonificacao controle = new ControleBonificacao();
//		controle.registra(g1);
//		controle.registra(f1);
//		controle.registra(e1);

//		System.out.println(controle.getSoma());
		
	}
	
}
