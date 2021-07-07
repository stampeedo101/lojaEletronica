package arquivoLojaEletronica;

public class FerrosSolda {
	
	private String retornaControleTemperatura(boolean controle) {
		if(controle) {
			return "sim";
		}else {
			return "não";
		}
	}

	public FerrosSolda(
			String tipoProduto,
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
		
		this.tipoProduto = tipoProduto;
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
	
	public String getTipoProduto() {
		return marca;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getLocalProduzido() {
		return LocalProduzido;
	}
	public void setLocalProduzido(String localProduzido) {
		LocalProduzido = localProduzido;
	}
	public String getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	public int getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public boolean isControleDeTemperatura() {
		return controleDeTemperatura;
	}
	public void setControleDeTemperatura(boolean controleDeTemperatura) {
		this.controleDeTemperatura = controleDeTemperatura;
	}

	private String tipoProduto;
	private String marca;
	private String LocalProduzido;
	private String informacoes;
	private double preco;
	private int potencia;
	private int tensao; 
	private int temperaturaMaxima; 
	private int garantia;
	private int referencia; 
	private int codigoBarras;
	private boolean controleDeTemperatura;
	
	public String toString() {
		return "Ferro de Solda " + marca + "\nLocal Produzido: " + LocalProduzido + "\nInformacoes: " + informacoes
				+ "\nPreço: R$ " + preco + "\nPotência: " + potencia + " W\nTensão: " + tensao + " V\nTemperatura Máxima: "
				+ temperaturaMaxima + " °C\nGarantia: " + garantia + " meses\nReferência: " + referencia + "\nCódigo de Barras: "
				+ codigoBarras + "\nControle de Temperatura: " + retornaControleTemperatura(controleDeTemperatura);
	}
	
	
	//FerrosSolda ferro000 = new FerrosSolda("Hikari",(45.52),60,220,450,false,"China",3,12345,456,"nenhuma");
	//FerrosSolda ferro001 = new FerrosSolda("Vonder", 60.68, 50, 110, 410, false, "Nicaragua", 6, 12346, 457, "nenhuma");


	
	 

}
