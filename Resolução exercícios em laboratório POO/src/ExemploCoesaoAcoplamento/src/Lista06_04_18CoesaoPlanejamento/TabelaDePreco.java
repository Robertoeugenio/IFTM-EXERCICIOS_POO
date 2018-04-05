package Lista06_04_18CoesaoPlanejamento;

	public interface TabelaDePreco{
	 double descontoPara(double valor);
	
	 public class TabelaDePreco1 implements TabelaDePreco { 
		 if (valor > 5000)
				return 0.03;
		
	}
	 public class TabelaDePreco2 implements TabelaDePreco { 
		 if (valor > 1000)
				return 0.05;
			return 0;	
	 	}
	  public class TabelaDePreco3 implements TabelaDePreco {
		  if (valor > 14000)
				return 0.15;
			return 0;
		 }
	}