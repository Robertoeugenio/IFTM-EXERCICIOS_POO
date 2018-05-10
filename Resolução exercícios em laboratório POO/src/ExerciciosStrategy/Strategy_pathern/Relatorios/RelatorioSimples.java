package Relatorios;

public class RelatorioSimples extends CadastroBanco {
	
	@Override
	 void relatorioSimples() {
	 System.out.printf("Banco: %s\n", CadastroBanco.banco);
		System.out.printf("Titular: %s\n", CadastroBanco.nome);
		System.out.printf("Saldo: %s\n", CadastroBanco.saldo);
		System.out.printf("Telefone: %s\n", CadastroBanco.telefone);
	
	}
	@Override
	void relatorioDetalhado() {
		// TODO Auto-generated method stub
		
	}
	 	
	 	
}
