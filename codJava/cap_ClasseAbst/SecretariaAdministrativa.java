package cap_ClasseAbst;

public class SecretariaAdministrativa extends Secretaria {
	
	//private double salario; nao posso colocar o salario aqui senao o valor fica zero
	@Override
	public double getBonificacao() {
		return this.salario * 2;
	}

}
