package OCP;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salarioBase) {
		super(nome, "Gerente", salarioBase);
	}

	public double calcula() {
		return 2 * getSalarioBase();
	}
}