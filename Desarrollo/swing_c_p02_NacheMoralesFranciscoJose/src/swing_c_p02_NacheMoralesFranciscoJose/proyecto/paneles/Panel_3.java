/**
 * Panel_3.java
 * 15 nov 2023 13:35:31
 * @author Francisco José Nache Morales
 */
package swing_c_p02_NacheMoralesFranciscoJose.proyecto.paneles;

import java.awt.*;

import java.time.LocalDate;

import javax.swing.*;

/**
 * 
 */
public class Panel_3 extends JPanel {

	private JLabel lbl_direccion, lbl_provincia, lbl_fechaAlta, lbl_fechaFinal, lbl_numHuespedes, lbl_numDorms,
			lbl_numBanos, lbl_numCamas, lbl_tipoCamas, lbl_ninos, lbl_extrasNinos, lbl_edadNino, lbl_tipoExtraNino,
			lbl_imagenes, lbl_precioMinimo;

	private JTextField tf_direccion, tf_extrasNinos;

	private JComboBox cb_provincias, cb_tipoCama;

	private String[] provincias = new String[] { "A coruña", "Alicante", "Albacete", "Almería", "Álava", "Asturias",
			"Badajoz", "Barcelona", "Bizkaia", "Burgos", "Cantabria", "Castellón", "Ceuta", "Ciudad Real", "Cuenca",
			"Cáceres", "Cádiz", "Córdoba", "Guipuzcua", "Girona", "Granada", "Guadalajara", "Huelva", "Huesca",
			"Islas Baleares", "Jaén", "La Rioja", "Las Palmas", "León", "Lleida", "Lugo", "Madrid", "Melilla", "Murcia",
			"Málaga", "Navarra", "Ourense", "Palencia", "Pontevedra", "Salamanca", "Santa Cruz de Tenerife", "Segovia",
			"Sevilla", "Soria", "Tarragona", "Teruel", "Toledo", "Valladolid", "Valencia", "Zamora", "Zaragoza",
			"Ávila" };

	private String[] tipoCama = new String[] { "Simple", "Doble", "Sofá-Cama" };

	private JFormattedTextField jtf_fechaAlta, jtf_fechaFinal;

	private JSpinner s_huespedes, s_dormitorios, s_banos, s_camas, s_edadNinos;

	private JCheckBox chb_ninos;

	private JPanel panel_extrasNinos, panel_imagenes;

	private ImageIcon ii_dormitorio, ii_cocina, ii_bano;

	private JTextArea ta_precioMinimo;

	public Panel_3() {

		this.setLayout(new GridLayout(7, 4));

		// ---------------------------------------------------------------------------------------------

		lbl_direccion = new JLabel("Dirección: ");
		lbl_provincia = new JLabel("Provincia: ");
		lbl_fechaAlta = new JLabel("Fecha de Alta: ");
		lbl_fechaFinal = new JLabel("Fecha final: ");
		lbl_numHuespedes = new JLabel("Número de huéspedes: ");
		lbl_numDorms = new JLabel("Número de dormitorios: ");
		lbl_numBanos = new JLabel("Número de baños: ");
		lbl_numCamas = new JLabel("Número de camas: ");
		lbl_tipoCamas = new JLabel("Tipo de camas: ");
		lbl_ninos = new JLabel("¿Niños? ");
		lbl_extrasNinos = new JLabel("Extras niños: ");
		lbl_edadNino = new JLabel("Edad niño: ");
		lbl_tipoExtraNino = new JLabel("Extra: ");
		lbl_imagenes = new JLabel("Imágenes: ");
		lbl_precioMinimo = new JLabel("Precio Mínimo: ");

		// ---------------------------------------------------------------------------------------------

		tf_direccion = new JTextField();
		tf_extrasNinos = new JTextField();

		// ---------------------------------------------------------------------------------------------

		cb_provincias = new JComboBox(provincias);
		cb_tipoCama = new JComboBox(tipoCama);

		// ---------------------------------------------------------------------------------------------

		jtf_fechaAlta = new JFormattedTextField();
		jtf_fechaAlta.setValue(LocalDate.now());

		// ---------------------------------------------------------------------------------------------

		jtf_fechaFinal = new JFormattedTextField();
		jtf_fechaFinal.setValue(LocalDate.now().plusYears(1));

		// ---------------------------------------------------------------------------------------------

		s_huespedes = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));
		s_dormitorios = new JSpinner(new SpinnerNumberModel(0, 0, 4, 1));
		s_banos = new JSpinner(new SpinnerNumberModel(0, 0, 2, 1));
		s_camas = new JSpinner(new SpinnerNumberModel(0, 0, 4, 1));
		s_edadNinos = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));

		// ---------------------------------------------------------------------------------------------

		chb_ninos = new JCheckBox();

		// ---------------------------------------------------------------------------------------------

		panel_extrasNinos = new JPanel();
		panel_extrasNinos.setLayout(new GridLayout(2, 2));
		panel_extrasNinos.add(lbl_edadNino);
		panel_extrasNinos.add(s_edadNinos);
		panel_extrasNinos.add(lbl_tipoExtraNino);
		panel_extrasNinos.add(tf_extrasNinos);

		// ---------------------------------------------------------------------------------------------

		panel_imagenes = new JPanel();

		ii_dormitorio = new ImageIcon(getClass().getResource("/res/dormitorio.jpg"));
		ii_cocina = new ImageIcon(getClass().getResource("/res/cocina.jpg"));
		ii_bano = new ImageIcon(getClass().getResource("/res/bano.jpg"));

		panel_imagenes.add(new JLabel(ii_dormitorio));
		panel_imagenes.add(new JLabel(ii_cocina));
		panel_imagenes.add(new JLabel(ii_bano));

		// ---------------------------------------------------------------------------------------------

		ta_precioMinimo = new JTextArea();

		// ---------------------------------------------------------------------------------------------

		this.add(lbl_direccion);
		this.add(tf_direccion);

		this.add(lbl_provincia);
		this.add(cb_provincias);

		this.add(lbl_fechaAlta);
		this.add(jtf_fechaAlta);

		this.add(lbl_fechaFinal);
		this.add(jtf_fechaFinal);

		this.add(lbl_numHuespedes);
		this.add(s_huespedes);

		this.add(lbl_numDorms);
		this.add(s_dormitorios);

		this.add(lbl_numBanos);
		this.add(s_banos);

		this.add(lbl_numCamas);
		this.add(s_camas);

		this.add(lbl_tipoCamas);
		this.add(cb_tipoCama);

		this.add(lbl_ninos);
		this.add(chb_ninos);

		this.add(lbl_extrasNinos);
		this.add(panel_extrasNinos);

		this.add(lbl_imagenes);
		this.add(panel_imagenes);

		this.add(lbl_precioMinimo);
		this.add(ta_precioMinimo);

		// ---------------------------------------------------------------------------------------------

		this.setBackground(Color.GREEN);
		this.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 4));
	}

}
