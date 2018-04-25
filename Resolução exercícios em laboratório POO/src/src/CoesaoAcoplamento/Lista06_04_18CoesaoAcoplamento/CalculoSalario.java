package Lista06_04_18CoesaoAcoplamento;

public class CalculoSalario {
	double incentivo;

	public CalculoSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}

	public double calcula(String cargo, double meta, double totalVendas, double salarioBase) {
		double salario = 0;
		if (cargo == "Gerente") {
			salario = 2 * salarioBase + incentivo;
		}
		if (cargo == "Assistente") {
			salario = salarioBase + incentivo;
		}
		if (cargo == "Supervisor") {
			salario = salarioBase * 1.5 + incentivo;
		}
		if (cargo == "Vendedor") {
			if (totalVendas > meta)
				salario = salarioBase + (totalVendas * 0.03) + 50 + incentivo;
			else
				salario = salarioBase + (totalVendas * 0.03) + incentivo;
		}
		return salario;
	}
}
