package design_Observer;
import java.util.ArrayList;
+import java.util.List;
+import java.util.Random;

public class SistemaDeAlarme {
	private List<Monitor> observadores = new ArrayList<>();
	
	void addObservador(Monitor novoObservador) {
		observadores.add(novoObservador);
	}
	
	void monitoraTemperatura() {
		
		Random random = new Random(); 
		int indice = random.nextInt(20);
		System.out.println(indice);
		
		if(indice > 20) {
			dispararAlarme();
		} else {
			System.out.println("Neste momento nenhuma atividade foi constatada");
		}
	}

	private void dispararAlarme() {
		for(Monitor obs : observadores) {
			obs.alarmeDisparado();
		}
	}
	
	public static void main(String[] args) {
		
		DelegaciaPolicia del = new DelegaciaPolicia();
		Seguradora seg = new Seguradora();
		SistemaDeAlarme sist = new SistemaDeAlarme();
		
		sistema.addMonitor(del);
		sistema.addMOnitor(seg);
		
		
		sist.monitoraTemperatura();
		
	}
}