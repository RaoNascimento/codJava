package cap_ClasseAbst;

public class Presidente extends Gerente implements Autenticavel {
	
	@Override
	public double getBonificacao() {
		return this.salario * 2;
	}
	

}
