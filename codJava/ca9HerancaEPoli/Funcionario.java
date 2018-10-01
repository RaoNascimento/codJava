package ca9HerancaEPoli;

public class Funcionario {
	
	protected String nome; //Protected fica entre o private e o public só é visível a propria classe 
	protected String cpf; //a classe filha e as classes que estão no mesmo pacote 
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonificacao() {
		return this.salario*0.10+100;
	}
	

}
