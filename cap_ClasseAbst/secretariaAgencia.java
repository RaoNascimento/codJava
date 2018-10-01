package cap_ClasseAbst;

public class secretariaAgencia extends Secretaria {
	
private double salario;
	
	@Override
	public double getBonificacao() {
		return this.salario * 2;
	}

}
