package Lista06_04_18CoesaoAcoplamento;

public class Assistente extends Funcionario {
	private double salario;

public Assistente(String nome, double salarioBase) {
		super(nome, salarioBase);
}

	public double calculaSalario() {
		salario = getSalarioBase() + getIncentivo();

		return salario;
	}

}
