package SRP;

public class Veiculo {

	private final int capacidadeTanqueCombustivel;
	private int quantidadeCombustivel;

	public Veiculo(int capacidadeTanque) {
		this.capacidadeTanqueCombustivel = capacidadeTanque;
		quantidadeCombustivel = capacidadeTanque;
	}

	// isto é responsabilidade do veiculo?
	public void reabastecimento() {
		quantidadeCombustivel = capacidadeTanqueCombustivel;
	}

	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

	public void acelerar() {
		quantidadeCombustivel--;
	}
}