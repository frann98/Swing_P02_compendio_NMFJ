/**
 * VentanaPrincipal.java
 * 15 nov 2023 8:48:46
 * @author Francisco José Nache Morales
 */
package swing_c_p02_NacheMoralesFranciscoJose.proyecto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.JPopupMenu.Separator;

/**
 * 
 */
public class VentanaPrincipal extends JFrame implements ActionListener {

	JMenuBar MenuBar;
	JMenu menuArchivo, menuRegistro, menuAyuda;
	JMenuItem miSalir, miAltaPisos, miBajaPisos, miAbout;
	JButton btnAltaPisos, btnBajaPisos;

	GridBagLayout layout;
	GridBagConstraints constraints;

	public VentanaPrincipal() {

		// -------------------------------------------------------------------------------------//
		// Ajustes de tamaño, posición y funcionalidad de la ventana
		// -------------------------------------------------------------------------------------//

		super("Gestion Apartamentos Turísticos: LocalStand");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setLayout(layout = new GridBagLayout());
		constraints = new GridBagConstraints();

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();

		int anchoPantalla = tamanoPantalla.width;
		int altoPantalla = tamanoPantalla.height;

		this.setSize(anchoPantalla / 2, altoPantalla / 2);
		this.setLocation(anchoPantalla / 4, altoPantalla / 4);

		Image icon = miPantalla.getImage(getClass().getResource("/res/LSlogo.jpg"));
		this.setIconImage(icon);

		// -------------------------------------------------------------------------------------//
		// Ajustes de la barra de menú
		// -------------------------------------------------------------------------------------//

		MenuBar = new JMenuBar();

		menuArchivo = new JMenu("Archivo");
		menuRegistro = new JMenu("Registro");
		menuAyuda = new JMenu("Ayuda");

		menuArchivo.setMnemonic(KeyEvent.VK_F);
		menuAyuda.setMnemonic(KeyEvent.VK_A);
		menuRegistro.setMnemonic(KeyEvent.VK_R);

		miSalir = new JMenuItem("Salir");
		miAltaPisos = new JMenuItem("Alta pisos");
		miBajaPisos = new JMenuItem("Baja pisos");
		miAbout = new JMenuItem("Acerca de...");

		miAltaPisos.setAccelerator(KeyStroke.getKeyStroke("ctrl A"));
		miBajaPisos.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));

		miSalir.addActionListener(this);
		miAltaPisos.addActionListener(this);
		miBajaPisos.addActionListener(this);
		miAbout.addActionListener(this);

		menuArchivo.add(miSalir);

		menuRegistro.add(miAltaPisos);
		menuRegistro.add(miBajaPisos);

		menuAyuda.add(miAbout);

		MenuBar.add(menuArchivo);
		MenuBar.add(menuRegistro);
		MenuBar.add(menuAyuda);

		this.setJMenuBar(MenuBar);

		// -------------------------------------------------------------------------------------//
		// Ajustes de los botones
		// -------------------------------------------------------------------------------------//

		btnAltaPisos = new JButton("Alta pisos");
		btnBajaPisos = new JButton("Baja pisos");

		ImageIcon addPiso = new ImageIcon(getClass().getResource("/res/addPiso.png"));
		ImageIcon delPiso = new ImageIcon(getClass().getResource("/res/delPiso.png"));

		btnAltaPisos.setIcon(addPiso);
		btnBajaPisos.setIcon(delPiso);

		btnAltaPisos.setSize(200, 100);
		btnBajaPisos.setSize(200, 100);

		btnAltaPisos.addActionListener(this);
		btnBajaPisos.addActionListener(this);

		this.addComponent(btnAltaPisos, 1, 1, 1, 1);
		this.addComponent(new JLabel("                                                "), 2, 1, 1, 1);
		this.addComponent(btnBajaPisos, 3, 1, 1, 1);

	}

	// -------------------------------------------------------------------------------------//
	// Método de establecido de componentes en el GridBagConstraints
	// -------------------------------------------------------------------------------------//
	private void addComponent(Component component, int column, int row, int width, int height) {
		constraints.gridx = column; // La columna en la que se coloca el componente.
		constraints.gridy = row; // La fila en la que se coloca el componente.
		constraints.gridwidth = width; // El numero de columnas que ocupa el componente.
		constraints.gridheight = height; // El numero de filas que ocupa el componente.
		layout.setConstraints(component, constraints);
		this.add(component);
	}

	// -------------------------------------------------------------------------------------//
	// ActionPerformed a la escucha de los componentes asignados
	// -------------------------------------------------------------------------------------//
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == miSalir) {
			System.exit(0);
		}

		if (e.getSource() == miAltaPisos) {

			abrirVentanaDialogo();

		}

		if (e.getSource() == miBajaPisos) {

			JOptionPane.showMessageDialog(this, "Opción aún no implementada");

		}

		if (e.getSource() == miAbout) {

			JOptionPane.showMessageDialog(this,
					"                                Información:                        \n"
							+ "\nNombre de empresa: LocalStand Incorporated\n" + "\nID de empresa: 12345678-LSI\n"
							+ "\nLocalización: Calle Baleares 12, Mayorca\n"
							+ "\nAdministrador encargado: Nache Morales Francisco José\n");

		}

		if (e.getSource() == btnAltaPisos) {

			abrirVentanaDialogo();

		}

		if (e.getSource() == btnBajaPisos) {

			JOptionPane.showMessageDialog(this, "Opción aún no implementada");

		}

	}

	// -------------------------------------------------------------------------------------//
	// Método para abrir una VentanaDialogoModal en el Botón y MenuItem
	// -------------------------------------------------------------------------------------//
	private void abrirVentanaDialogo() {
		VentanaDialogoModal vdm = new VentanaDialogoModal();
		vdm.setVisible(true);
	}

}
