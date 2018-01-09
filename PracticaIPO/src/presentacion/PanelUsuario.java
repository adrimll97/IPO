package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import dominio.ControlUsuarios;
import dominio.Usuario;

import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

import java.awt.CardLayout;
import java.awt.Cursor;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelUsuario extends JPanel {
	private JLabel lblMensaje;
	private JLabel lblRolPrincipal;
	private JLabel lblTelfono;
	private JLabel lblEmail;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JTextField txtConocimientos;
	private JTextField txtRol;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtApellidos;
	private JTextField txtNombre;
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
	private JList listProyectos;
	private JList listTareas;
	private JTextArea txaMensaje;
	private JSeparator separator_12;
	private JLabel lblNewLabel;
	private JPanel panelCard;
	
	private int id;
	private JButton btnEditar;
	private JButton btnHabiitarEdicion;
	/**
	 * Create the panel.
	 */
	public PanelUsuario(JPanel panelCard, int id) {
		this.panelCard = panelCard;
		
		this.id = id;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{67, 125, -217, 45, 48, 61, 122, 0, 162, 167, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0, 0, 30, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 5, 0);
		gbc_separator_7.gridx = 10;
		gbc_separator_7.gridy = 0;
		add(separator_7, gbc_separator_7);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setSize(200, 200);
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridheight = 11;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.gridwidth = 2;
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 5;
		gbc_txtNombre.gridy = 1;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		scpProyectos = new JScrollPane();
		scpProyectos.setBorder(new TitledBorder(null, "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scpProyectos = new GridBagConstraints();
		gbc_scpProyectos.gridheight = 14;
		gbc_scpProyectos.insets = new Insets(0, 0, 5, 5);
		gbc_scpProyectos.fill = GridBagConstraints.BOTH;
		gbc_scpProyectos.gridx = 8;
		gbc_scpProyectos.gridy = 1;
		add(scpProyectos, gbc_scpProyectos);
		
		listProyectos = new JList();
		listProyectos.setEnabled(false);
		scpProyectos.setViewportView(listProyectos);
		
		scpTareas = new JScrollPane();
		scpTareas.setBorder(new TitledBorder(null, "Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scpTareas = new GridBagConstraints();
		gbc_scpTareas.gridheight = 14;
		gbc_scpTareas.insets = new Insets(0, 0, 5, 5);
		gbc_scpTareas.fill = GridBagConstraints.BOTH;
		gbc_scpTareas.gridx = 9;
		gbc_scpTareas.gridy = 1;
		add(scpTareas, gbc_scpTareas);
		
		listTareas = new JList();
		listTareas.setEnabled(false);
		scpTareas.setViewportView(listTareas);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 3;
		gbc_separator.gridy = 2;
		add(separator, gbc_separator);
		
		lblApellidos = new JLabel("Apellidos: ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.gridwidth = 2;
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 3;
		gbc_lblApellidos.gridy = 3;
		add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setEnabled(false);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 2;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 5;
		gbc_txtApellidos.gridy = 3;
		add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 3;
		gbc_separator_1.gridy = 4;
		add(separator_1, gbc_separator_1);
		
		lblEmail = new JLabel("E-mail: ");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.gridwidth = 2;
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 3;
		gbc_lblEmail.gridy = 5;
		add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setEnabled(false);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 5;
		gbc_txtEmail.gridy = 5;
		add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 4;
		gbc_separator_2.gridy = 6;
		add(separator_2, gbc_separator_2);
		
		lblTelfono = new JLabel("Teléfono: ");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.gridwidth = 2;
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 3;
		gbc_lblTelfono.gridy = 7;
		add(lblTelfono, gbc_lblTelfono);
		
		txtTelefono = new JTextField();
		txtTelefono.setEnabled(false);
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.gridwidth = 2;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 5;
		gbc_txtTelefono.gridy = 7;
		add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 4;
		gbc_separator_3.gridy = 8;
		add(separator_3, gbc_separator_3);
		
		lblRolPrincipal = new JLabel("Rol principal: ");
		GridBagConstraints gbc_lblRolPrincipal = new GridBagConstraints();
		gbc_lblRolPrincipal.gridwidth = 2;
		gbc_lblRolPrincipal.anchor = GridBagConstraints.EAST;
		gbc_lblRolPrincipal.insets = new Insets(0, 0, 5, 5);
		gbc_lblRolPrincipal.gridx = 3;
		gbc_lblRolPrincipal.gridy = 9;
		add(lblRolPrincipal, gbc_lblRolPrincipal);
		
		txtRol = new JTextField();
		txtRol.setEnabled(false);
		GridBagConstraints gbc_txtRol = new GridBagConstraints();
		gbc_txtRol.gridwidth = 2;
		gbc_txtRol.insets = new Insets(0, 0, 5, 5);
		gbc_txtRol.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRol.gridx = 5;
		gbc_txtRol.gridy = 9;
		add(txtRol, gbc_txtRol);
		txtRol.setColumns(10);
		
		separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.insets = new Insets(0, 0, 5, 5);
		gbc_separator_8.gridx = 3;
		gbc_separator_8.gridy = 10;
		add(separator_8, gbc_separator_8);
		
		lblNewLabel_1 = new JLabel("Conocimientos/Habilidades: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 11;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtConocimientos = new JTextField();
		txtConocimientos.setEnabled(false);
		GridBagConstraints gbc_txtConocimientos = new GridBagConstraints();
		gbc_txtConocimientos.gridwidth = 2;
		gbc_txtConocimientos.insets = new Insets(0, 0, 5, 5);
		gbc_txtConocimientos.fill = GridBagConstraints.BOTH;
		gbc_txtConocimientos.gridx = 5;
		gbc_txtConocimientos.gridy = 11;
		add(txtConocimientos, gbc_txtConocimientos);
		txtConocimientos.setColumns(10);
		
		separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 4;
		gbc_separator_5.gridy = 13;
		add(separator_5, gbc_separator_5);
		
		separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 3;
		gbc_separator_4.gridy = 14;
		add(separator_4, gbc_separator_4);
		
		lblMensaje = new JLabel("Mensaje: ");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 0;
		gbc_lblMensaje.gridy = 15;
		add(lblMensaje, gbc_lblMensaje);
		
		txaMensaje = new JTextArea();
		GridBagConstraints gbc_txaMensaje = new GridBagConstraints();
		gbc_txaMensaje.gridheight = 2;
		gbc_txaMensaje.gridwidth = 9;
		gbc_txaMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txaMensaje.fill = GridBagConstraints.BOTH;
		gbc_txaMensaje.gridx = 1;
		gbc_txaMensaje.gridy = 15;
		add(txaMensaje, gbc_txaMensaje);
		
		separator_12 = new JSeparator();
		GridBagConstraints gbc_separator_12 = new GridBagConstraints();
		gbc_separator_12.insets = new Insets(0, 0, 5, 5);
		gbc_separator_12.gridx = 4;
		gbc_separator_12.gridy = 17;
		add(separator_12, gbc_separator_12);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new BtnEditarActionListener());
		
		btnHabiitarEdicion = new JButton("Habiitar Edicion");
		btnHabiitarEdicion.addActionListener(new BtnHabiitarEdicionActionListener());
		GridBagConstraints gbc_btnHabiitarEdicion = new GridBagConstraints();
		gbc_btnHabiitarEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_btnHabiitarEdicion.gridx = 0;
		gbc_btnHabiitarEdicion.gridy = 18;
		add(btnHabiitarEdicion, gbc_btnHabiitarEdicion);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.anchor = GridBagConstraints.EAST;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 8;
		gbc_btnEditar.gridy = 18;
		add(btnEditar, gbc_btnEditar);
		
		btnEnviarMensaje = new JButton("Enviar mensaje");
		btnEnviarMensaje.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnEnviarMensaje = new GridBagConstraints();
		gbc_btnEnviarMensaje.anchor = GridBagConstraints.EAST;
		gbc_btnEnviarMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviarMensaje.gridx = 9;
		gbc_btnEnviarMensaje.gridy = 18;
		add(btnEnviarMensaje, gbc_btnEnviarMensaje);
		
		separator_6 = new JSeparator();
		GridBagConstraints gbc_separator_6 = new GridBagConstraints();
		gbc_separator_6.insets = new Insets(0, 0, 0, 5);
		gbc_separator_6.gridx = 3;
		gbc_separator_6.gridy = 19;
		add(separator_6, gbc_separator_6);

	}
	
	public void rellenar() {
		panelCard.add(this, "Usuario");
		ControlUsuarios cu = new ControlUsuarios();
		Usuario user = cu.obtenerUsuario(id);
		txtNombre.setText(user.getNombre());	
		txtApellidos.setText(user.getApellidos());
		txtEmail.setText(user.getEmail());
		txtTelefono.setText(String.valueOf(user.getTelf()));
		txtRol.setText(user.getRolPrincipal());
		txtConocimientos.setText(user.getConocimientos());
		
		ImageIcon fot = new ImageIcon(Principal.class.getResource(user.getImagen()));
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));
		lblNewLabel.setIcon(icono);
		
		((CardLayout) panelCard.getLayout()).show(panelCard, "Usuario");
	}

	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ControlUsuarios cu = new ControlUsuarios();
			Usuario user = new Usuario(id,txtNombre.getText(),
					txtApellidos.getText(),txtEmail.getText(),"",
					Integer.parseInt(txtTelefono.getText().substring(1, txtTelefono.getText().length())),
					txtRol.getText(),txtConocimientos.getText(),"");
			cu.actualizarUsuario(user);
		}
	}
	private class BtnHabiitarEdicionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(true);
			txtApellidos.setEnabled(true);
			txtEmail.setEnabled(true);
			txtTelefono.setEnabled(true);
			txtRol.setEnabled(true);
			txtConocimientos.setEnabled(true);
		}
	}
}