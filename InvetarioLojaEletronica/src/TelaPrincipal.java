package arquivoLojaEletronica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class TelaPrincipal implements ActionListener{
	
	/*
	static JTextField FIND_TEXT;
	static JFrame TELA_PRINCIPAL;
	static JButton FIND_BUTTON;
	static JLabel LABEL_TEST;
	*/
	
	/*
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if (s.equals("submit")) {
			// set the text of the label to the text of the field
			LABEL_TEST.setText(FIND_TEXT.getText()); 
			System.out.println("O botão foi clicado com valor = " + FIND_TEXT.getText());

			// set the text of field to blank
			FIND_TEXT.setText("  ");
		}
	}
	*/
	
	JTextField findText;
	JButton findButton;
	JLabel promptLabel,contentsLabel;
	
	
	void criarTelaPrincipalPrincipal() {
		
		int jTelaPrincipalWidth = 720, widthPanel = 700;
		int jTelaPrincipalHight = 1080, heightPanel = 100;
		
		int fotoLargura = 600, fotoAltura = 400;
		
		byte espaco = 10, espacoC = 100, alturaFindPincipal = 100, alturaNomeProduto = 50, alturaCategoriaImportante = 70, alturaPreco = 60;
		
		int alturaProximoPanel = 0;


		JFrame telaPrincipalFrame = new JFrame();
		JLabel LABEL_TEST = new JLabel("nothing entered");
		
		
		telaPrincipalFrame.setTitle("Loja de Eletrônica");

		//about size, color and visibility of window
		telaPrincipalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaPrincipalFrame.setResizable(false);
		telaPrincipalFrame.setLayout(null);
		telaPrincipalFrame.setSize(jTelaPrincipalWidth,jTelaPrincipalHight);

		telaPrincipalFrame.getContentPane().setBackground(Color.decode("#000000"));
		telaPrincipalFrame.setLocationRelativeTo(null);
		
		
		
		/*Find PANEL*/


		
		
		
		/* icone Menu */
		//w=103px h=90px
		JPanel IconeMenuPanel = new JPanel();		
		IconeMenuPanel.setBackground(Color.decode("#39ffe5"));
		IconeMenuPanel.setBounds(10, 0, 105, alturaFindPincipal); 

		/* menu icon Menu */
		//w=103px h=90px
		
		Icon menuIcon = new ImageIcon("images/IconeLojaEletronica.png");

		JButton menuButton = new JButton(menuIcon);

		menuButton.setBackground(Color.GRAY);		
		menuButton.setBounds(10, 5, 103, 90);
		
		
		
		/* find panel */
		
		JPanel IconeFindPanel = new JPanel(new BorderLayout());		
		IconeFindPanel.setBackground(Color.decode("#39ffe5"));
		IconeFindPanel.setBounds(120, 0, 700-110-110, alturaFindPincipal); 

		/* find label */
		
		JLabel findLabel = new JLabel();
		findLabel.setBounds(120, 0, 700-110-120, alturaFindPincipal-10);
		//findLabel.setFont(new Font("Monospace",Font.PLAIN,40));
		
		JTextField findText = new JTextField();
		findText.setFont(new Font("Monospace", Font.PLAIN,40));
		//textField.setBounds(120, 0, 700-110-120, alturaFindPincipal-10);
		findLabel.setDisplayedMnemonic(KeyEvent.VK_N);
		
		String x = findText.getText();
		
		System.out.println(x);
		
		/* Find button */
		
		Icon findIcon = new ImageIcon("images/IconeBusca.png");
		findButton = new JButton("reverse");
		findButton.setBackground(Color.gray);
		findButton.setBounds(610, 5, 90, 90);
		
		//TelaPrincipal obje = new TelaPrincipal();

		
		findText = new JTextField(10);
		findText.setActionCommand("myTF");
		
		findText.addActionListener(this);
		findButton.addActionListener(this);

		


		/* Find button */

		
		
		/*nomeProduto PANEL*/

		JPanel nomeProdutoPanel = new JPanel();		
		nomeProdutoPanel.setBackground(Color.decode("#219dd4"));
		nomeProdutoPanel.setBounds(10, (alturaFindPincipal + espaco), widthPanel, alturaNomeProduto); 

		
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
				(alturaFindPincipal + alturaNomeProduto + 3*espaco), 
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
				alturaFindPincipal + alturaNomeProduto + fotoAltura + 4*espaco,
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
				alturaFindPincipal + alturaNomeProduto + fotoAltura + alturaCategoriaImportante + 5*espaco,
				widthPanel,
				alturaPreco); 

		
		JLabel precoProdutoLabel = new JLabel();
		
		precoProdutoLabel.setText("preco");
		precoProdutoLabel.setForeground(Color.white);
		precoProdutoLabel.setFont(new Font("Monospace",Font.PLAIN,alturaPreco-10));	   

		/*preco Produto PANEL*/
		
		
		
		/* Find caracteristica especifica */
		
		JPanel FindCaracteristicaEspecificaPanel = new JPanel();		
		FindCaracteristicaEspecificaPanel.setBackground(Color.decode("#00f4d4"));
		FindCaracteristicaEspecificaPanel.setBounds(10,
				alturaFindPincipal + alturaNomeProduto + fotoAltura + alturaCategoriaImportante + alturaPreco + 6*espaco,
				widthPanel,
				alturaPreco); 

		
		JLabel FindCaracteristicaEspecificaLabel = new JLabel();
		
		FindCaracteristicaEspecificaLabel.setText("Find caracteristica Especifíca");
		FindCaracteristicaEspecificaLabel.setForeground(Color.white);
		FindCaracteristicaEspecificaLabel.setFont(new Font("Monospace",Font.PLAIN,alturaPreco-20));	
		
		/* Find caracteristica especifica */
		
		
		
		/* ESPECIFICACOES */
		
		JPanel EspecificacoesGeraisPanel = new JPanel();		
		EspecificacoesGeraisPanel.setBackground(Color.decode("#00d7f4"));
		EspecificacoesGeraisPanel.setBounds(10,
				alturaFindPincipal + alturaNomeProduto + fotoAltura + alturaCategoriaImportante + 2*alturaPreco + 6*espaco,
				widthPanel,
				alturaPreco); 

		
		JLabel EspecificacoesGeraisLabel = new JLabel();
		
		EspecificacoesGeraisLabel.setText("Caracteristica Gerais");
		EspecificacoesGeraisLabel.setForeground(Color.white);
		EspecificacoesGeraisLabel.setFont(new Font("Monospace",Font.PLAIN,alturaPreco-20));
		
		/* ESPECIFICACOES */
		
		
		/*
		//Find
		FindPanel.add(FindLabel);
		TelaPrincipal.add(FindPanel);
		FindPanel.setVisible(true);
		*/
		
		//Panel Find		
		telaPrincipalFrame.add(IconeMenuPanel);
		IconeMenuPanel.setVisible(true);
		
		telaPrincipalFrame.add(menuButton);
		menuButton.setVisible(true);
		
		findLabel.setLabelFor(findText);
		IconeFindPanel.add(findLabel);
		telaPrincipalFrame.add(IconeFindPanel);
		IconeFindPanel.add(findText,BorderLayout.CENTER);
		
		IconeFindPanel.setVisible(true);
	
		
		telaPrincipalFrame.add(findButton);
		findButton.setVisible(true);
		
		//nomeProduto
		nomeProdutoPanel.add(nomeProdutoLabel);
		telaPrincipalFrame.add(nomeProdutoPanel);
		nomeProdutoPanel.setVisible(true);
		
		//preco Produto
		precoProdutoPanel.add(precoProdutoLabel);
		telaPrincipalFrame.add(precoProdutoPanel);
		precoProdutoPanel.setVisible(true);
		
		//caracteristica importante Produto
		caracteristicaImportante00ProdutoPanel.add(caracteristicaImportante00ProdutoLabel);
		telaPrincipalFrame.add(caracteristicaImportante00ProdutoPanel);
		caracteristicaImportante00ProdutoPanel.setVisible(true);
		
		//preco Produto
		fotoProdutoPanel.add(fotoProdutoLabel);
		telaPrincipalFrame.add(fotoProdutoPanel);
		fotoProdutoPanel.setVisible(true);
		
		//Find caracteristica especifica Produto
		FindCaracteristicaEspecificaPanel.add(FindCaracteristicaEspecificaLabel);
		telaPrincipalFrame.add(FindCaracteristicaEspecificaPanel);
		FindCaracteristicaEspecificaPanel.setVisible(true);
		
		//caracteristicas gerais Produto
		EspecificacoesGeraisPanel.add(EspecificacoesGeraisLabel);
		telaPrincipalFrame.add(EspecificacoesGeraisPanel);
		EspecificacoesGeraisPanel.setVisible(true);
		
		
		//telaPrincipalFrame.show();
		telaPrincipalFrame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getActionCommand().equals("reverse")) {
			String orgStr = findText.getText();
			String resStr = "";
			
			for(int i=orgStr.length();i >=0;i--) {
				resStr += orgStr.charAt(i);
			}
			
			findText.setText(resStr);
			System.out.println("botão apertado com findText = " +
								resStr);
			
		}else {
			contentsLabel.setText("you pressed ENTER. text is: " + 
					findText.getText());;
		System.out.println("botão apertado com findText = " +
							findText.getText());
		}
	}


}
