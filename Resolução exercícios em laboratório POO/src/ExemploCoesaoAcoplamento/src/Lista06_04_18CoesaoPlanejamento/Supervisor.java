package OCP;

public class Supervisor extends Funcionario {
	public Supervisor(String nome, double salarioBase) {
		super(nome, "Supervisor", salarioBase);
	}

	@Override
	public double calcula() {return getSalarioBase() * 1.5;}
}