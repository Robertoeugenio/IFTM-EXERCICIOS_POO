package Lista06_04_18CoesaoAcoplamento;

import java.util.ArrayList;
 import java.util.List;

public class Main {
	public static void main(String[] args) {
		CalculoSalario calculadora = new CalculoSalario(5.00);
		
		Funcionario roberto = new Gerente("Roberto", 2000);
		Funcionario robson = new Vendedor("Robson", 1500, 150, 150);
		Funcionario keilane = new Assistente("Keilane", 850);
		Funcionario gabriel = new Supervisor("Gabriel", 3500);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		funcionarios.add(gabriel);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome do funcionario: " + funcionario.getNome()+" Salario Final : "+ funcionario.calculaSalario());
		}
	}
}