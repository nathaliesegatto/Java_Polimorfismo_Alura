
public class TesteReferencias_1 {

	public static void main(String[] args) {
		
//		Funcionario f = new Funcionario(); // não compila porque "Funcionario" não é mais concreto, e sim abstrato
		Funcionario g1 = new Gerente_1();
		g1.setSalario(9000.0);
	
		EditorVideo_1 ev = new EditorVideo_1();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
