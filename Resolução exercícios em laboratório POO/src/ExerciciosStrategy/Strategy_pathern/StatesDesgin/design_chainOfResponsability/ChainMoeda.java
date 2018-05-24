package design_chainOfResponsability;
public abstract class ChainMoeda {
	
	private ChainMoeda proximo;

	public ChainMoeda getProximo() {
		return proximo;
	}

	public void setProximo(ChainMoeda proximo) {
		this.proximo = proximo;
	}
	
	abstract double troco(Conta conta);
	
	
}