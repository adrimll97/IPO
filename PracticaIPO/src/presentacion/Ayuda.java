package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JTree;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Point;
import java.awt.CardLayout;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;

public class Ayuda extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pnlAcciones;
	private JPanel pnlInformacion;
	private JTree arbolAcerca;
	private JTree arbolAyuda;
	private JPanel pnlAyudaGeneral;
	private JPanel pnlAyudaAutentificacion;
	private JPanel pnlAyudaRegistro;
	private JPanel pnlAyudaPrincipal;
	private JPanel pnlAyudaUsuarios;
	private JPanel pnlAyudaProyectos;
	private JPanel pnlAyudaTareas;
	private JTextArea ayudainicio;
	private JPanel pnlAcerca;
	private JPanel pnlInformacionAutores;
	private JPanel pnlCréditos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda frame = new Ayuda();
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
	public Ayuda() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/presentacion/question-mark.png")));
		setTitle("Ayuda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 719, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		pnlAcciones = new JPanel();
		tabbedPane.addTab("Ayuda", null, pnlAcciones, null);
		pnlAcciones.setLayout(new BorderLayout(0, 0));
		
		arbolAyuda = new JTree();
		arbolAyuda.addTreeSelectionListener(new TreeTreeSelectionListener());
		arbolAyuda.setRootVisible(false);
		arbolAyuda.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("inicio") {
				{
					add(new DefaultMutableTreeNode("Autentificación"));
					add(new DefaultMutableTreeNode("Registro"));
					add(new DefaultMutableTreeNode("Principal"));
					add(new DefaultMutableTreeNode("Panel Usuarios"));
					add(new DefaultMutableTreeNode("Panel Proyectos"));
					add(new DefaultMutableTreeNode("Panel Tareas"));
				}
			}
		));
		pnlAcciones.add(arbolAyuda, BorderLayout.WEST);
		
		pnlAyudaGeneral = new JPanel();
		pnlAyudaGeneral.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlAcciones.add(pnlAyudaGeneral, BorderLayout.CENTER);
		pnlAyudaGeneral.setLayout(new CardLayout(0, 0));
		
		ayudainicio = new JTextArea();
		ayudainicio.setEditable(false);
		ayudainicio.setText("Utilizando el sistema de ayuda:\r\nSeleccione en la izquierda el tema sobre el que quiera información.\r\n\r\nCambie a la pestaña \"Acerca de...\" para ver información sobre los autores y créditos.\r\n");
		pnlAyudaGeneral.add(ayudainicio, "inicio");
		
		pnlAyudaAutentificacion = new AyudaAutentificacion();
		pnlAyudaGeneral.add(pnlAyudaAutentificacion, "Autentificación");
		
		pnlAyudaRegistro = new AyudaRegistro();
		pnlAyudaGeneral.add(pnlAyudaRegistro, "Registro");
		
		pnlAyudaPrincipal = new AyudaPrincipal();
		pnlAyudaGeneral.add(pnlAyudaPrincipal, "Principal");
		
		pnlAyudaUsuarios = new AyudaUsuarios();
		pnlAyudaGeneral.add(pnlAyudaUsuarios, "Panel Usuarios");
		
		pnlAyudaProyectos = new AyudaProyectos();
		pnlAyudaGeneral.add(pnlAyudaProyectos, "Panel Proyectos");
		
		pnlAyudaTareas = new AyudaTareas();
		pnlAyudaGeneral.add(pnlAyudaTareas, "Panel Tareas");
		
		pnlInformacion = new JPanel();
		tabbedPane.addTab("Acerca de...", null, pnlInformacion, null);
		pnlInformacion.setLayout(new BorderLayout(0, 0));
		
		arbolAcerca = new JTree();
		arbolAcerca.addTreeSelectionListener(new ArbolAcercaTreeSelectionListener());
		arbolAcerca.setRootVisible(false);
		arbolAcerca.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
					add(new DefaultMutableTreeNode("Autores"));
					add(new DefaultMutableTreeNode("Créditos"));
				}
			}
		));
		pnlInformacion.add(arbolAcerca, BorderLayout.WEST);
		
		pnlAcerca = new JPanel();
		pnlInformacion.add(pnlAcerca, BorderLayout.CENTER);
		pnlAcerca.setLayout(new CardLayout(0, 0));
		
		pnlInformacionAutores = new InformacionAutores();
		pnlAcerca.add(pnlInformacionAutores, "Autores");
		
		pnlCréditos = new Creditos();
		pnlAcerca.add(pnlCréditos, "Créditos");
	}

	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent arg0) {
			String nodo = arg0.getPath().getLastPathComponent().toString();
			switch (nodo) {
			case "Autentificación":
			case "Registro":
			case "Principal":
			case "Panel Usuarios":
			case "Panel Proyectos":
			case "Panel Tareas":
				((CardLayout) pnlAyudaGeneral.getLayout()).show(pnlAyudaGeneral, nodo);
			}
		}
	}
	private class ArbolAcercaTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent arg0) {
			String nodo = arg0.getPath().getLastPathComponent().toString();
			switch (nodo) {
			case "Autores":
			case "Créditos":
				((CardLayout) pnlAcerca.getLayout()).show(pnlAcerca, nodo);
			}
		}
	}
}
