package cap_ClasseAbst;

public class Cliente implements Autenticavel {
	private int senha;
	
		@Override
		public boolean autentica(int senha) {
			if(this.senha != senha) {
				return false;
			}
			return true;
	
	}
}
