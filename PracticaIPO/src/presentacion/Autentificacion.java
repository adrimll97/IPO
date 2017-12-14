package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSplitPane;

public class Autentificacion {

	private JFrame frmLogin;
	private JPanel panel;
	private JLabel lblIdentificacin;
	private JLabel lblContrasea;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnIniciarSesion;
	private JRadioButton rdbtnEspaol;
	private JRadioButton rdbtnIngls;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblRegstreseSiAn;
	private JLabel lblRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autentificacion window = new Autentificacion();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Autentificacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 697, 400);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frmLogin.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{60, 0, 203, 0, 126, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{75, 75, 86, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		rdbtnEspaol = new JRadioButton("Español");
		rdbtnEspaol.setSelected(true);
		rdbtnEspaol.setForeground(Color.BLUE);
		buttonGroup.add(rdbtnEspaol);
		GridBagConstraints gbc_rdbtnEspaol = new GridBagConstraints();
		gbc_rdbtnEspaol.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnEspaol.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnEspaol.gridx = 5;
		gbc_rdbtnEspaol.gridy = 0;
		panel.add(rdbtnEspaol, gbc_rdbtnEspaol);
		
		rdbtnIngls = new JRadioButton("Inglés");
		rdbtnIngls.setForeground(Color.BLUE);
		buttonGroup.add(rdbtnIngls);
		GridBagConstraints gbc_rdbtnIngls = new GridBagConstraints();
		gbc_rdbtnIngls.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnIngls.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnIngls.gridx = 6;
		gbc_rdbtnIngls.gridy = 0;
		panel.add(rdbtnIngls, gbc_rdbtnIngls);
		
		lblIdentificacin = new JLabel("Identificación: ");
		GridBagConstraints gbc_lblIdentificacin = new GridBagConstraints();
		gbc_lblIdentificacin.anchor = GridBagConstraints.EAST;
		gbc_lblIdentificacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificacin.gridx = 1;
		gbc_lblIdentificacin.gridy = 1;
		panel.add(lblIdentificacin, gbc_lblIdentificacin);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblContrasea = new JLabel("Contraseña: ");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 2;
		panel.add(lblContrasea, gbc_lblContrasea);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnIniciarSesion = new JButton("Iniciar sesión");
		GridBagConstraints gbc_btnIniciarSesion = new GridBagConstraints();
		gbc_btnIniciarSesion.anchor = GridBagConstraints.EAST;
		gbc_btnIniciarSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciarSesion.gridx = 4;
		gbc_btnIniciarSesion.gridy = 3;
		panel.add(btnIniciarSesion, gbc_btnIniciarSesion);
		
		lblRegstreseSiAn = new JLabel("Regístrese si aún no lo ha hecho: ");
		GridBagConstraints gbc_lblRegstreseSiAn = new GridBagConstraints();
		gbc_lblRegstreseSiAn.anchor = GridBagConstraints.EAST;
		gbc_lblRegstreseSiAn.gridwidth = 2;
		gbc_lblRegstreseSiAn.insets = new Insets(0, 0, 0, 5);
		gbc_lblRegstreseSiAn.gridx = 1;
		gbc_lblRegstreseSiAn.gridy = 5;
		panel.add(lblRegstreseSiAn, gbc_lblRegstreseSiAn);
		
		lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(Color.BLUE);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 0, 5);
		gbc_lblRegistro.gridx = 3;
		gbc_lblRegistro.gridy = 5;
		panel.add(lblRegistro, gbc_lblRegistro);
	}
}
