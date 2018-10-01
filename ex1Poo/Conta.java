package ex1Poo;


public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data data = new Data();
	
	void saca(double valor) {
		saldo = this.saldo - valor;
	}
	void deposita(double valor) {
		saldo = this.saldo + valor;
	}
	public double calculaRendimento(double saldoAtual) {
		double rendimento = saldoAtual - this.saldo;
		return rendimento;
		
	}
	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", data=" + data.toString()+ "]";
	}
	
	

}
