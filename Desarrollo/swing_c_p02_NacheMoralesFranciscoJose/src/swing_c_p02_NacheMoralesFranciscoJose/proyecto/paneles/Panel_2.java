/**
 * Panel_2.java
 * 15 nov 2023 13:35:21
 * @author Francisco José Nache Morales
 */
package swing_c_p02_NacheMoralesFranciscoJose.proyecto.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 * 
 */
public class Panel_2 extends JPanel {

	private JLabel lbl_nombre, lbl_apellidos, lbl_dni, lbl_tlf;
	private JTextField nombre, apellidos;
	private JFormattedTextField dni, telefono;
	private MaskFormatter mask_dni, mask_tlf;

	public Panel_2() {

		this.setLayout(new GridLayout(4, 2));
		this.setBackground(Color.CYAN);
		this.setBorder(BorderFactory.createLineBorder(Color.BLUE, 4));

		Font fuenteGrande = new Font("Monospaced", Font.BOLD, 32);

		lbl_nombre = new JLabel("Nombre del Arrendador: ");
		lbl_nombre.setForeground(Color.BLUE);

		lbl_apellidos = new JLabel("Apellidos del Arrendador: ");
		lbl_apellidos.setForeground(Color.BLUE);

		lbl_dni = new JLabel("DNI del Arrendador: ");
		lbl_dni.setForeground(Color.BLUE);

		lbl_tlf = new JLabel("Teléfono del Arrendador: ");
		lbl_tlf.setForeground(Color.BLUE);

		lbl_nombre.setFont(fuenteGrande);
		lbl_apellidos.setFont(fuenteGrande);
		lbl_dni.setFont(fuenteGrande);
		lbl_tlf.setFont(fuenteGrande);

		nombre = new JTextField();
		nombre.setBackground(Color.BLUE);
		nombre.setForeground(Color.CYAN);
		nombre.setFont(fuenteGrande);

		apellidos = new JTextField();
		apellidos.setBackground(Color.BLUE);
		apellidos.setForeground(Color.CYAN);
		apellidos.setFont(fuenteGrande);

		try {
			mask_dni = new MaskFormatter("########L");
			mask_tlf = new MaskFormatter("#########");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		dni = new JFormattedTextField(mask_dni);
		dni.setBackground(Color.BLUE);
		dni.setForeground(Color.CYAN);
		dni.setFont(fuenteGrande);

		telefono = new JFormattedTextField(mask_tlf);
		telefono.setBackground(Color.BLUE);
		telefono.setForeground(Color.CYAN);
		telefono.setFont(fuenteGrande);

		this.add(lbl_nombre);
		this.add(nombre);
		this.add(lbl_apellidos);
		this.add(apellidos);
		this.add(lbl_dni);
		this.add(dni);
		this.add(lbl_tlf);
		this.add(telefono);

	}

}
