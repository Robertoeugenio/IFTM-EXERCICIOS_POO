package design_Singleton;

public class TesteIncremental {
	public static void main(String[] args) {
		
		sequencia instancia = new sequencia ();
		
		
		for (int i = 0; i < 10; i++) {
			Incremental inc = new Incremental();
			System.out.println(instancia.getNumero() + instancia.getCount());
		}
	}

}
