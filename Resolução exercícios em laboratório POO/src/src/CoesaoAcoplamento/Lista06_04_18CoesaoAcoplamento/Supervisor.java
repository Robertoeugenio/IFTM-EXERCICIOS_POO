package Lista06_04_18CoesaoAcoplamento;
import java.util.ArrayList;


import java.util.List;
public class Supervisor extends Funcionario{
	
	private double salario;
	
	public Supervisor(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	public double calculaSalario() {
		salario = getSalarioBase() * 1.5 + getIncentivo();
		
		return salario;
	}

}