
public class Enfermeiro extends Funcionario {

	public Enfermeiro(String nome, String setor) {
		super(nome, setor);
	}

	public void executarFuncao() {
		System.out.println(getSetor() + " com o nome " + getNome()  +  " medica os pacientes");

	}
}
