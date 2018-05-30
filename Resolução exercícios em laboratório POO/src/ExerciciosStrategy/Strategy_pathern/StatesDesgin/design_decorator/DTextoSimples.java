package design_decorator;
public class DTextoSimples implements Texto {

	@Override
	public String escrever() {
		
		return "Flamengo Campeão";
		
	}
	
	public static void main(String[] args) {
		
		Texto textoSimples = new DTextoSimples();
		
		Texto textoTag = new DTexto(textoSimples);
		System.out.println(textoTag.escrever());
		
		Texto textoAlto = new TextoCaixaAlta(textoSimples);
		System.out.println(textoAlto.escrever());
		
		Texto textoInvertido = new TextoInvertido(textoSimples);
		System.out.println(textoInvertido.escrever());

		textoTag = new DTexto(new TextoCaixaAlta(textoSimples));
		System.out.println(textoTag.escrever());
	
		textoTag = new DTexto(new TextoInvertido(textoSimples));
		System.out.println(textoTag.escrever());
	
		textoAlto = new TextoCaixaAlta(new TextoInvertido(textoSimples));
		System.out.println(textoAlto.escrever());
		
		Texto texto = new DTexto(new TextoInvertido(new TextoCaixaAlta(textoSimples)));
		System.out.println(texto.escrever());
	}

}