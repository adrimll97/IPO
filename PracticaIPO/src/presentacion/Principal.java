package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import presentacion.RoundButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblFotoInicio;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblUltimoAcceso;
	private JButton btnCerrarSesion;
	private JSeparator separator;
	private JTree tree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
	public Principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 572);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{79, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33, 0, 0};
		gbl_panel.rowHeights = new int[]{41, 40, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblFotoInicio = new JLabel("");
		lblFotoInicio.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_lblFotoInicio = new GridBagConstraints();
		gbc_lblFotoInicio.gridheight = 2;
		gbc_lblFotoInicio.insets = new Insets(0, 0, 0, 5);
		gbc_lblFotoInicio.fill = GridBagConstraints.BOTH;
		gbc_lblFotoInicio.gridx = 0;
		gbc_lblFotoInicio.gridy = 0;
		panel.add(lblFotoInicio, gbc_lblFotoInicio);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 0;
		panel.add(lblNombre, gbc_lblNombre);
		
		lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 2;
		gbc_lblApellidos.gridy = 0;
		panel.add(lblApellidos, gbc_lblApellidos);
		
		btnCerrarSesion = new RoundButton("close");
		btnCerrarSesion.setIcon(new ImageIcon(Principal.class.getResource("/presentacion/power-button-off(1).png")));
		btnCerrarSesion.setText("");
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.gridwidth = 3;
		gbc_btnCerrarSesion.gridheight = 2;
		gbc_btnCerrarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrarSesion.gridx = 23;
		gbc_btnCerrarSesion.gridy = 0;
		panel.add(btnCerrarSesion, gbc_btnCerrarSesion);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 2;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 26;
		gbc_separator.gridy = 0;
		panel.add(separator, gbc_separator);
		
		lblUltimoAcceso = new JLabel("Fecha ultimo acceso");
		GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
		gbc_lblUltimoAcceso.gridwidth = 2;
		gbc_lblUltimoAcceso.insets = new Insets(0, 0, 0, 5);
		gbc_lblUltimoAcceso.gridx = 1;
		gbc_lblUltimoAcceso.gridy = 1;
		panel.add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		
		tree = new JTree();
		tree.setBackground(SystemColor.window);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Informacion") {
				{
					DefaultMutableTreeNode node_1;
					DefaultMutableTreeNode node_2;
					node_1 = new DefaultMutableTreeNode("Proyectos");
						node_2 = new DefaultMutableTreeNode("Proyecto 1");
							node_2.add(new DefaultMutableTreeNode("Tarea 1.1"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("Proyecto 2");
							node_2.add(new DefaultMutableTreeNode("Tarea 2.1"));
							node_2.add(new DefaultMutableTreeNode("Tarea 2.2"));
						node_1.add(node_2);
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Usuarios");
						node_1.add(new DefaultMutableTreeNode("Usuario 1"));
						node_1.add(new DefaultMutableTreeNode("Usuario 2"));
					add(node_1);
				}
			}
		));
		contentPane.add(tree, BorderLayout.WEST);
		
	}

}
