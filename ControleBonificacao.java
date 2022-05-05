
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {             // único método acessado por todos os objetos
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}

	public double getSoma() {
		return soma;
	}
	
}
