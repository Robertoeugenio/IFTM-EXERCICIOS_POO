package Lista06_04_18CoesaoPlanejamento;

import org.junit.Test;
import org.junit.Assert;

public class Teste {
	@Test
	public void testeMetodoCalcula() {
		Compra compra = new Compra(100.0, "SAO PAULO");
		System.out.println(new CalculadoraDePrecos().calcula(compra));
		Assert.assertEquals(115, new CalculadoraDePrecos().calcula(compra),0.0001);
	}
}