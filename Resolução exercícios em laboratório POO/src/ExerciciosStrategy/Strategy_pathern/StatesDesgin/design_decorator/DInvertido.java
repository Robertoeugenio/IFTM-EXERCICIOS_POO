package design_decorator;
public class DInvertido implements Texto {
protected Texto t;
	
	public TextoInvertido(Texto texto) {
		t = texto;
	}

	@Override
	public String escrever() {
		return new StringBuilder(t.escrever()).reverse().toString();
	}
}
