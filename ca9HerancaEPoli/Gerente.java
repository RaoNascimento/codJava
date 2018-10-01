package ca9HerancaEPoli;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		}
		else {
			System.out.println("Acesso negado");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	/*@Override // reescrita de método 
	public double getBonificacao() {
		return this.salario*0.15+100;
	}*/
	@Override
	public double getBonificacao() {
		return super.getBonificacao()*1.05;
		//usando o super é possível buscar um método da classe mãe e fazer 
		//as alterações, evitando muitos métodos repetidos como acontece com o @override
	}

}
