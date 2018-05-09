package OCP;
public class Sistema {

	public static void main(String[] args) {
		Veiculo meuCarro = new Veiculo();
		ManipuladorDeEventos mde = new ManipuladorDeEventos(meuCarro);
		
		System.out.println("Modo Esporte");
		mde.mudarModoDirecao(new mEsporte());
		System.out.println("- Pot�ncia alterada para: "+meuCarro.getPotencia());
		System.out.println("- Altura da suspen��o alterada para: "+meuCarro.getAlturaSuspencao());
		
		System.out.println("Modo Aventura");
		mde.mudarModoDirecao(new mAventura());
		System.out.println("- Pot�ncia alterada para: "+meuCarro.getPotencia());
		System.out.println("- Altura da suspen��o alterada para: "+meuCarro.getAlturaSuspencao());
		
		System.out.println("Modo Economico");
		mde.mudarModoDirecao(new mEconomico());
		System.out.println("- Pot�ncia alterada para: "+meuCarro.getPotencia());
		System.out.println("- Altura da suspen��o alterada para: "+meuCarro.getAlturaSuspencao());
		
		System.out.println("Modo Passeio");
		mde.mudarModoDirecao(new mPasseio());
		System.out.println("- Pot�ncia alterada para: "+meuCarro.getPotencia());
		System.out.println("- Altura da suspen��o alterada para: "+meuCarro.getAlturaSuspencao());
		
		
	}

}