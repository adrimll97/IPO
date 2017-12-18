package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.time.DayOfWeek;

public class PanelProyecto extends JPanel {
	private JPanel pnlOpciones;
	private JButton btnVisualizar;
	private JButton btnEditar;
	private JButton btnAadir;
	private JButton btnEliminar;
	private JPanel pnlProyecto;
	private JSeparator separator;
	private JLabel lblNombre;
	private JLabel lblFechaDeCreacin;
	private JLabel lblResponsableDelProyecto;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JLabel lblDescripcin;
	private JTextField txtNombre;

	/**
	 * Create the panel.
	 */
	public PanelProyecto() {
		setLayout(new BorderLayout(0, 0));
		
		pnlOpciones = new JPanel();
		add(pnlOpciones, BorderLayout.NORTH);
		pnlOpciones.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlOpciones.add(btnVisualizar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlOpciones.add(btnEditar);
		
		btnAadir = new JButton("Añadir");
		btnAadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlOpciones.add(btnAadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlOpciones.add(btnEliminar);
		
		pnlProyecto = new JPanel();
		add(pnlProyecto, BorderLayout.CENTER);
		GridBagLayout gbl_pnlProyecto = new GridBagLayout();
		gbl_pnlProyecto.columnWidths = new int[]{0, 0, 182, 0, 0, 0, 0, 0};
		gbl_pnlProyecto.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlProyecto.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlProyecto.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlProyecto.setLayout(gbl_pnlProyecto);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		pnlProyecto.add(separator, gbc_separator);
		
		lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		pnlProyecto.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		pnlProyecto.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 2;
		pnlProyecto.add(separator_1, gbc_separator_1);
		
		lblFechaDeCreacin = new JLabel("Fecha de creación: ");
		GridBagConstraints gbc_lblFechaDeCreacin = new GridBagConstraints();
		gbc_lblFechaDeCreacin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeCreacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeCreacin.gridx = 1;
		gbc_lblFechaDeCreacin.gridy = 3;
		pnlProyecto.add(lblFechaDeCreacin, gbc_lblFechaDeCreacin);
		
		separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 4;
		pnlProyecto.add(separator_2, gbc_separator_2);
		
		lblResponsableDelProyecto = new JLabel("Responsable del proyecto: ");
		GridBagConstraints gbc_lblResponsableDelProyecto = new GridBagConstraints();
		gbc_lblResponsableDelProyecto.anchor = GridBagConstraints.EAST;
		gbc_lblResponsableDelProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblResponsableDelProyecto.gridx = 1;
		gbc_lblResponsableDelProyecto.gridy = 5;
		pnlProyecto.add(lblResponsableDelProyecto, gbc_lblResponsableDelProyecto);
		
		separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 1;
		gbc_separator_3.gridy = 6;
		pnlProyecto.add(separator_3, gbc_separator_3);
		
		lblDescripcin = new JLabel("Descripción: ");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 7;
		pnlProyecto.add(lblDescripcin, gbc_lblDescripcin);

	}

}
