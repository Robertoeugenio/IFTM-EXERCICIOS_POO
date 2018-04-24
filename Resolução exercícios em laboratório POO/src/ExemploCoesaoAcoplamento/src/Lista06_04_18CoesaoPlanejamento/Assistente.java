package OCP;

public class Assistente extends Funcionario {

	public Assistente(String nome,double salarioBase) {
		super(nome, "Assistente", salarioBase);
	}

	@Override
	public double calcula() {return getSalarioBase();}
}