package State;

public abstract class PortaAberta implements EstadoPorta {
	public void clicarBotaoAbrir() {
		System.out.println("Porta irá abrir ");
	}

	public void clicarBotaoFechar() {
		System.out.println("estou abrindo a porta");
	}

	public void fimCicloAbertura() {
		System.out.println("e assim a vida segue");
	}

	public void Time() {
		System.out.println("acabou o tempo");
	}

	

  
}
