
public class Cliente {

	private int cpf;
	private String nome;
	private int idade;
	private char genero;
	private boolean socio;
	private int codigoDoSocio;
	private int milhagem;

	public Cliente(int cpf, String nome, int idade, char genero, boolean socio, int codigoDoSocio, int mi) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.socio = socio;
		if (socio == true) {
			cadastraMilhagem(codigoDoSocio, mi);
		}
	}

	public void cadastraMilhagem(int codigoDoSocio, int milhagem) {
		this.codigoDoSocio = codigoDoSocio;
		this.milhagem = milhagem;
	}

	@Override
	public String toString() {
		if (this.socio == true) {
			return "Cliente [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", socio="
					+ socio + ", codigoDoSocio=" + codigoDoSocio + ", milhagem=" + milhagem + "]";

		} else
			return "Cliente: \nCpf=" + cpf + "\nNome=" + nome + ", idade=" + idade + ", genero=" + genero;

	}

}
