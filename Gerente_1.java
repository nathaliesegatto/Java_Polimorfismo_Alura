public class Gerente_1 extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		System.out.println("M�todo de bonifica��o do gerente.");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}
}