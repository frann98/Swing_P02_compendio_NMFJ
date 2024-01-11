/**
 * Panel_1.java
 * 15 nov 2023 13:30:47
 * @author Francisco José Nache Morales
 */
package swing_c_p02_NacheMoralesFranciscoJose.proyecto.paneles;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * 
 */
public class Panel_1 extends JPanel {

	private JLabel presenta;
	private JLabel nombre;
	private JLabel imagen;
	private ImageIcon logo;

	public Panel_1() {

		this.setLayout(new GridLayout(1, 1));

		presenta = new JLabel("Presenta: ");
		nombre = new JLabel("Local Stand Incorporated");
		logo = new ImageIcon(getClass().getResource("/res/LSlogo.jpg"));
		imagen = new JLabel(logo);

		presenta.setFont(new Font("Monospaced", Font.BOLD, 18));
		presenta.setForeground(Color.MAGENTA);
		nombre.setFont(new Font("Monospaced", Font.BOLD, 18));
		nombre.setForeground(Color.RED);

		this.add(imagen);
		this.add(presenta);
		this.add(nombre);

		this.setBorder(BorderFactory.createLineBorder(Color.RED, 4));
		this.setBackground(Color.LIGHT_GRAY);

	}

}
