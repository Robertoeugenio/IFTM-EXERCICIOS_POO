
public class Gerente extends Funcionario {

	public Gerente(String nome, String setor) {
		super(nome, setor);
	
	}
	public void executarFuncao(){
		System.out.println(getSetor() + " com o nome " + getNome()  +  " cuida dos empregados");		
	}

}
