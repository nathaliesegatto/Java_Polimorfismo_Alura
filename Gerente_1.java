public class Gerente_1 extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente_1() {  // CONSTRUTOR
		this.autenticador = new AutenticacaoUtil(); // Quando cria a classe cliente, também cria AutenticacaoUtil
	}

	@Override
	public double getBonificacao() {
		System.out.println("Método de bonificação do gerente.");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}
}