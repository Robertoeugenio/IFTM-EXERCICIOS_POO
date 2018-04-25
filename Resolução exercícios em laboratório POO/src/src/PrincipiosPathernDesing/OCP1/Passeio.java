package OCP1;

public class Passeio extends ManipuladorDeEventos {

	public Passeio(Veiculo veiculo) {
		super(veiculo);
		public void mudarModoDirecao(veiculo){
	        switch (modoDirecao){
	                veiculo.setPotencia(400);
	                veiculo.setAlturaSuspencao(20);
	 	}
		
	}
}

