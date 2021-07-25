/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivoLojaEletronica;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author detonator
 */
public class entradaNovoProduto {

    int jFrameWidth = 720, widthPanel = 700;
    int jFrameHight = 540, heightPanel = 80;
    int textSize = 50;

    private int retornaAlturaPanel(int numPanel) {

        // a + height
        if (numPanel == 0) {
            return 10;
        } else{
            return numPanel * heightPanel + (numPanel + 1 )* 10;
        }
    }

    public void principalFrame() {

        JFrame frameEntrada = new JFrame();

        frameEntrada.setTitle("Entrada de Novo Produto");

        //about size, color and visibility of window
        frameEntrada.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frameEntrada.setResizable(false);
        frameEntrada.setLayout(null);
        frameEntrada.setSize(jFrameWidth, jFrameHight);

        frameEntrada.getContentPane().setBackground(Color.decode("#fff88f"));
        frameEntrada.setLocationRelativeTo(null);

        /* MARCA PANEL */
        JPanel marcaPanel = new JPanel();
        marcaPanel.setBackground(Color.decode("#442f1f"));
        marcaPanel.setBounds(10, retornaAlturaPanel(0), widthPanel, heightPanel);

        JLabel marcaLabel = new JLabel();

        marcaLabel.setText("marca: ");
        marcaLabel.setForeground(Color.white);
        marcaLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
        
        marcaPanel.add(marcaLabel);
        frameEntrada.add(marcaPanel);
        marcaPanel.setVisible(true);

        /* MARCA PANEL */
        
        
 /* FOTO PANEL */
        JPanel fotoPanel = new JPanel();
        fotoPanel.setBackground(Color.decode("#442f1f"));
        fotoPanel.setBounds(10, retornaAlturaPanel(1), widthPanel, heightPanel);

        JLabel fotoLabel = new JLabel();

        fotoLabel.setText("foto: ");
        fotoLabel.setForeground(Color.white);
        fotoLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
        
        fotoPanel.add(fotoLabel);
        frameEntrada.add(fotoPanel);
        fotoPanel.setVisible(true);

        /* FOTO PANEL */
        
        
 /* CARACTERÍSTICA PANEL */
        JPanel caracteristicaPanel = new JPanel();
        caracteristicaPanel.setBackground(Color.decode("#442f1f"));
        caracteristicaPanel.setBounds(10, retornaAlturaPanel(2), widthPanel, heightPanel);

        JLabel caracteristicaLabel = new JLabel();

        caracteristicaLabel.setText("características: ");
        caracteristicaLabel.setForeground(Color.white);
        caracteristicaLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
        
        caracteristicaPanel.add(caracteristicaLabel);
        frameEntrada.add(caracteristicaPanel);
        caracteristicaPanel.setVisible(true);

        /* CARACTERÍSTICA PANEL */
        
        
 /* PREÇO PANEL */
        JPanel precoPanel = new JPanel();
        precoPanel.setBackground(Color.decode("#442f1f"));
        precoPanel.setBounds(10, retornaAlturaPanel(3), widthPanel, heightPanel);

        JLabel precoLabel = new JLabel();

        precoLabel.setText("preço: ");
        precoLabel.setForeground(Color.white);
        precoLabel.setFont(new Font("Monospace", Font.PLAIN, textSize));
      
        precoPanel.add(precoLabel);
        frameEntrada.add(precoPanel);
        precoPanel.setVisible(true);

        /* PREÇO PANEL */
        
 
		


		frameEntrada.setVisible(true);

    }

}
