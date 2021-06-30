package arquivoLojaEletronica;

public class FerrosSolda {
	
	public FerrosSolda(
			String marca, 
			double preco, 
			int potencia, 
			int tensao, 
			int temperaturaMaxima, 
			boolean controleDeTemperatura,
			String LocalProduzido,
			int garantia,
			int referencia,
			int codigoBarras,
			String informacoes
			) {
		
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
		this.tensao = tensao;
		this.temperaturaMaxima = temperaturaMaxima; 
		this.controleDeTemperatura = controleDeTemperatura;
		this.LocalProduzido = LocalProduzido; 
		this.garantia = garantia;
		this.referencia = referencia;
		this.codigoBarras = codigoBarras;
		this.informacoes = informacoes;		
		
	}
	
	String marca = "null", LocalProduzido = "null", informacoes = "null";
	double preco = 0;
	int potencia = 0, tensao = 0, temperaturaMaxima = 0, garantia = 0, referencia = 0, codigoBarras =0;
	boolean controleDeTemperatura= false;
	
	
	FerrosSolda ferro00 = new FerrosSolda("Hikari",(2.5),60,220,450,false,"China",3,12345,456,"nenhuma");


	
	 

}
