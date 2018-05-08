package Strategy_pathern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Amostrador {
	private int[] populacao;

	public Amostrador(int[] codigosZip) {
		populacao = codigosZip;
	}

	public int[] selecionaSubconjunto(int tamanhoAmostra, int[] populacao) {
		return null;
	}

	public int[] getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int[] populacao) {
		this.populacao = populacao;
	}
}