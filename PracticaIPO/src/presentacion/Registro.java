package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import dominio.ControlUsuarios;
import dominio.Usuario;

import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblEmail;
	private JLabel lblConfirmarEmail;
	private JLabel lblContrasea;
	private JLabel lblConfirmarContrasea;
	private JTextField txtIdentificacion;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtConfirmarEmail;
	private JTextField txtContrasena;
	private JTextField txtConfirmarContrasena;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JButton btnSeleccionarImagen;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JSeparator separator_10;
	private JScrollPane scrollPane;
	private JLabel lblFoto;
	private JLabel lblTelfono;
	private JTextField txtEmail;
	private JSeparator separator_11;
	private JLabel lblWarningUsuario;
	private JLabel lblWarningNombre;
	private JLabel lblWarningApellidos;
	private JLabel lblWarningTelefono;
	private JLabel lblWarningEmail;
	private JLabel lblWarningConfirmarEmail;
	private JLabel lblWarningContraseña;
	private JLabel lblWarningConfirmarContraseña;
	private boolean usuarioV;
	private boolean nombreV;
	private boolean apellidosV;
	private boolean telefonoV;
	private boolean emailV;
	private boolean confEmailV;
	private boolean contraseñaV;
	private boolean confContraseñaV;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		setResizable(false);
		addWindowListener(new ThisWindowListener());
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 362);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{-44, 36, 0, 0, 0, 0, 77, 88, 30, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 5, 5);
		gbc_separator_7.gridx = 2;
		gbc_separator_7.gridy = 0;
		panel.add(separator_7, gbc_separator_7);
		
		lblUsuario = new JLabel("Usuario: ");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 5;
		gbc_lblUsuario.gridy = 1;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		txtIdentificacion = new JTextField();
		txtIdentificacion.addFocusListener(new TxtIdentificacionFocusListener());
		txtIdentificacion.setBorder(UIManager.getBorder("TextField.border"));
		txtIdentificacion.setCaretColor(new Color(0, 0, 0));
		GridBagConstraints gbc_txtIdentificacion = new GridBagConstraints();
		gbc_txtIdentificacion.gridwidth = 2;
		gbc_txtIdentificacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdentificacion.gridx = 6;
		gbc_txtIdentificacion.gridy = 1;
		panel.add(txtIdentificacion, gbc_txtIdentificacion);
		txtIdentificacion.setColumns(10);
		
		lblWarningUsuario = new JLabel("");
		GridBagConstraints gbc_lblWarningUsuario = new GridBagConstraints();
		gbc_lblWarningUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningUsuario.gridx = 8;
		gbc_lblWarningUsuario.gridy = 1;
		panel.add(lblWarningUsuario, gbc_lblWarningUsuario);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 5;
		gbc_separator.gridy = 2;
		panel.add(separator, gbc_separator);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridheight = 10;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);
		
		lblFoto = new JLabel("");
		scrollPane.setViewportView(lblFoto);
		
		lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 5;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new TxtNombreFocusListener());
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 6;
		gbc_txtNombre.gridy = 3;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblWarningNombre = new JLabel("");
		GridBagConstraints gbc_lblWarningNombre = new GridBagConstraints();
		gbc_lblWarningNombre.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningNombre.gridx = 8;
		gbc_lblWarningNombre.gridy = 3;
		panel.add(lblWarningNombre, gbc_lblWarningNombre);
		
		separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 5;
		gbc_separator_1.gridy = 4;
		panel.add(separator_1, gbc_separator_1);
		
		lblApellidos = new JLabel("Apellidos: ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 5;
		gbc_lblApellidos.gridy = 5;
		panel.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.addFocusListener(new TxtApellidosFocusListener());
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 2;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 6;
		gbc_txtApellidos.gridy = 5;
		panel.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblWarningApellidos = new JLabel("");
		GridBagConstraints gbc_lblWarningApellidos = new GridBagConstraints();
		gbc_lblWarningApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningApellidos.gridx = 8;
		gbc_lblWarningApellidos.gridy = 5;
		panel.add(lblWarningApellidos, gbc_lblWarningApellidos);
		
		separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 5;
		gbc_separator_2.gridy = 6;
		panel.add(separator_2, gbc_separator_2);
		
		separator_9 = new JSeparator();
		GridBagConstraints gbc_separator_9 = new GridBagConstraints();
		gbc_separator_9.insets = new Insets(0, 0, 5, 5);
		gbc_separator_9.gridx = 0;
		gbc_separator_9.gridy = 7;
		panel.add(separator_9, gbc_separator_9);
		
		lblEmail = new JLabel("Telefono: ");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 5;
		gbc_lblEmail.gridy = 7;
		panel.add(lblEmail, gbc_lblEmail);
		
		MaskFormatter formatoTlfno;
		try {
		formatoTlfno = new MaskFormatter("' #########");
		formatoTlfno.setPlaceholderCharacter('*');
		txtTelefono = new JFormattedTextField(formatoTlfno);
		txtTelefono.addFocusListener(new TxtTelefonoFocusListener());
		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.gridwidth = 2;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 6;
		gbc_txtTelefono.gridy = 7;
		panel.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		lblWarningTelefono = new JLabel("");
		GridBagConstraints gbc_lblWarningTelefono = new GridBagConstraints();
		gbc_lblWarningTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningTelefono.gridx = 8;
		gbc_lblWarningTelefono.gridy = 7;
		panel.add(lblWarningTelefono, gbc_lblWarningTelefono);
		
		separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 5;
		gbc_separator_3.gridy = 8;
		panel.add(separator_3, gbc_separator_3);
		
		lblTelfono = new JLabel("Email: ");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 5;
		gbc_lblTelfono.gridy = 9;
		panel.add(lblTelfono, gbc_lblTelfono);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new TxtEmailFocusListener());
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 6;
		gbc_txtEmail.gridy = 9;
		panel.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		lblWarningEmail = new JLabel("");
		GridBagConstraints gbc_lblWarningEmail = new GridBagConstraints();
		gbc_lblWarningEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningEmail.gridx = 8;
		gbc_lblWarningEmail.gridy = 9;
		panel.add(lblWarningEmail, gbc_lblWarningEmail);
		
		separator_11 = new JSeparator();
		GridBagConstraints gbc_separator_11 = new GridBagConstraints();
		gbc_separator_11.insets = new Insets(0, 0, 5, 5);
		gbc_separator_11.gridx = 5;
		gbc_separator_11.gridy = 10;
		panel.add(separator_11, gbc_separator_11);
		
		separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.insets = new Insets(0, 0, 5, 5);
		gbc_separator_8.gridx = 4;
		gbc_separator_8.gridy = 11;
		panel.add(separator_8, gbc_separator_8);
		
		lblConfirmarEmail = new JLabel("Confirmar email: ");
		GridBagConstraints gbc_lblConfirmarEmail = new GridBagConstraints();
		gbc_lblConfirmarEmail.anchor = GridBagConstraints.EAST;
		gbc_lblConfirmarEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarEmail.gridx = 5;
		gbc_lblConfirmarEmail.gridy = 11;
		panel.add(lblConfirmarEmail, gbc_lblConfirmarEmail);
		
		txtConfirmarEmail = new JTextField();
		txtConfirmarEmail.addFocusListener(new TxtConfirmarEmailFocusListener());
		GridBagConstraints gbc_txtConfirmarEmail = new GridBagConstraints();
		gbc_txtConfirmarEmail.gridwidth = 2;
		gbc_txtConfirmarEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtConfirmarEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtConfirmarEmail.gridx = 6;
		gbc_txtConfirmarEmail.gridy = 11;
		panel.add(txtConfirmarEmail, gbc_txtConfirmarEmail);
		txtConfirmarEmail.setColumns(10);
		
		lblWarningConfirmarEmail = new JLabel("");
		GridBagConstraints gbc_lblWarningConfirmarEmail = new GridBagConstraints();
		gbc_lblWarningConfirmarEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningConfirmarEmail.gridx = 8;
		gbc_lblWarningConfirmarEmail.gridy = 11;
		panel.add(lblWarningConfirmarEmail, gbc_lblWarningConfirmarEmail);
		
		separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 5;
		gbc_separator_4.gridy = 12;
		panel.add(separator_4, gbc_separator_4);
		
		btnSeleccionarImagen = new JButton("Seleccionar imagen");
		btnSeleccionarImagen.addActionListener(new BtnSeleccionarImagenActionListener());
		btnSeleccionarImagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnSeleccionarImagen = new GridBagConstraints();
		gbc_btnSeleccionarImagen.gridwidth = 2;
		gbc_btnSeleccionarImagen.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeleccionarImagen.gridx = 1;
		gbc_btnSeleccionarImagen.gridy = 13;
		panel.add(btnSeleccionarImagen, gbc_btnSeleccionarImagen);
		
		lblContrasea = new JLabel("Contraseña: ");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 5;
		gbc_lblContrasea.gridy = 13;
		panel.add(lblContrasea, gbc_lblContrasea);
		
		txtContrasena = new JTextField();
		txtContrasena.addFocusListener(new TxtContrasenaFocusListener());
		GridBagConstraints gbc_txtContrasena = new GridBagConstraints();
		gbc_txtContrasena.gridwidth = 2;
		gbc_txtContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_txtContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContrasena.gridx = 6;
		gbc_txtContrasena.gridy = 13;
		panel.add(txtContrasena, gbc_txtContrasena);
		txtContrasena.setColumns(10);
		
		lblWarningContraseña = new JLabel("");
		GridBagConstraints gbc_lblWarningContraseña = new GridBagConstraints();
		gbc_lblWarningContraseña.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningContraseña.gridx = 8;
		gbc_lblWarningContraseña.gridy = 13;
		panel.add(lblWarningContraseña, gbc_lblWarningContraseña);
		
		separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 5;
		gbc_separator_5.gridy = 14;
		panel.add(separator_5, gbc_separator_5);
		
		lblConfirmarContrasea = new JLabel("Confirmar contraseña: ");
		GridBagConstraints gbc_lblConfirmarContrasea = new GridBagConstraints();
		gbc_lblConfirmarContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblConfirmarContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarContrasea.gridx = 5;
		gbc_lblConfirmarContrasea.gridy = 15;
		panel.add(lblConfirmarContrasea, gbc_lblConfirmarContrasea);
		
		txtConfirmarContrasena = new JTextField();
		txtConfirmarContrasena.addFocusListener(new TxtConfirmarContrasenaFocusListener());
		GridBagConstraints gbc_txtConfirmarContrasena = new GridBagConstraints();
		gbc_txtConfirmarContrasena.gridwidth = 2;
		gbc_txtConfirmarContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_txtConfirmarContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtConfirmarContrasena.gridx = 6;
		gbc_txtConfirmarContrasena.gridy = 15;
		panel.add(txtConfirmarContrasena, gbc_txtConfirmarContrasena);
		txtConfirmarContrasena.setColumns(10);
		
		lblWarningConfirmarContraseña = new JLabel("");
		GridBagConstraints gbc_lblWarningConfirmarContraseña = new GridBagConstraints();
		gbc_lblWarningConfirmarContraseña.insets = new Insets(0, 0, 5, 0);
		gbc_lblWarningConfirmarContraseña.gridx = 8;
		gbc_lblWarningConfirmarContraseña.gridy = 15;
		panel.add(lblWarningConfirmarContraseña, gbc_lblWarningConfirmarContraseña);
		
		separator_6 = new JSeparator();
		GridBagConstraints gbc_separator_6 = new GridBagConstraints();
		gbc_separator_6.insets = new Insets(0, 0, 5, 5);
		gbc_separator_6.gridx = 5;
		gbc_separator_6.gridy = 16;
		panel.add(separator_6, gbc_separator_6);
		
		separator_10 = new JSeparator();
		GridBagConstraints gbc_separator_10 = new GridBagConstraints();
		gbc_separator_10.insets = new Insets(0, 0, 5, 5);
		gbc_separator_10.gridx = 1;
		gbc_separator_10.gridy = 17;
		panel.add(separator_10, gbc_separator_10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 6;
		gbc_btnCancelar.gridy = 18;
		panel.add(btnCancelar, gbc_btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.anchor = GridBagConstraints.EAST;
		gbc_btnAceptar.gridx = 7;
		gbc_btnAceptar.gridy = 18;
		panel.add(btnAceptar, gbc_btnAceptar);		
	}

	private class BtnSeleccionarImagenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(null);
			// Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				// En este punto la aplicación se debería encargar de realizar la operación
				// sobre el fichero
				ImageIcon fot = new ImageIcon(file.getAbsolutePath());
				Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
				lblFoto.setIcon(icono);
			}
		}
	}
	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere cancelar el registro?", "Cancelar",
					dialogButton);
			if (dialogResult == 0) {
				Autentificacion login = new Autentificacion();
				login.getFrmLogin().setVisible(true);
				dispose();
			} 
		}
	}
	private class ThisWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			Autentificacion login = new Autentificacion();
			login.getFrmLogin().setVisible(true);
		}
	}
		
	private class TxtIdentificacionFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {
			arg0.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
			if(txtIdentificacion.getText().isEmpty()) {
				lblWarningUsuario.setIcon(new ImageIcon(Principal.class.getResource("warning-weather-interface-outlined-symbol.png")));
				usuarioV = false;
			} else {
				lblWarningUsuario.setIcon(new ImageIcon(Principal.class.getResource("checking.png")));
				usuarioV = true;
			}
		}
	}
	
	private class TxtNombreFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
			if(txtNombre.getText().isEmpty()) {
				lblWarningNombre.setIcon(new ImageIcon(Principal.class.getResource("warning-weather-interface-outlined-symbol.png")));
				nombreV = false;
			} else {
				lblWarningNombre.setIcon(new ImageIcon(Principal.class.getResource("checking.png")));
				nombreV = true;
			}
		}
	}
	
	private class TxtApellidosFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
			if(txtApellidos.getText().isEmpty()) {
				lblWarningApellidos.setIcon(new ImageIcon(Principal.class.getResource("warning-weather-interface-outlined-symbol.png")));
				apellidosV = false;
			} else {
				lblWarningApellidos.setIcon(new ImageIcon(Principal.class.getResource("checking.png")));
				apellidosV = true;
			}
		}
	}
	
	private class TxtTelefonoFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
			if(txtTelefono.getText().equals(" *********")) {
				lblWarningTelefono.setIcon(new ImageIcon(Principal.class.getResource("warning-weather-interface-outlined-symbol.png")));
				telefonoV = false;
			} else {
				lblWarningTelefono.setIcon(new ImageIcon(Principal.class.getResource("checking.png")));
				telefonoV = true;
			}
		}
	}
	
	private class TxtEmailFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
			if(txtEmail.getText().isEmpty()) {
				lblWarningEmail.setIcon(new ImageIcon(Principal.class.getResource("warning-weather-interface-outlined-symbol.png")));
				emailV = false;
			} else {
				lblWarningEmail.setIcon(new ImageIcon(Principal.class.getResource("checking.png")));
				emailV = true;
			}
		}
	}
	
	private class TxtConfirmarEmailFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {
			arg0.getComponent().setBackground(new Color(250, 250, 210));
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			if (txtConfirmarEmail.getText().isEmpty()) {
				arg0.getComponent().setBackground(Color.RED);
				confEmailV = false;
			} else {
				if (txtConfirmarEmail.getText().equals(txtEmail.getText())) {
					arg0.getComponent().setBackground(Color.GREEN);
					confEmailV = true;
				} else {
					arg0.getComponent().setBackground(Color.RED);
					confEmailV = false;
				}
			}
		}
	}
	
	private class TxtContrasenaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
			if(txtContrasena.getText().isEmpty()) {
				lblWarningContraseña.setIcon(new ImageIcon(Principal.class.getResource("warning-weather-interface-outlined-symbol.png")));
				contraseñaV = false;
			} else {
				lblWarningContraseña.setIcon(new ImageIcon(Principal.class.getResource("checking.png")));
				contraseñaV = true;
			}
		}
	}
	
	private class TxtConfirmarContrasenaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {
			arg0.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent arg0) {
			if (txtConfirmarContrasena.getText().isEmpty()) {
				arg0.getComponent().setBackground(Color.RED);
				confContraseñaV = false;
			} else {
				if (txtConfirmarContrasena.getText().equals(txtContrasena.getText())) {
					arg0.getComponent().setBackground(Color.GREEN);
					confContraseñaV = true;
				} else {
					arg0.getComponent().setBackground(Color.RED);
					confContraseñaV = false;
				}
			}
		}
	}
	
	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(usuarioV && nombreV && apellidosV && telefonoV && emailV && confEmailV && contraseñaV && confContraseñaV) {
				Principal inicio = new Principal();
				inicio.setExtendedState(MAXIMIZED_BOTH);
				inicio.setVisible(true);
				dispose();
				Usuario newUser = new Usuario(Integer.parseInt(txtIdentificacion.getText()),txtNombre.getText(),
						txtApellidos.getText(),txtEmail.getText(),txtContrasena.getText(),
						Integer.parseInt(txtTelefono.getText().substring(1, txtTelefono.getText().length())));
				ControlUsuarios cu = new ControlUsuarios();
				cu.añadirUsuario(newUser);
				
				JOptionPane.showMessageDialog(null, "Usuario añadido con éxito");		
			} else {
				JOptionPane.showMessageDialog(null, "Por favor introduzca todos los datos");
			}
		}
	}
}
