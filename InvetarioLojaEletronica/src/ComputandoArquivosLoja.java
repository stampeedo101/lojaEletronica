package arquivoLojaEletronica;

import javax.swing.SwingUtilities;

public class ComputandoArquivosLoja extends TelaPrincipal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		ComputandoArquivosLoja loja000 = new ComputandoArquivosLoja();
		
		loja000.criarTelaPrincipalPrincipal();
	*/
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				new TelaPrincipal().criarTelaPrincipalPrincipal();
			}
		});
	}

}
