package Cap5;

public class Cliente {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	
	Cliente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void mudaCPF(String cpf) {
		if(this.idade <= 60) {
		validaCPF(cpf);
		this.cpf = cpf;
		}
		this.cpf = cpf;
	}
	private void validaCPF(String cpf) { //exemplo de uso metodo private - Só pode ser usado (chamado dentro do método)
		System.out.println("Cpf validado");
	}
	
	public String infoCliente() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	
	

}
