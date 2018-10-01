package cap_ClasseAbst;

public class SistemaInterno {
	public void login(Autenticavel a) {
		int senha = 123;
		boolean ok = a.autentica(senha);
	}

}
