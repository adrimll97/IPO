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
import java.awt.Image;
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
import dominio.ControlTareas;
import dominio.ControlUsuarios;
import dominio.Proyecto;
import dominio.Tarea;
import dominio.Usuario;

import javax.swing.tree.DefaultMutableTreeNode;
import presentacion.RoundButton;

import javax.swing.Icon;
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
	private JLabel lblNombre;
	private JLabel lblApellidos;
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
	
	private int idU;
	private int idP;
	private int idT;
	
	private static int usuario;
	private JScrollPane scrollPane;
	private JLabel lblFotoInicio;

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
		
		Autentificacion a = new Autentificacion();		
		ControlUsuarios cu = new ControlUsuarios();
		Usuario user = cu.obtenerUsuario(a.getUsuario());



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
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Foto:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		pnlInfoUsuario.add(scrollPane, gbc_scrollPane);
		
		lblFotoInicio = new JLabel("");
		lblFotoInicio.setSize(75, 75);
		ImageIcon fot = new ImageIcon(Principal.class.getResource(user.getImagen()));
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblFotoInicio.getWidth(), lblFotoInicio.getHeight(), Image.SCALE_DEFAULT));
		lblFotoInicio.setIcon(icono);
		scrollPane.setViewportView(lblFotoInicio);		

		lblNombre = new JLabel("Nombre");
		lblNombre.setText(user.getNombre());
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 0;
		pnlInfoUsuario.add(lblNombre, gbc_lblNombre);

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
		
				lblApellidos = new JLabel("Apellidos");
				lblApellidos.setText(user.getApellidos());
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.insets = new Insets(0, 0, 0, 5);
				gbc_lblApellidos.gridx = 1;
				gbc_lblApellidos.gridy = 1;
				pnlInfoUsuario.add(lblApellidos, gbc_lblApellidos);

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
				ControlTareas ct = new ControlTareas();
				ArrayList<Tarea> listaTareas = ct.obtenerTodosTareas();
				for(int i = 0 ; i<listaProyectos.size() ; i++) {
					node_2 = new DefaultMutableTreeNode(String.valueOf(listaProyectos.get(i).getIdProyecto()));
					node_3 = new DefaultMutableTreeNode(String.valueOf(listaTareas.get(0).getIdTarea()));
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

		PanelUsuario pnlUsuario = new PanelUsuario(panelCard,a.getUsuario());
		pnlUsuario.rellenar();
		panelCard.add(pnlUsuario, "Usuario");

		pnlProyecto = new PanelProyecto(panelCard,idP);
		panelCard.add(pnlProyecto, "Proyecto");

		pnlTarea = new PanelTarea(panelCard,idT);
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
			//System.out.println(id);
			String nodo = arg0.getPath().getPathComponent(1).toString();
			int n = arg0.getPath().getPathCount();
			System.out.println(nodo + "  " + n);
			if(n == 3 && nodo == "Proyectos") {
				nodo = "Proyecto";
				idP = Integer.parseInt(arg0.getPath().getLastPathComponent().toString());
			} else if (n == 3 && nodo == "Usuarios") {
				nodo = "Usuario";
				idU = Integer.parseInt(arg0.getPath().getLastPathComponent().toString());
			} else if (n == 4 && nodo == "Proyectos") {
				nodo = "Tarea";
				idT = Integer.parseInt(arg0.getPath().getLastPathComponent().toString());
			}
			switch (nodo) {
			case "Usuario":
				PanelUsuario u = new PanelUsuario(panelCard,idU);
				u.rellenar();
				break;
			case "Proyecto":
				PanelProyecto p = new PanelProyecto(panelCard,idP);
				p.rellenar();
				break;
			case "Tarea":
				PanelTarea t = new PanelTarea(panelCard,idT);
				t.rellenarTarea();
				break;
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
