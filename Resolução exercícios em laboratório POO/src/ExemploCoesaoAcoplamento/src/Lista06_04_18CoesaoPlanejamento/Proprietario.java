package OCP;

public class Proprietario extends Funcionario {
	public Proprietario (String nome, double salarioBase) {
		super(nome, "Proprietario", salarioBase);
	}
	
	public double calcula() {return 2*getSalarioBase();}
}