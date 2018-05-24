package design_chainOfResponsability;
public class CalculadoraTroco {

	double troco(Conta conta) {
		ChainMoeda umCentavo = new UmCentavo();
		ChainMoeda cincoCentravo = new CincoCentavos();
		ChainMoeda dezCentavo = new DezCentavos();

		umCentavo.setProximo(cincoCentavo);
		cincoCentavo.setProximo(dezCentavo);
				return umCentavo.troco(conta);

	}
}