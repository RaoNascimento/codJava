package cap_ClasseAbst;

public class Diretor extends Gerente implements Autenticavel{
	private String setorGerencia;
	//private int senha;

	public String getSetorGerencia() {
		return "Setor:"+setorGerencia;
	}

	public void setSetor(String setor) {
		this.setorGerencia = setor;
	}
	/*public boolean autentica(int senha) {
		if(this.senha != senha) {
			return false;
		}
		return true;
	}*/

}
