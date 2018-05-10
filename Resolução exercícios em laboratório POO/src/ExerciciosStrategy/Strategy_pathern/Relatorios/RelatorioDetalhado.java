package Relatorios;

public class RelatorioDetalhado extends CadastroBanco {

	@Override
	void relatorioDetalhado() {
		System.out.printf("Banco: %s\n", CadastroBanco.banco);
		System.out.printf("Endereço: %s\n", CadastroBanco.endereco);
		System.out.printf("Telefone: %s\n", CadastroBanco.telefone);
		System.out.printf("");
		System.out.printf("Titular: %s\n", CadastroBanco.nome);
		System.out.printf("Agencia: %s\n", CadastroBanco.agencia);
		System.out.printf("Conta: %s\n", CadastroBanco.conta);
		System.out.printf("Saldo: %s\n", CadastroBanco.saldo);
		System.out.printf("E-mail: %s\n", CadastroBanco.email);
		System.out.printf("Data do Cadastro: %s\n", CadastroBanco.dataCadastral);


		
	}

	@Override
	void relatorioSimples() {
		// TODO Auto-generated method stub
		
	}
	
}
