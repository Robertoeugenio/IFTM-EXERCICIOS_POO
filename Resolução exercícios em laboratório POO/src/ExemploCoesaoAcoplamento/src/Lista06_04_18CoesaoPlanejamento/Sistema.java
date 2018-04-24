package OCP;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {

		CalculadoraDeSalario calculadora = new CalculadoraDeSalario(1.0);
		
		Funcionario rodrigo = new Proprietario("Rodrigo", 20000.0);
		Funcionario roberto = new Gerente("Roberto", 10000.0);
		Funcionario robson = new Vendedor("Robson", 5000.0, 500.0, 100.0);
		Funcionario keilane = new Assistente("Keilane", 3000.0);
		Funcionario gabriel = new Supervisor("Gabriel", 7500.0);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(rodrigo);
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		funcionarios.add(gabriel);
		
		for (Funcionario funcionario : funcionarios)
			System.out.printf("%s: %s - Salário: R$%.2f\n", funcionario.getCargo(), funcionario.getNome(), calculadora.calcula(funcionario));
	}
}