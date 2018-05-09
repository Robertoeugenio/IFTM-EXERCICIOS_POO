package Strategy;

public class MensagemDoDia {
	private DiaDaSemana diadasemana;

	public <DiaDaSemana> MensagemDoDia(Strategy.DiaDaSemana diadasemana) {
		super();
		this.diadasemana = diadasemana;
	}
	
	public static void maind(String[] args) {
		MensagemDoDia print2 = new MensagemDoDia(new SegundaFeira());
		MensagemDoDia print3 = new MensagemDoDia(new TercaFeira());
		MensagemDoDia print4 = new MensagemDoDia(new QuartaFeira());
		MensagemDoDia print5 = new MensagemDoDia(new QuintaFeira());
		MensagemDoDia print6 = new MensagemDoDia(new SextaFeira());
		MensagemDoDia print7 = new MensagemDoDia(new SabadoFeira());
		MensagemDoDia print1 = new MensagemDoDia(new DomingoFira());

		print2.imprime();
		print3.imprime();
		print4.imprime();
		print5.imprime();
		print6.imprime();
		print7.imprime();
		print1.imprime();
	}

	private void imprime() {
		diadasemana.imprimeMensagem();
		
	}
}