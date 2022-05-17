
public class TestaSistema {

	public static void main(String[] args) {
		Gerente_1 g1 = new Gerente_1();
		g1.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(333);
		
		Cliente cliente = new Cliente ();
		cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(adm);
		 
	}

}
