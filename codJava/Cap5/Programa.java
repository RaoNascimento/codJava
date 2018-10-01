package Cap5;
//EH muito comum que os atributos sejam private e os métodos public.

public class Programa {

	public static void main(String[] args) {
		
		//minhaConta.setLimite(200);
		Cliente pedro = new Cliente("pedro", 19);
		Conta contaPedro = new Conta(pedro);
		
		pedro.mudaCPF("10047148667");
		pedro.setEndereco("Rua tunisia, 385, Canaa");
		
		contaPedro.deposita(800);
		contaPedro.deposita(800);
		contaPedro.saca(200);
		
		System.out.println(contaPedro.dadosDoCliente());
		System.out.println(pedro.infoCliente());
		
		Cliente paulo = new Cliente("Paulo", 61);
		Conta contaPaulo = new Conta(paulo);
		
		paulo.mudaCPF("10047739984");
		paulo.setEndereco("Rua cantagalo 531, Aparecida");
		
		contaPaulo.deposita(1500);
		contaPaulo.saca(500);
		
		System.out.println(contaPaulo.dadosDoCliente());
		System.out.println(paulo.infoCliente());
		
		
		

		
		
		
		
	}

}
