package State;

public abstract class PortaAutomatica {
	public void clicarBotaoAbrir() {
		System.out.println("Porta ir� abrir ");
	}

	public void clicarBotaoFechar() {
		System.out.println("porta ir� fechar");
	}

	public void fimCicloAbertura() {
		System.out.println("acabou o ciclo abertura");
	}

	public void Time() {
		System.out.println("acabou o tempo");
	}
	public void portaAutomatica() {
		System.out.println("qual o estado da porta");
		
	}
}