
public class Conta {

		int numero;
		Cliente titular = new Cliente(); //String é uma classe em java
		double saldo;
		
		//variaveis criadas fora da classe main são chamadas de variáveis de objeto ou atributo
		
		void saca(double quantidade) { //variavel temporaria
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo; //O this mostra que estamos acessando a varíavel da classe chamada atributo ou var de obj
		}
		void deposita(double quantidade) {
			this.saldo += quantidade;
		}
		boolean confirmaSaque(double valor) {
			if(this.saldo < valor) {
				return false;
			}
			else {
				//saca(valor);
				//System.out.println(" saldo: "+this.saldo);
				return true;
			}
			
		}
		boolean transferePara(Conta destino, double valor) {
			boolean retirou = this.confirmaSaque(valor);
			
			if(retirou == false) {
				return false;
			}
			else {
				destino.deposita(valor);
				return true;
			}
			
		}
}
