package OCP;

public abstract class Funcionario {
	private String nome;
	private String cargo;
	private double salarioBase;
	
	public Funcionario(String nome, String cargo, double salarioBase) {
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}

	public abstract double calcula();
	
	public String getNome() {return nome;}
	public String getCargo() {return cargo;}
	public double getSalarioBase() {return salarioBase;}
}