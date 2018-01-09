package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.tree.TreeSelectionModel;

import dominio.ControlProyectos;
import dominio.ControlUsuarios;
import dominio.Proyecto;
import dominio.Usuario;

import javax.swing.tree.DefaultMutableTreeNode;
import presentacion.RoundButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.CardLayout;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JPanel pnlInfoUsuario;
	private JLabel lblFotoInicio;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblUltimoAcceso;
	private JButton btnCerrarSesion;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	private JScrollPane scpArbol;
	private JTree tree;
	private JPanel panelCard;
	private JPanel pnlUsuario;
	private JPanel pnlProyecto;
	private JPanel pnlTarea;
	private JPanel pnlVerImagenes;
	private RoundButton btnAyuda;

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
		addWindowListener(new ThisWindowListener());
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 917, 572);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnlInfoUsuario = new JPanel();
		pnlInfoUsuario.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlInfoUsuario, BorderLayout.NORTH);
		GridBagLayout gbl_pnlInfoUsuario = new GridBagLayout();
		gbl_pnlInfoUsuario.columnWidths = new int[] { 79, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 30,
				30, 30, 30, 30, 0, 0 };
		gbl_pnlInfoUsuario.rowHeights = new int[] { 41, 40, 0 };
		gbl_pnlInfoUsuario.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlInfoUsuario.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pnlInfoUsuario.setLayout(gbl_pnlInfoUsuario);

		lblFotoInicio = new JLabel("");
		lblFotoInicio.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_lblFotoInicio = new GridBagConstraints();
		gbc_lblFotoInicio.gridheight = 2;
		gbc_lblFotoInicio.insets = new Insets(0, 0, 0, 5);
		gbc_lblFotoInicio.fill = GridBagConstraints.BOTH;
		gbc_lblFotoInicio.gridx = 0;
		gbc_lblFotoInicio.gridy = 0;
		pnlInfoUsuario.add(lblFotoInicio, gbc_lblFotoInicio);

		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 0;
		pnlInfoUsuario.add(lblNombre, gbc_lblNombre);

		lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 2;
		gbc_lblApellidos.gridy = 0;
		pnlInfoUsuario.add(lblApellidos, gbc_lblApellidos);

		btnCerrarSesion = new RoundButton("close");
		btnCerrarSesion.setPreferredSize(new Dimension(65, 65));
		btnCerrarSesion.setMinimumSize(new Dimension(65, 65));
		btnCerrarSesion.setMaximumSize(new Dimension(65, 65));
		btnCerrarSesion.addActionListener(new CerrarSesionActionListener());
		btnCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrarSesion.setIcon(new ImageIcon(Principal.class.getResource("/presentacion/power-button-off.png")));
		btnCerrarSesion.setText("");
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.gridwidth = 3;
		gbc_btnCerrarSesion.gridheight = 2;
		gbc_btnCerrarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrarSesion.gridx = 23;
		gbc_btnCerrarSesion.gridy = 0;
		pnlInfoUsuario.add(btnCerrarSesion, gbc_btnCerrarSesion);

		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 2;
		gbc_separator.gridx = 26;
		gbc_separator.gridy = 0;
		pnlInfoUsuario.add(separator, gbc_separator);

		lblUltimoAcceso = new JLabel("Fecha ultimo acceso");
		GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
		gbc_lblUltimoAcceso.gridwidth = 2;
		gbc_lblUltimoAcceso.insets = new Insets(0, 0, 0, 5);
		gbc_lblUltimoAcceso.gridx = 1;
		gbc_lblUltimoAcceso.gridy = 1;
		pnlInfoUsuario.add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		
		btnAyuda = new RoundButton("close");
		btnAyuda.addActionListener(new BtnAyudaActionListener());
		btnAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAyuda.setIcon(new ImageIcon(Principal.class.getResource("/presentacion/question-mark.png")));
		btnAyuda.setText("");
		btnAyuda.setPreferredSize(new Dimension(65, 65));
		btnAyuda.setMinimumSize(new Dimension(65, 65));
		btnAyuda.setMaximumSize(new Dimension(65, 65));
		GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
		gbc_btnAyuda.gridheight = 2;
		gbc_btnAyuda.gridwidth = 3;
		gbc_btnAyuda.insets = new Insets(0, 0, 0, 5);
		gbc_btnAyuda.gridx = 20;
		gbc_btnAyuda.gridy = 0;
		pnlInfoUsuario.add(btnAyuda, gbc_btnAyuda);

		scpArbol = new JScrollPane();
		scpArbol.setPreferredSize(new Dimension(150, 2));
		contentPane.add(scpArbol, BorderLayout.WEST);

		tree = new JTree();
		tree.setRootVisible(false);
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Inicio") {
			{
				
				DefaultMutableTreeNode node_1;
				DefaultMutableTreeNode node_2;
				DefaultMutableTreeNode node_3;
				
				node_1 = new DefaultMutableTreeNode("Proyectos");
				ControlProyectos cp = new ControlProyectos();
				ArrayList<Proyecto> listaProyectos = cp.obtenerTodosProyectos();
				for(int i = 0 ; i<listaProyectos.size() ; i++) {
					node_2 = new DefaultMutableTreeNode(String.valueOf(listaProyectos.get(i).getIdProyecto()));
					node_3 = new DefaultMutableTreeNode("Tarea 1.1");
					node_2.add(node_3);
					node_1.add(node_2);
				}	
				/*node_2 = new DefaultMutableTreeNode("Proyecto 1");
				node_3 = new DefaultMutableTreeNode("Tarea 1.1");
				node_2.add(node_3);
				node_1.add(node_2);
				node_2 = new DefaultMutableTreeNode("Proyecto 2");
				node_2.add(new DefaultMutableTreeNode("Tarea 2.1"));
				node_3 = new DefaultMutableTreeNode("Tarea 2.2");
				node_2.add(node_3);
				node_1.add(node_2);*/
				add(node_1);
				
				node_1 = new DefaultMutableTreeNode("Usuarios");
				ControlUsuarios cu = new ControlUsuarios();
				ArrayList<Usuario> listaUsuarios = cu.obtenerTodosUsuarios();
				for(int i = 0 ; i<listaUsuarios.size() ; i++) {
					node_1.add(new DefaultMutableTreeNode(String.valueOf(listaUsuarios.get(i).getIdUser())));
				}				
				add(node_1);
			}
		}));
		scpArbol.add(tree);

		// Ponemos el modo de selección a simple
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

		tree.setCellRenderer(new MiRenderizadoArbol());
		scpArbol.setViewportView(tree);

		panelCard = new JPanel();
		contentPane.add(panelCard, BorderLayout.CENTER);
		panelCard.setLayout(new CardLayout(0, 0));

		pnlUsuario = new PanelUsuario(panelCard);
		panelCard.add(pnlUsuario, "Usuario");

		pnlProyecto = new PanelProyecto(panelCard);
		panelCard.add(pnlProyecto, "Proyecto");

		pnlTarea = new PanelTarea(panelCard);
		panelCard.add(pnlTarea, "Tarea");

		pnlVerImagenes = new VerImagenes();
		panelCard.add(pnlVerImagenes, "Imagen");
	}

	private class CerrarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere cerrar sesión?", "Cerrar sesión",
					dialogButton);
			if (dialogResult == 0) {
				Autentificacion login = new Autentificacion();
				login.getFrmLogin().setVisible(true);
				dispose();
			}
		}
	}

	private class ThisWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere cerrar sesión?", "Cerrar sesión",
					dialogButton);
			if (dialogResult == 0) {
				setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				Autentificacion login = new Autentificacion();
				login.getFrmLogin().setVisible(true);
			} else {
				setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			}
		}
	}

	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent arg0) {
			// Para saber en que nodo del árbol estoy
			String nodo = arg0.getPath().getPathComponent(1).toString();
			int n = arg0.getPath().getPathCount();
			if(n == 3 && nodo == "Proyectos") {
				nodo = "Proyecto";
			} else if (n == 3 && nodo == "Usuarios") {
				nodo = "Usuario";
			} else if (n == 4 && nodo == "Proyectos") {
				nodo = "Tarea";
			} else if (n == 5 && nodo == "Proyectos") {
				nodo = "Imagen";
			}
			switch (nodo) {
			case "Usuario":
			case "Proyecto":
			case "Tarea":
			case "Imagen":
				((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
			}
		}
	}
	private class BtnAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Ayuda ayuda = new Ayuda();
			ayuda.setVisible(true);
		}
	}
}
