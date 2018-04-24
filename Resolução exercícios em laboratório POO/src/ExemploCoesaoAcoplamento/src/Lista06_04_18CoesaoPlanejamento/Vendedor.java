package OCP;
public class Vendedor extends Funcionario {
	private double totalDeVendas,meta;

	public Vendedor(String nome, double salarioBase, double totalDeVendas,double meta) {
		super(nome,"Vendedor", salarioBase);
		this.totalDeVendas = totalDeVendas;
		this.meta = meta;
	}

	@Override
	public double calcula() {
		if (totalDeVendas > meta) 
			return getSalarioBase() + totalDeVendas*0.3 + 50;
		else
			return getSalarioBase() + totalDeVendas * 0.3;
	}

}