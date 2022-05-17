// Contrato "Autenticável":
	// Quem assina esse contrato, precisa implementar:
		// Método setSenha;
		// Método autentica.


public abstract interface Autenticavel {
	
	
	public abstract void setSenha(int senha); //apenas a assinatura, pois obrigará os filhos a implementarem esse método
	
	public abstract boolean autentica(int senha); //apenas a assinatura, pois obrigará os filhos a implementarem esse método
	

}
