package Lista06_04_18CoesaoAcoplamento;

public class Vendedor extends Funcionario {
	
	private double  salario, meta, totalVendas;
	

	
	public Vendedor(String nome, double salarioBase, double totalVendas, double meta) {
		super(nome, salarioBase);

	}
	
	public double calculaSalario() {
		
		if (totalVendas > meta)
			salario = getSalarioBase() + (totalVendas * 0.03) + 50 + getIncentivo();
		else
			salario = getSalarioBase() + (totalVendas * 0.03) + getIncentivo();
		
		return salario;
	}
}