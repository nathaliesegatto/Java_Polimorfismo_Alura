
public class ControleBonificacao2 {
	
	private double soma;
	
	public void registra(Gerente g) {
		double bonificacao = g.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	public void registra(EditorVideo_1 e) {
		double bonificacao = e.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}

}
