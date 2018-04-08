package Lista06_04_18CoesaoPlanejamento;

public class Gerente extends Funcionario {
	
	private double salario;

	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);
		
	}
	
	public double calculaSalario() {
		salario = 2 * getSalarioBase() + getIncentivo();
		
		return salario;
	}

}