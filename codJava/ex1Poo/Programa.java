package ex1Poo;

public class Programa {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.saldo = 50;
		minhaConta.data.dia = 15;
		minhaConta.data.mes = 05;
		minhaConta.data.ano = 1998;
		minhaConta.titular = "Pedro";
		minhaConta.deposita(200);
		minhaConta.saca(100);
		minhaConta.numero = 155;
		minhaConta.agencia = "3610x";
			
		System.out.println(minhaConta.saldo);
		
		System.out.println(minhaConta.toString());
		System.out.println(minhaConta.calculaRendimento(400));
		System.out.println(minhaConta.saldo);
		
	}

}
