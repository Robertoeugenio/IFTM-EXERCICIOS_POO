
public class MainOCP {

	public static void main(String[] args) {
		Enfermeiro enfermeira = new Enfermeiro("Sofia", "Enfermeira");
		Gerente gerente = new Gerente("Roberto ", "Gerente ");
		Medico medica = new Medico("Karynne", "Medica");

		enfermeira.executarFuncao();
		gerente.executarFuncao();
		medica.executarFuncao();

	}
	//metodo chama o metodo da classe funcionario abstract
	public void funcionar (Funcionario funcionario) {
		funcionario.executarFuncao();
	}

}
