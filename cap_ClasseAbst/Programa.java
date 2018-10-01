package cap_ClasseAbst;

public class Programa {

	public static void main(String[] args) {
		
		Diretor paulo = new Diretor();
		
		paulo.setNome("Paulo");
		paulo.setSetor("Almoxarifado");
		paulo.setSalario(12);
		
		Presidente pedro = new Presidente();
		
		System.out.println(paulo.getBonificacao());
		System.out.println(paulo.getNome());
		System.out.println(paulo.getSetorGerencia());
		
		//Autenticavel diretor = new Diretor();
		
		
	
		
		SecretariaAdministrativa fernanda = new SecretariaAdministrativa();
		fernanda.setNome("Fernanda");
		fernanda.setNomeDaSecretaria("Esportes");
		fernanda.setSalario(10);
		
		System.out.println(fernanda.getNome());
		System.out.println(fernanda.getBonificacao());
		System.out.println(fernanda.getNomeDaSecretaria());
		
		paulo.autentica(123);
		pedro.autentica(234);
		
	

	}

}
