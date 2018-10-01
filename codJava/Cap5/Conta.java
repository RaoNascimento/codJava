package Cap5;

public class Conta {
private double saldo;
private double limite = 200;
public Cliente titular;
private static int totalDeContas;

Conta(Cliente cliente){ //Construtor de classe: Com ele vc pode instanciar mais de 1 objeto, nesse caso a classe e o limite
	this.titular = cliente;
	
	System.out.println("Abrindo conta ...");
	Conta.totalDeContas += 1;
	System.out.println("Conta nº ..."+Conta.totalDeContas);
	
}
	//public void setSaldo(double saldo) {
		//this.saldo = saldo;
	//}Cria getters e setters para todos atributos é uma mápratica, pois em alguns casos
	//como nesse, o set foi criado desnecessário pois queremos q usem saca e deposita


	public void deposita(double valor) {
		if(valor < 1)
			System.out.println("vc deve depositar uma quantia válida");
		else {
		this.saldo += valor;
		//System.out.println("ss "+this.saldo);
		}
	}
	public void saca(double valor) {
		this.saldo -= valor;
		//System.out.println("dd "+this.saldo);
		
	}
	
	/*public void setLimite(double limite) {
		this.limite = limite; substituido pelo construtor de classes
	} */

	
	public String dadosDoCliente() {
		return "Conta [saldo=" + saldo + ", limite=" + limite + ", titular=" + this.titular.getNome() +",Endereço:" + this.titular.getEndereco()+ ",Idade: "+this.titular.getIdade()+"]";
	}


	
	

	

	
	

}
