package cap_ClasseAbst;

public abstract class Secretaria extends Funcionario {
	private String nomeDaSecretaria;

	public String getNomeDaSecretaria() {
		return "Secretaria de "+nomeDaSecretaria;
	}

	public void setNomeDaSecretaria(String nomeDaSecretaria) {
		this.nomeDaSecretaria = nomeDaSecretaria;
	}
	

}
