package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.WindowConstants;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class Autentificacion {

	private JFrame frmLogin;
	private JPanel panel;
	private JLabel lblIdentificacin;
	private JLabel lblContrasea;
	private JTextField tfUsuario;
	private JButton btnIniciar;
	private JRadioButton rdbtnEspaol;
	private JRadioButton rdbtnIngles;
	private JPanel panel_1;
	private JLabel lblRegistrese;
	private JLabel lblRegistro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField pfContraseña;
	private JRadioButton rbPass;
	private String usuario = "alumno";
	private String contraseña = "ipo1";

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
		frmLogin.addWindowListener(new FrmLoginWindowListener());
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				frmLogin.getContentPane().add(panel, BorderLayout.NORTH);
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 46, 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 39, 45, 45, 77, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
										
												tfUsuario = new JTextField();
												tfUsuario.addActionListener(new TextFieldActionListener());
												GridBagConstraints gbc_tfUsuario = new GridBagConstraints();
												gbc_tfUsuario.gridwidth = 2;
												gbc_tfUsuario.insets = new Insets(0, 0, 5, 5);
												gbc_tfUsuario.fill = GridBagConstraints.HORIZONTAL;
												gbc_tfUsuario.gridx = 2;
												gbc_tfUsuario.gridy = 2;
												panel.add(tfUsuario, gbc_tfUsuario);
												tfUsuario.setColumns(10);
												
														lblContrasea = new JLabel("Contraseña:");
														lblContrasea.setEnabled(false);
														GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
														gbc_lblContrasea.anchor = GridBagConstraints.EAST;
														gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
														gbc_lblContrasea.gridx = 1;
														gbc_lblContrasea.gridy = 3;
														panel.add(lblContrasea, gbc_lblContrasea);
														
																btnIniciar = new JButton("Iniciar sesión");
																btnIniciar.setEnabled(false);
																btnIniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																btnIniciar.addActionListener(new BtnIniciarActionListener());
																
																		pfContraseña = new JPasswordField();
																		pfContraseña.addActionListener(new PfContraseñaActionListener());
																		pfContraseña.setEnabled(false);
																		pfContraseña.setEchoChar('*');
																		GridBagConstraints gbc_pfContraseña = new GridBagConstraints();
																		gbc_pfContraseña.gridwidth = 2;
																		gbc_pfContraseña.insets = new Insets(0, 0, 5, 5);
																		gbc_pfContraseña.fill = GridBagConstraints.HORIZONTAL;
																		gbc_pfContraseña.gridx = 2;
																		gbc_pfContraseña.gridy = 3;
																		panel.add(pfContraseña, gbc_pfContraseña);
																		
																				rbPass = new JRadioButton("");
																				rbPass.setEnabled(false);
																				rbPass.addActionListener(new RdbtnNewRadioButtonActionListener());
																				rbPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																				rbPass.setIcon(new ImageIcon(Autentificacion.class.getResource("/presentacion/vision-off.png")));
																				GridBagConstraints gbc_rbPass = new GridBagConstraints();
																				gbc_rbPass.anchor = GridBagConstraints.WEST;
																				gbc_rbPass.insets = new Insets(0, 0, 5, 0);
																				gbc_rbPass.gridx = 4;
																				gbc_rbPass.gridy = 3;
																				panel.add(rbPass, gbc_rbPass);
																				GridBagConstraints gbc_btnIniciar = new GridBagConstraints();
																				gbc_btnIniciar.anchor = GridBagConstraints.NORTH;
																				gbc_btnIniciar.insets = new Insets(0, 0, 0, 5);
																				gbc_btnIniciar.gridx = 3;
																				gbc_btnIniciar.gridy = 4;
																				panel.add(btnIniciar, gbc_btnIniciar);
																				
																						panel_1 = new JPanel();
																						panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
																						frmLogin.getContentPane().add(panel_1, BorderLayout.SOUTH);
																						panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
																						
																								lblRegistrese = new JLabel("Regístrese si aún no lo ha hecho:");
																								lblRegistrese.setHorizontalTextPosition(SwingConstants.CENTER);
																								lblRegistrese.setHorizontalAlignment(SwingConstants.CENTER);
																								panel_1.add(lblRegistrese);
																								
																										lblRegistro = new JLabel("Registro");
																										lblRegistro.addMouseListener(new LblRegistroMouseListener());
																										lblRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																										lblRegistro.setForeground(Color.BLUE);
																										panel_1.add(lblRegistro);
	}

	public JFrame getFrmLogin() {
		return frmLogin;
	}

	private class BtnIniciarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Principal inicio = new Principal();
			inicio.setExtendedState(frmLogin.MAXIMIZED_BOTH);
			inicio.setVisible(true);
			frmLogin.dispose();
		}
	}

	private class LblRegistroMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent arg0) {
			Registro otraVentana = new Registro();
			otraVentana.setVisible(true);
			frmLogin.dispose();
		}
	}

	private class FrmLoginWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent arg0) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(frmLogin, "¿Quiere salir de la aplicación?", "Salir",
					dialogButton);
			if (dialogResult == 0) {
				frmLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				JOptionPane.showMessageDialog(frmLogin, "Gracias por utilizar nuestra aplicación", "Cerrar la aplicación",
						JOptionPane.PLAIN_MESSAGE);
			}
			else {
				frmLogin.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			}
		}
	}

	private class RdbtnNewRadioButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (rbPass.isSelected()) {
				rbPass.setIcon(new ImageIcon(Autentificacion.class.getResource("/presentacion/vision.png")));
				pfContraseña.setEchoChar((char) 0);
			} else {
				rbPass.setIcon(new ImageIcon(Autentificacion.class.getResource("/presentacion/vision-off.png")));
				pfContraseña.setEchoChar('*');
			}
		}

	}

	private class TextFieldActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (String.valueOf(tfUsuario.getText()).equals(usuario)) {
				tfUsuario.setBackground(Color.GREEN);
				lblContrasea.setEnabled(true);
				pfContraseña.setEnabled(true);
				rbPass.setEnabled(true);
				pfContraseña.requestFocus();
			} else {
				tfUsuario.setBackground(Color.RED);
			}
		}
	}

	private class PfContraseñaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (String.valueOf(pfContraseña.getPassword()).equals(contraseña)) {
				pfContraseña.setBackground(Color.GREEN);
				btnIniciar.setEnabled(true);
			} else {
				pfContraseña.setBackground(Color.RED);
				btnIniciar.setEnabled(false);
			}
		}
	}
}
