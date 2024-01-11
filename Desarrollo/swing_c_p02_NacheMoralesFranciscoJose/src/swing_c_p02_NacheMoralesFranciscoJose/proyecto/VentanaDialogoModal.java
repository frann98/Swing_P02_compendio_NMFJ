/**
 * VentanaDialogoModal.java
 * 15 nov 2023 13:05:25
 * @author Francisco José Nache Morales
 */
package swing_c_p02_NacheMoralesFranciscoJose.proyecto;

import java.awt.*;

import javax.swing.*;

import swing_c_p02_NacheMoralesFranciscoJose.proyecto.paneles.Panel_1;
import swing_c_p02_NacheMoralesFranciscoJose.proyecto.paneles.Panel_2;
import swing_c_p02_NacheMoralesFranciscoJose.proyecto.paneles.Panel_3;
import swing_c_p02_NacheMoralesFranciscoJose.proyecto.paneles.Panel_4;

/**
 * 
 */
public class VentanaDialogoModal extends JDialog {

	GridBagLayout layout;
	private GridBagConstraints constraints;

	private Panel_1 p1 = new Panel_1();
	private Panel_2 p2 = new Panel_2();
	private Panel_3 p3 = new Panel_3();
	private Panel_1 p4 = new Panel_1();

	// paneles del layout principal
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();

	public VentanaDialogoModal() {

		constraints = new GridBagConstraints();

		// -------------------------------------------------------------------------------------//
		// Ajustes de tamaño, posición y funcionalidad de la ventana
		// -------------------------------------------------------------------------------------//

		this.setTitle("Alta Pisos");

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setLayout(layout = new GridBagLayout());

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();

		int anchoPantalla = tamanoPantalla.width;
		int altoPantalla = tamanoPantalla.height;

		this.setSize(anchoPantalla, altoPantalla);
		this.setLocation(0, 0);

		Image icon = miPantalla.getImage(getClass().getResource("/res/LSlogo.jpg"));
		this.setIconImage(icon);

		// -------------------------------------------------------------------------------------//
		// Ajustes de paneles
		// -------------------------------------------------------------------------------------//

		// Establecemos layout
		layout = new GridBagLayout();
		this.setLayout(layout);

		// paneles principales
		jp1.setLayout(new BoxLayout(jp1, 0));
		jp1.add(p1);
		jp2.setLayout(new BoxLayout(jp2, 0));
		jp2.add(p2);
		jp3.setLayout(new BoxLayout(jp3, 0));
		jp3.add(p3);
		jp4.setLayout(new BoxLayout(jp4, 0));
		jp4.add(p4);

		// add paneles
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.addComponent(jp1, 0, 0, 0, 0);
		this.addComponent(jp2, 0, 1, 0, 0);
		this.addComponent(jp3, 0, 2, 0, 0);
		this.addComponent(jp4, 0, 0, 0, 0);

		p1.setVisible(true);
		p2.setVisible(true);
		p3.setVisible(true);
		p4.setVisible(true);

	}

	private void addComponent(Component component, int column, int row, int width, int height) {
		constraints.gridx = column; // set gridx, La columna en la que se colocarᠥl componente.
		constraints.gridy = row; // set gridy, La fila en la que se colocarᠥl componente.
		constraints.gridwidth = width; // set gridwidth, El nmero de columnas que ocupa el componente.
		constraints.gridheight = height; // set gridheight, El nmero de filas que ocupa el componente.
		layout.setConstraints(component, constraints); // set constraints
		this.add(component); // add component
	}

}
