package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Cursor;
import javax.swing.JTextArea;

public class PanelUsuario extends JPanel {
	private JLabel lblMensaje;
	private JLabel lblRolPrincipal;
	private JLabel lblTelfono;
	private JLabel lblEmail;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel;
	private JButton btnEnviarMensaje;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JLabel lblNewLabel_1;
	private JSeparator separator_7;
	private JScrollPane scpProyectos;
	private JScrollPane scpTareas;
	private JSeparator separator;
	private JSeparator separator_4;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JSeparator separator_10;
	private JList listProyectos;
	private JList listTareas;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public PanelUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{9, 45, 48, 61, 46, 162, 181, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 84, 76, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 5, 0);
		gbc_separator_7.gridx = 7;
		gbc_separator_7.gridy = 0;
		add(separator_7, gbc_separator_7);
		
		separator_10 = new JSeparator();
		GridBagConstraints gbc_separator_10 = new GridBagConstraints();
		gbc_separator_10.insets = new Insets(0, 0, 5, 5);
		gbc_separator_10.gridx = 0;
		gbc_separator_10.gridy = 1;
		add(separator_10, gbc_separator_10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridheight = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		separator_9 = new JSeparator();
		GridBagConstraints gbc_separator_9 = new GridBagConstraints();
		gbc_separator_9.insets = new Insets(0, 0, 5, 5);
		gbc_separator_9.gridx = 1;
		gbc_separator_9.gridy = 3;
		add(separator_9, gbc_separator_9);
		
		lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.gridwidth = 2;
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 4;
		add(lblNombre, gbc_lblNombre);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.gridwidth = 2;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 4;
		add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		scpProyectos = new JScrollPane();
		scpProyectos.setBorder(new TitledBorder(null, "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scpProyectos = new GridBagConstraints();
		gbc_scpProyectos.gridheight = 12;
		gbc_scpProyectos.insets = new Insets(0, 0, 5, 5);
		gbc_scpProyectos.fill = GridBagConstraints.BOTH;
		gbc_scpProyectos.gridx = 5;
		gbc_scpProyectos.gridy = 4;
		add(scpProyectos, gbc_scpProyectos);
		
		listProyectos = new JList();
		scpProyectos.setViewportView(listProyectos);
		
		scpTareas = new JScrollPane();
		scpTareas.setBorder(new TitledBorder(null, "Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scpTareas = new GridBagConstraints();
		gbc_scpTareas.gridheight = 12;
		gbc_scpTareas.insets = new Insets(0, 0, 5, 5);
		gbc_scpTareas.fill = GridBagConstraints.BOTH;
		gbc_scpTareas.gridx = 6;
		gbc_scpTareas.gridy = 4;
		add(scpTareas, gbc_scpTareas);
		
		listTareas = new JList();
		scpTareas.setViewportView(listTareas);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 5;
		add(separator, gbc_separator);
		
		lblApellidos = new JLabel("Apellidos: ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.gridwidth = 2;
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 6;
		add(lblApellidos, gbc_lblApellidos);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 6;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 7;
		add(separator_1, gbc_separator_1);
		
		lblEmail = new JLabel("E-mail: ");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.gridwidth = 2;
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 8;
		add(lblEmail, gbc_lblEmail);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 8;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 2;
		gbc_separator_2.gridy = 9;
		add(separator_2, gbc_separator_2);
		
		lblTelfono = new JLabel("Teléfono: ");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.gridwidth = 2;
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 1;
		gbc_lblTelfono.gridy = 10;
		add(lblTelfono, gbc_lblTelfono);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 10;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 2;
		gbc_separator_3.gridy = 11;
		add(separator_3, gbc_separator_3);
		
		lblRolPrincipal = new JLabel("Rol principal: ");
		GridBagConstraints gbc_lblRolPrincipal = new GridBagConstraints();
		gbc_lblRolPrincipal.gridwidth = 2;
		gbc_lblRolPrincipal.anchor = GridBagConstraints.EAST;
		gbc_lblRolPrincipal.insets = new Insets(0, 0, 5, 5);
		gbc_lblRolPrincipal.gridx = 1;
		gbc_lblRolPrincipal.gridy = 12;
		add(lblRolPrincipal, gbc_lblRolPrincipal);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 12;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.insets = new Insets(0, 0, 5, 5);
		gbc_separator_8.gridx = 1;
		gbc_separator_8.gridy = 13;
		add(separator_8, gbc_separator_8);
		
		lblNewLabel_1 = new JLabel("Conocimientos/Habilidades: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 14;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 14;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 2;
		gbc_separator_5.gridy = 16;
		add(separator_5, gbc_separator_5);
		
		separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 1;
		gbc_separator_4.gridy = 17;
		add(separator_4, gbc_separator_4);
		
		lblMensaje = new JLabel("Mensaje: ");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.gridwidth = 2;
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 18;
		add(lblMensaje, gbc_lblMensaje);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 2;
		gbc_textArea.gridwidth = 4;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 3;
		gbc_textArea.gridy = 18;
		add(textArea, gbc_textArea);
		
		btnEnviarMensaje = new JButton("Enviar mensaje");
		btnEnviarMensaje.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnEnviarMensaje = new GridBagConstraints();
		gbc_btnEnviarMensaje.anchor = GridBagConstraints.EAST;
		gbc_btnEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviarMensaje.gridx = 6;
		gbc_btnEnviarMensaje.gridy = 20;
		add(btnEnviarMensaje, gbc_btnEnviarMensaje);
		
		separator_6 = new JSeparator();
		GridBagConstraints gbc_separator_6 = new GridBagConstraints();
		gbc_separator_6.insets = new Insets(0, 0, 0, 5);
		gbc_separator_6.gridx = 1;
		gbc_separator_6.gridy = 21;
		add(separator_6, gbc_separator_6);

	}

}
