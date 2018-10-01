package ca9HerancaEPoli;

public class ControleBonificacao {
	
	private double totalBonificacao = 0;
	
	public void registra(Funcionario funcionario) {
		this.totalBonificacao += funcionario.getBonificacao();
	}
	
	public double getTotalBonificacao() {
		return this.totalBonificacao;
	}
}
/*Com essa classe o objeto que refencia a classe gerente tambem faz referencia a classe funcionario
o metodo registra recebe um funcionario que pode ser gerente, se for ele vai buscar a bonificação
de 15% que está sobreescrita na classe gerente, se for outro funcionário buscará na classe Funcionario
0.10%. Com isso posso criar quantas classes de funcionario quiser, tendo somente que sobreescrever o método 
em suas classes sem alterar todo restante nem esta classe.


*/