// Contrato "Autentic�vel":
	// Quem assina esse contrato, precisa implementar:
		// M�todo setSenha;
		// M�todo autentica.


public abstract interface Autenticavel {
	
	
	public abstract void setSenha(int senha); //apenas a assinatura, pois obrigar� os filhos a implementarem esse m�todo
	
	public abstract boolean autentica(int senha); //apenas a assinatura, pois obrigar� os filhos a implementarem esse m�todo
	

}
