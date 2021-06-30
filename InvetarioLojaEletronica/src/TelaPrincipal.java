package arquivoLojaEletronica;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TelaPrincipal {
	
	protected void criarTelaPrincipalPrincipal() {
		
		int jTelaPrincipalWidth = 720, widthPanel = 700;
		int jTelaPrincipalHight = 1080, heightPanel = 100;
		
		int fotoLargura = 600, fotoAltura = 400;
		
		byte espaco = 10, espacoC = 100, alturaBuscaPincipal = 100, alturaNomeProduto = 50, alturaCategoriaImportante = 70, alturaPreco = 60;
		
		int alturaProximoPanel = 0;


		JFrame TelaPrincipal = new JFrame();
		
		TelaPrincipal.setTitle("Loja de Eletrônica");

		//about size, color and visibility of window
		TelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaPrincipal.setResizable(false);
		TelaPrincipal.setLayout(null);
		TelaPrincipal.setSize(jTelaPrincipalWidth,jTelaPrincipalHight);

		TelaPrincipal.getContentPane().setBackground(Color.decode("#000000"));
		TelaPrincipal.setLocationRelativeTo(null);
		
		
		
		/*BUSCA PANEL*/

		JPanel BuscaPanel = new JPanel();		
		BuscaPanel.setBackground(Color.decode("#39ffe5"));
		BuscaPanel.setBounds(10, 0, widthPanel, alturaBuscaPincipal); 

		
		JLabel BuscaLabel = new JLabel();
		
		BuscaLabel.setText("BUSCA");
		BuscaLabel.setForeground(Color.white);
		BuscaLabel.setFont(new Font("Monospace",Font.PLAIN,90));
		//kilometragemLabel.setVerticalAlignment((JLabel.CENTER);
		//kilometragemLabel.setHorizontalAlignment(JLabel.CENTER);	   

		/*BUSCA PANEL*/
		
		
		
		/*nomeProduto PANEL*/

		JPanel nomeProdutoPanel = new JPanel();		
		nomeProdutoPanel.setBackground(Color.decode("#219dd4"));
		nomeProdutoPanel.setBounds(10, (alturaBuscaPincipal + espaco), widthPanel, alturaNomeProduto); 

		
		JLabel nomeProdutoLabel = new JLabel();
		
		nomeProdutoLabel.setText("Nome e Marca do Produto");
		nomeProdutoLabel.setForeground(Color.white);
		nomeProdutoLabel.setFont(new Font("Monospace",Font.PLAIN,40));
		//kilometragemLabel.setVerticalAlignment((JLabel.CENTER);
		//kilometragemLabel.setHorizontalAlignment(JLabel.CENTER);	   

		/* Nome Produto PANEL*/
		
		
		
		/* FOTO DO PRODUTO */
		
		JPanel fotoProdutoPanel = new JPanel();		
		fotoProdutoPanel.setBackground(Color.decode("#312a00"));
		fotoProdutoPanel.setBounds((jTelaPrincipalWidth-fotoLargura)/2 , 
				(alturaBuscaPincipal + alturaNomeProduto + 3*espaco), 
				fotoLargura, 
				fotoAltura); 

		
		JLabel fotoProdutoLabel = new JLabel();
		
		fotoProdutoLabel.setText("foto do Produto");
		fotoProdutoLabel.setForeground(Color.white);
		fotoProdutoLabel.setFont(new Font("Monospace",Font.PLAIN,40));
		
		/* FOTO DO PRODUTO */
				
		
		
		/* caracteristica importante 00 */
		
		JPanel caracteristicaImportante00ProdutoPanel = new JPanel();		
		caracteristicaImportante00ProdutoPanel.setBackground(Color.decode("#03de00"));
		caracteristicaImportante00ProdutoPanel.setBounds(10,
				alturaBuscaPincipal + alturaNomeProduto + fotoAltura + 4*espaco,
				widthPanel,
				alturaCategoriaImportante); 

		
		JLabel caracteristicaImportante00ProdutoLabel = new JLabel();
		
		caracteristicaImportante00ProdutoLabel.setText("caracteristica Importante 00");
		caracteristicaImportante00ProdutoLabel.setForeground(Color.white);
		caracteristicaImportante00ProdutoLabel.setFont(new Font("Monospace",Font.PLAIN,alturaCategoriaImportante-30));
		
		/* caracteristica importante 00 */
		
		
		
		/* preco Produto PANEL*/

		JPanel precoProdutoPanel = new JPanel();		
		precoProdutoPanel.setBackground(Color.decode("#f45a00"));
		precoProdutoPanel.setBounds(10,
				alturaBuscaPincipal + alturaNomeProduto + fotoAltura + alturaCategoriaImportante + 5*espaco,
				widthPanel,
				alturaPreco); 

		
		JLabel precoProdutoLabel = new JLabel();
		
		precoProdutoLabel.setText("preco");
		precoProdutoLabel.setForeground(Color.white);
		precoProdutoLabel.setFont(new Font("Monospace",Font.PLAIN,alturaPreco-10));	   

		/*preco Produto PANEL*/
		
		
		
		/* busca caracteristica especifica */
		
		JPanel buscaCaracteristicaEspecificaPanel = new JPanel();		
		buscaCaracteristicaEspecificaPanel.setBackground(Color.decode("#00f4d4"));
		buscaCaracteristicaEspecificaPanel.setBounds(10,
				alturaBuscaPincipal + alturaNomeProduto + fotoAltura + alturaCategoriaImportante + alturaPreco + 6*espaco,
				widthPanel,
				alturaPreco); 

		
		JLabel buscaCaracteristicaEspecificaLabel = new JLabel();
		
		buscaCaracteristicaEspecificaLabel.setText("Busca caracteristica Especifíca");
		buscaCaracteristicaEspecificaLabel.setForeground(Color.white);
		buscaCaracteristicaEspecificaLabel.setFont(new Font("Monospace",Font.PLAIN,alturaPreco-20));	
		
		/* busca caracteristica especifica */
		
		
		
		/* ESPECIFICACOES */
		
		JPanel EspecificacoesGeraisPanel = new JPanel();		
		EspecificacoesGeraisPanel.setBackground(Color.decode("#00d7f4"));
		EspecificacoesGeraisPanel.setBounds(10,
				alturaBuscaPincipal + alturaNomeProduto + fotoAltura + alturaCategoriaImportante + 2*alturaPreco + 6*espaco,
				widthPanel,
				alturaPreco); 

		
		JLabel EspecificacoesGeraisLabel = new JLabel();
		
		EspecificacoesGeraisLabel.setText("Caracteristica Gerais");
		EspecificacoesGeraisLabel.setForeground(Color.white);
		EspecificacoesGeraisLabel.setFont(new Font("Monospace",Font.PLAIN,alturaPreco-20));
		
		/* ESPECIFICACOES */
		
		
		
		//BUSCA
		BuscaPanel.add(BuscaLabel);
		TelaPrincipal.add(BuscaPanel);
		BuscaPanel.setVisible(true);
		
		//nomeProduto
		nomeProdutoPanel.add(nomeProdutoLabel);
		TelaPrincipal.add(nomeProdutoPanel);
		nomeProdutoPanel.setVisible(true);
		
		//preco Produto
		precoProdutoPanel.add(precoProdutoLabel);
		TelaPrincipal.add(precoProdutoPanel);
		precoProdutoPanel.setVisible(true);
		
		//caracteristica importante Produto
		caracteristicaImportante00ProdutoPanel.add(caracteristicaImportante00ProdutoLabel);
		TelaPrincipal.add(caracteristicaImportante00ProdutoPanel);
		caracteristicaImportante00ProdutoPanel.setVisible(true);
		
		//preco Produto
		fotoProdutoPanel.add(fotoProdutoLabel);
		TelaPrincipal.add(fotoProdutoPanel);
		fotoProdutoPanel.setVisible(true);
		
		//busca caracteristica especifica Produto
		buscaCaracteristicaEspecificaPanel.add(buscaCaracteristicaEspecificaLabel);
		TelaPrincipal.add(buscaCaracteristicaEspecificaPanel);
		buscaCaracteristicaEspecificaPanel.setVisible(true);
		
		//caracteristicas gerais Produto
		EspecificacoesGeraisPanel.add(EspecificacoesGeraisLabel);
		TelaPrincipal.add(EspecificacoesGeraisPanel);
		EspecificacoesGeraisPanel.setVisible(true);
		
		
		
		TelaPrincipal.setVisible(true);
		
	}

}
