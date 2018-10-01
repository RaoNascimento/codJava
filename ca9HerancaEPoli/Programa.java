package ca9HerancaEPoli;

public class Programa {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("João Paulo");
		gerente.setSenha(1234);
		gerente.setSalario(1000);
		
		Funcionario atendente = new Funcionario();
		
		atendente.setNome("Fernando Carlos");
		atendente.setSalario(1000);
		
		System.out.println("Salario gerente: "+gerente.getBonificacao());
		System.out.println("Salario atendente: "+atendente.getBonificacao());
		
		//Polimorfismo
		/*Com o polimorfismo além de poder utilizar os métodos e atributos da classe funcionario, o gerente passa a refenci
		 ar um funcionario tb. Ou seja, agora, gerente pertence as duas classes, ainda que em caso de métodos com mesmo nome
		 ele sempre buscará o método da sua classe de origem "Gerente"*/
		
		ControleBonificacao controle = new ControleBonificacao();
		Funcionario funcionarioGerente = new Funcionario();
		
		funcionarioGerente = gerente;
		controle.registra(funcionarioGerente);
		
		System.out.println(controle.getTotalBonificacao());
		
		Funcionario funcionario = new Funcionario();
		funcionario = atendente;
		
		controle.registra(funcionario);
		
		System.out.println(controle.getTotalBonificacao());
		
		
		

	}

}
