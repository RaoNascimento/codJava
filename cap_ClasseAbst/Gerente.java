package cap_ClasseAbst;

public abstract class Gerente  extends Funcionario implements Autenticavel{
	
	private int senha;
	
	@Override
	public double getBonificacao() {
		return this.salario * 2;
	}
	public boolean autentica(int senha) {
		if(this.senha != senha) {
			return false;
		}
		return true;
	}
	

}
