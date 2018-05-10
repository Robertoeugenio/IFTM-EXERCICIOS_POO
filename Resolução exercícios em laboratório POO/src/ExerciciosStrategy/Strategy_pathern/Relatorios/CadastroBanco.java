package Relatorios;

public abstract class CadastroBanco {
	public static String nome;
	public static String endereco;
	public static String telefone;
	public static String email;
	public static String banco;
	public static String agencia;
	public static String conta;
	public static double saldo;
	public static String dataCadastral;

	
	final void cadastroCliente() {
		relatorioSimples();
		relatorioDetalhado();
	}

	abstract void relatorioSimples();
	abstract void relatorioDetalhado();

	
}