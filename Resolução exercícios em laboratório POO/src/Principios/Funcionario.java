
public abstract class Funcionario {
	private String nome;
	private String setor;

	public Funcionario(String nome, String setor) {
		super();
		this.nome = nome;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void executarFuncao(){
		
	}
}
