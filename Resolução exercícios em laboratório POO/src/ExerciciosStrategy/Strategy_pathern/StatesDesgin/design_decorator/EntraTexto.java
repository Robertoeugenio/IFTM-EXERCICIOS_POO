package design_decorator;
public class EntraTexto implements Texto{

	protected Texto texto;
	
	public EntraTexto(Texto t) {
		texto = t;
	}
	
	@Override
	public String escrever() {
		
		return texto.escrever();
		
	}

}