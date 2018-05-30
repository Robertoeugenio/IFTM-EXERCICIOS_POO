package design_decorator;
public class DTexto implements Texto {

	protected Texto t;
	
	public DTexto(Texto texto) {
		t = texto;
	}

	@Override
	public String escrever() {
		return t.escrever();
		
	}
}