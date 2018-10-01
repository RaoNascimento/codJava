
public class programa {

	public static void main(String[] args) { //void - metodos que fazem um serviço e não retornam info. ao usuário
		// TODO Auto-generated method stub
		Conta minhaConta;
		minhaConta = new Conta();
		Cliente clienteDaMinhaConta = new Cliente();
		
		minhaConta.titular = clienteDaMinhaConta; //Desta forma apontam para o mesmo espaço na memória
		//clienteDaMinhaConta.nome = "Raoni"; mesma coisa de baixo
		//minhaConta.titular.nome = "Raoni";
		minhaConta.saldo = 1000.0;
		
		System.out.println(minhaConta.titular.nome);
		//System.out.println(clienteDaMinhaConta.nome); mesma coisa de cima
		
		Conta suaConta;
		suaConta = new Conta();
		Cliente clienteDaSuaConta = new Cliente();
		suaConta.titular = clienteDaSuaConta;
		suaConta.saldo = 2000.0;
		
		//System.out.println("Saldo atual: "+ minhaConta.saldo);
		//saca 200
		//minhaConta.saca(200);
		//deposita 500
		minhaConta = suaConta; //Quando uma referencia recebe outra referencia, quando trocar valor de suaConta depois o valor da minha conta tb sera alterado pq recebe a posiçãio e não o valor 
		minhaConta.deposita(500);
		minhaConta.confirmaSaque(200);
		suaConta.confirmaSaque(500);
		
		//System.out.println(minhaConta.saldo);
		//System.out.println(minhaConta.coonfirmaSaque(200));
		System.out.println(minhaConta.saldo);
		
		suaConta.transferePara(minhaConta, 500);
		System.out.println(minhaConta.saldo);
		
		Conta testeConta;
		testeConta = new Conta();
		testeConta.titular.nome = "Nome sem instanciar no main";
		System.out.println(testeConta.titular.nome);
	}
	

}
