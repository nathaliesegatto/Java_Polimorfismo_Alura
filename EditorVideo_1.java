//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo_1 extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de video");
		return 150;
	}	

}
