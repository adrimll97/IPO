package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.Component;
import java.awt.Cursor;

public class Autentificacion {

	private JFrame frmLogin;
	private JSplitPane splitPane;
	private JPanel panel;
	private JLabel lblIdentificacin;
	private JLabel lblContrasea;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnIniciar;
	private JRadioButton rdbtnEspaol;
	private JRadioButton rdbtnIngles;
	private JPanel panel_1;
	private JLabel lblRegistrese;
	private JLabel lblRegistro;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frmLogin.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		splitPane.setLeftComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{46, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 39, 45, 45, 77, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		rdbtnEspaol = new JRadioButton("Español");
		rdbtnEspaol.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonGroup.add(rdbtnEspaol);
		rdbtnEspaol.setSelected(true);
		rdbtnEspaol.setForeground(Color.BLUE);
		GridBagConstraints gbc_rdbtnEspaol = new GridBagConstraints();
		gbc_rdbtnEspaol.anchor = GridBagConstraints.EAST;
		gbc_rdbtnEspaol.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnEspaol.gridx = 3;
		gbc_rdbtnEspaol.gridy = 0;
		panel.add(rdbtnEspaol, gbc_rdbtnEspaol);
		
		rdbtnIngles = new JRadioButton("Ingles");
		rdbtnIngles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonGroup.add(rdbtnIngles);
		rdbtnIngles.setForeground(Color.BLUE);
		GridBagConstraints gbc_rdbtnIngles = new GridBagConstraints();
		gbc_rdbtnIngles.anchor = GridBagConstraints.WEST;
		gbc_rdbtnIngles.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnIngles.gridx = 4;
		gbc_rdbtnIngles.gridy = 0;
		panel.add(rdbtnIngles, gbc_rdbtnIngles);
		
		lblIdentificacin = new JLabel("Identificación:");
		GridBagConstraints gbc_lblIdentificacin = new GridBagConstraints();
		gbc_lblIdentificacin.anchor = GridBagConstraints.EAST;
		gbc_lblIdentificacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificacin.gridx = 1;
		gbc_lblIdentificacin.gridy = 2;
		panel.add(lblIdentificacin, gbc_lblIdentificacin);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblContrasea = new JLabel("Contraseña:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 3;
		panel.add(lblContrasea, gbc_lblContrasea);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnIniciar = new JButton("Iniciar sesión");
		btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciar.addActionListener(new BtnIniciarActionListener());
		GridBagConstraints gbc_btnIniciar = new GridBagConstraints();
		gbc_btnIniciar.anchor = GridBagConstraints.NORTH;
		gbc_btnIniciar.insets = new Insets(0, 0, 0, 5);
		gbc_btnIniciar.gridx = 3;
		gbc_btnIniciar.gridy = 4;
		panel.add(btnIniciar, gbc_btnIniciar);
		
		panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblRegistrese = new JLabel("Regístrese si aún no lo ha hecho:");
		lblRegistrese.setHorizontalTextPosition(SwingConstants.CENTER);
		lblRegistrese.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblRegistrese);
		
		lblRegistro = new JLabel("Registro");
		lblRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegistro.setForeground(Color.BLUE);
		panel_1.add(lblRegistro);
	}

	private class BtnIniciarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
}
