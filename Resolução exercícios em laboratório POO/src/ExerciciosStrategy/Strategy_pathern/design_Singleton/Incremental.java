package design_Singleton;

public class Incremental {
	private static Sequencia  instancia ;
	private int count = 0;
	private int numero;
	
	private Sequencia () {
		
	}
	
	public static <instancia> Sequencia getInstancia() {
		if(instancia==null) {
			instancia= new Sequencia();
		}
		return instancia;
	}

	public Incremental() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental  ====> " + numero;
	}
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Incremental.count = count;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}



}