package fabricaDeCarros;

public class programaCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "verde";
		meuCarro.modelo = "fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		//liga o carro
		meuCarro.liga();
		//acelera o carro
		meuCarro.acelera(50);
		meuCarro.modelo = "98";
		meuCarro.pegarMarcha();
		
		Carro testeCarro = new Carro();
		testeCarro.liga();
		System.out.println(meuCarro.velocidadeAtual);
		System.out.println(meuCarro.pegarMarcha());
		
		//usando a classe motor
		
		Carro carroComMotor = new Carro();
		Motor motor = new Motor();
		
		

	}

}
