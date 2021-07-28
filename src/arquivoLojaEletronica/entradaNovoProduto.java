/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivoLojaEletronica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.JNumberField;

/**
 *
 * @author detonator
 */
public class entradaNovoProduto {

    int jFrameWidth = 720, widthPanel = 700;
    int jFrameHight = 540, heightPanel = 80;
    int textSize = 50;
    
    JLabel marcaInsertLabel;
    JTextField marcaInsertText;
    
    JLabel fotoInsertLabel ;
    JTextField fotoInsertText;
    
    JLabel infoInsertLabel;
    JTextField infoInsertText;
    
    JLabel precoInsertLabel ;
    JTextField precoInsertNumber;

    private int retornaAlturaPanel(int numPanel) {

        // a + height
        if (numPanel == 0) {
            return 10;
        } else{
            return numPanel * heightPanel + (numPanel + 1 )* 10;
        }
    }
    
    private void verificaEntradaPreco(String precoNovo){
        
    }

    public void principalFrame() {

        JFrame frameEntrada = new JFrame();

        frameEntrada.setTitle("Entrada de Novo Produto");

        //about size, color and visibility of window
        frameEntrada.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frameEntrada.setResizable(false);
        frameEntrada.setLayout(null);
        frameEntrada.setSize(jFrameWidth, jFrameHight);

        frameEntrada.getContentPane().setBackground(Color.BLACK);
        frameEntrada.setLocationRelativeTo(null);

        /* MARCA PANEL */
        JPanel marcaPanel = new JPanel();
        marcaPanel.setBackground(Color.decode("#442f1f"));
        marcaPanel.setBounds(10, retornaAlturaPanel(0), 200, heightPanel);

        JLabel marcaLabel = new JLabel();

        marcaLabel.setText("marca: ");
        marcaLabel.setForeground(Color.ORANGE);
        marcaLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
        
        marcaPanel.add(marcaLabel);
        frameEntrada.add(marcaPanel);
        marcaPanel.setVisible(true);
        
                //
        
        //entrada de texto marca
        
        JPanel marcaInsertPanel = new JPanel(new BorderLayout());
        marcaInsertPanel.setBackground(Color.GRAY);
        marcaInsertPanel.setBounds(200+20, retornaAlturaPanel(0), 500-10, heightPanel);

        /* find label */
        marcaInsertLabel = new JLabel();
        marcaInsertLabel.setBounds(200+20, retornaAlturaPanel(0), 500-10, heightPanel - 10);
        //findLabel.setFont(new Font("Monospace",Font.PLAIN,40));

        marcaInsertText = new JTextField(10);
        marcaInsertText.setFont(new Font("Monospace", Font.PLAIN, 40));
        marcaInsertText.setActionCommand("myTfield");
                
                //
                
        marcaInsertLabel.setLabelFor(marcaInsertText);
        
        marcaInsertPanel.add(marcaInsertLabel);
        marcaInsertPanel.add(marcaInsertText,BorderLayout.CENTER);
        frameEntrada.add(marcaInsertPanel);
        
        marcaInsertPanel.setVisible(true);
        
        /* MARCA PANEL */
        
        
 /* FOTO PANEL */
        JPanel fotoPanel = new JPanel();
        fotoPanel.setBackground(Color.decode("#442f1f"));
        fotoPanel.setBounds(10, retornaAlturaPanel(1), 150, heightPanel);

        JLabel fotoLabel = new JLabel();

        fotoLabel.setText("foto: ");
        fotoLabel.setForeground(Color.ORANGE);
        fotoLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
        
        fotoPanel.add(fotoLabel);
        frameEntrada.add(fotoPanel);
        fotoPanel.setVisible(true);
        
               //
        
        //entrada de texto foto
        
        JPanel fotoInsertPanel = new JPanel(new BorderLayout());
        fotoInsertPanel.setBackground(Color.GRAY);
        fotoInsertPanel.setBounds(150+20, retornaAlturaPanel(1), 550-10, heightPanel);

        /* find label */
        fotoInsertLabel = new JLabel();
        fotoInsertLabel.setBounds(150+20, retornaAlturaPanel(1), 550-10, heightPanel - 10);
        //findLabel.setFont(new Font("Monospace",Font.PLAIN,40));

        fotoInsertText = new JTextField(10);
        fotoInsertText.setFont(new Font("Monospace", Font.PLAIN, 40));
        fotoInsertText.setActionCommand("myTfieldFoto");
                
                
                
        fotoInsertLabel.setLabelFor(fotoInsertText);
        
        fotoInsertPanel.add(fotoInsertLabel);
        fotoInsertPanel.add(fotoInsertText,BorderLayout.CENTER);
        frameEntrada.add(fotoInsertPanel);
        
        fotoInsertPanel.setVisible(true);
        
        //

        /* FOTO PANEL */
        
        
 /* CARACTERÍSTICA PANEL */
        JPanel caracteristicaPanel = new JPanel();
        caracteristicaPanel.setBackground(Color.decode("#442f1f"));
        caracteristicaPanel.setBounds(10, retornaAlturaPanel(2), 200, heightPanel);

        JLabel caracteristicaLabel = new JLabel();

        caracteristicaLabel.setText("info: ");
        caracteristicaLabel.setForeground(Color.ORANGE);
        caracteristicaLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
        
        caracteristicaPanel.add(caracteristicaLabel);
        frameEntrada.add(caracteristicaPanel);
        caracteristicaPanel.setVisible(true);
        
                //entrada de texto foto
        
        JPanel infoInsertPanel = new JPanel(new BorderLayout());
        infoInsertPanel.setBackground(Color.GRAY);
        infoInsertPanel.setBounds(200+20, retornaAlturaPanel(2), 500-10, heightPanel);

        /* find label */
        infoInsertLabel = new JLabel();
        infoInsertLabel.setBounds(200+20, retornaAlturaPanel(2), 500-10, heightPanel - 10);
        //findLabel.setFont(new Font("Monospace",Font.PLAIN,40));

        infoInsertText = new JTextField(10);
        infoInsertText.setFont(new Font("Monospace", Font.PLAIN, 40));
        infoInsertText.setActionCommand("myTfieldFoto");
                
                
                
        infoInsertLabel.setLabelFor(infoInsertText);
        
        infoInsertPanel.add(infoInsertLabel);
        infoInsertPanel.add(infoInsertText,BorderLayout.CENTER);
        frameEntrada.add(infoInsertPanel);
        
        infoInsertPanel.setVisible(true);
        
        //

        /* CARACTERÍSTICA PANEL */
        
        
 /* PREÇO PANEL */
        JPanel precoPanel = new JPanel();
        precoPanel.setBackground(Color.decode("#442f1f"));
        precoPanel.setBounds(10, retornaAlturaPanel(3), 180, heightPanel);

        JLabel precoLabel = new JLabel();

        precoLabel.setText("preço: ");
        precoLabel.setForeground(Color.ORANGE);
        precoLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
      
        precoPanel.add(precoLabel);
        frameEntrada.add(precoPanel);
        precoPanel.setVisible(true);
        
                //
        
        //entrada de texto preco
        
        JPanel precoInsertPanel = new JPanel(new BorderLayout());
        precoInsertPanel.setBackground(Color.GRAY);
        precoInsertPanel.setBounds(180+20, retornaAlturaPanel(3), 520-10, heightPanel);

        /* find label */
        precoInsertLabel = new JLabel();
        precoInsertLabel.setBounds(180+20, retornaAlturaPanel(3), 520-10, heightPanel - 10);
        //findLabel.setFont(new Font("Monospace",Font.PLAIN,40));

        precoInsertNumber = new JTextField(10);
        precoInsertNumber.setFont(new Font("Monospace", Font.PLAIN, 40));
        precoInsertNumber.setActionCommand("myTfieldFoto");
                
                
                
        precoInsertLabel.setLabelFor(precoInsertNumber);
        
        precoInsertPanel.add(precoInsertLabel);
        precoInsertPanel.add(precoInsertNumber,BorderLayout.CENTER);
        frameEntrada.add(precoInsertPanel);
        
        precoInsertPanel.setVisible(true);
        
        //

        /* PREÇO PANEL */
        
 
		


		frameEntrada.setVisible(true);

    }

}
