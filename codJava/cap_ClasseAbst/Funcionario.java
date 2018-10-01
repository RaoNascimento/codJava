package cap_ClasseAbst;

public abstract class Funcionario {
	protected double salario;
	protected String nome;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double getBonificacao();
	/* O metodo abstrato não pode ser chamado. Ele existe para que todas suas 
	 * classes filhas tenham a obrigação de reescrever este método para existir.  */

}
