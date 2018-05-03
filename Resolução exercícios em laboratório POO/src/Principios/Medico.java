
public class Medico extends Funcionario {

	public Medico(String nome, String setor) {
		super(nome, setor);
		
	}
	public void executarFuncao(){
		System.out.println(getSetor() + " com o nome " + getNome()  +  " opera os pacientes");		
	}
}
