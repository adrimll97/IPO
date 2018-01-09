package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.time.DayOfWeek;
import com.toedter.calendar.JDateChooser;

import dominio.ControlTareas;
import dominio.Tarea;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class PanelTarea extends JPanel {
	private JPanel pnlOpciones;
	private JPanel pnlProyecto;
	private JLabel lblNombre;
	private JLabel lblFechaDeCreacin;
	private JLabel lblDescripcin;
	private JTextField txtNombre;
	private JDateChooser dchCreacion;
	private JTextArea txaDescipcion;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JButton btnEliminar;
	private JButton btnEditar;
	private JButton btnAñadir;
	private JLabel lblModo;
	private JSeparator separator_7;
	private JSeparator separator_8;
	private JToggleButton modoVisualizar;
	private JToggleButton modoElimiar;
	private JToggleButton modoEditar;
	private JToggleButton modoAñadir;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSeparator separator_10;
	private JLabel lblFechaDeFinalizacin;
	private JDateChooser dchFin;
	private JLabel lblEstado;
	private JComboBox cbxEstado;
	private JLabel lblPrioridad;
	private JSpinner spPrioridad;
	private JSeparator separator_11;
	private JSeparator separator_12;
	private JSeparator separator_9;
	private JPanel pnlUsuarios;
	private JToolBar toolBar;
	private JButton btnEliminarUsuarios;
	private JButton btnAadirUsuarios;
	private JScrollPane scrollPane;
	private JTable miTabla;
	private JPopupMenu popupMenu;
	private JButton btnEliminarPopup;
	private JButton btnAñadirPopup;
	private JButton btnAadirImagen;
	public static JPanel panelCard;
	static PanelTarea frame = new PanelTarea(panelCard);
	private JButton btnVerImagenes;
	/**
	 * Create the panel.
	 */
	public PanelTarea(JPanel panelCard) {
		PanelTarea.panelCard = panelCard;
		setLayout(new BorderLayout(0, 0));
		
		pnlOpciones = new JPanel();
		add(pnlOpciones, BorderLayout.NORTH);
		pnlOpciones.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		lblModo = new JLabel("Modo:");
		pnlOpciones.add(lblModo);
		
		modoVisualizar = new JToggleButton("Visualizar");
		modoVisualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		modoVisualizar.setSelected(true);
		modoVisualizar.addActionListener(new ModoVisualizarActionListener());
		buttonGroup.add(modoVisualizar);
		pnlOpciones.add(modoVisualizar);
		
		modoElimiar = new JToggleButton("Eliminar");
		modoElimiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		modoElimiar.addActionListener(new ModoElimiarActionListener());
		buttonGroup.add(modoElimiar);
		pnlOpciones.add(modoElimiar);
		
		modoEditar = new JToggleButton("Editar");
		modoEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		modoEditar.addActionListener(new ModoEditarActionListener());
		buttonGroup.add(modoEditar);
		pnlOpciones.add(modoEditar);
		
		modoAñadir = new JToggleButton("Añadir");
		modoAñadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		modoAñadir.addActionListener(new ModoAñadirActionListener());
		buttonGroup.add(modoAñadir);
		pnlOpciones.add(modoAñadir);
		
		pnlProyecto = new JPanel();
		add(pnlProyecto, BorderLayout.CENTER);
		GridBagLayout gbl_pnlProyecto = new GridBagLayout();
		gbl_pnlProyecto.columnWidths = new int[]{0, 0, 100, 100, -27, 101, 106, 0, 0, 0, 57, 0, 0, 0, 0};
		gbl_pnlProyecto.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlProyecto.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlProyecto.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlProyecto.setLayout(gbl_pnlProyecto);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 0;
		pnlProyecto.add(separator, gbc_separator);
		
		separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 1;
		pnlProyecto.add(separator_1, gbc_separator_1);
		
		separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 2;
		pnlProyecto.add(separator_2, gbc_separator_2);
		
		lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		pnlProyecto.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 3;
		pnlProyecto.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		pnlUsuarios = new JPanel();
		pnlUsuarios.setBorder(new TitledBorder(null, "Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlUsuarios = new GridBagConstraints();
		gbc_pnlUsuarios.gridheight = 9;
		gbc_pnlUsuarios.gridwidth = 2;
		gbc_pnlUsuarios.insets = new Insets(0, 0, 5, 5);
		gbc_pnlUsuarios.fill = GridBagConstraints.BOTH;
		gbc_pnlUsuarios.gridx = 5;
		gbc_pnlUsuarios.gridy = 3;
		pnlProyecto.add(pnlUsuarios, gbc_pnlUsuarios);
		pnlUsuarios.setLayout(new BorderLayout(0, 0));
		
		toolBar = new JToolBar();
		pnlUsuarios.add(toolBar, BorderLayout.NORTH);
		
		btnEliminarUsuarios = new JButton("Eliminar");
		btnEliminarUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminarUsuarios.addActionListener(new BtnEliminarUsuariosActionListener());
		btnEliminarUsuarios.setEnabled(false);
		toolBar.add(btnEliminarUsuarios);
		
		btnAadirUsuarios = new JButton("Añadir");
		btnAadirUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAadirUsuarios.addActionListener(new BtnAadirUsuariosActionListener());
		btnAadirUsuarios.setEnabled(false);
		toolBar.add(btnAadirUsuarios);
		
		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		pnlUsuarios.add(scrollPane, BorderLayout.CENTER);
		
		miTabla = new JTable();
		miTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		MiModeloTabla modeloTabla = new MiModeloTabla();
		miTabla.setModel(modeloTabla);
		miTabla.getColumnModel().getColumn(0).setResizable(false);
		miTabla.getColumnModel().getColumn(1).setResizable(false);
		
		popupMenu = new JPopupMenu();
		addPopup(scrollPane, popupMenu);
		addPopup(miTabla, popupMenu);
		
		btnEliminarPopup = new JButton("Eliminar");
		btnEliminarPopup.setEnabled(false);
		btnEliminarPopup.addActionListener(new BtnEliminarUsuariosActionListener());
		popupMenu.add(btnEliminarPopup);
		
		btnAñadirPopup = new JButton("Añadir");
		btnAñadirPopup.setEnabled(false);
		btnAñadirPopup.addActionListener(new BtnAadirUsuariosActionListener());
		popupMenu.add(btnAñadirPopup);
		scrollPane.setViewportView(miTabla);
		
		separator_9 = new JSeparator();
		GridBagConstraints gbc_separator_9 = new GridBagConstraints();
		gbc_separator_9.insets = new Insets(0, 0, 5, 0);
		gbc_separator_9.gridx = 13;
		gbc_separator_9.gridy = 3;
		pnlProyecto.add(separator_9, gbc_separator_9);
		
		separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 1;
		gbc_separator_3.gridy = 4;
		pnlProyecto.add(separator_3, gbc_separator_3);
		
		lblFechaDeCreacin = new JLabel("Fecha de creación: ");
		GridBagConstraints gbc_lblFechaDeCreacin = new GridBagConstraints();
		gbc_lblFechaDeCreacin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeCreacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeCreacin.gridx = 1;
		gbc_lblFechaDeCreacin.gridy = 5;
		pnlProyecto.add(lblFechaDeCreacin, gbc_lblFechaDeCreacin);
		
		dchCreacion = new JDateChooser();
		dchCreacion.getCalendarButton().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dchCreacion.setEnabled(false);
		GridBagConstraints gbc_dchCreacion = new GridBagConstraints();
		gbc_dchCreacion.gridwidth = 2;
		gbc_dchCreacion.insets = new Insets(0, 0, 5, 5);
		gbc_dchCreacion.fill = GridBagConstraints.BOTH;
		gbc_dchCreacion.gridx = 2;
		gbc_dchCreacion.gridy = 5;
		pnlProyecto.add(dchCreacion, gbc_dchCreacion);
		
		separator_11 = new JSeparator();
		GridBagConstraints gbc_separator_11 = new GridBagConstraints();
		gbc_separator_11.insets = new Insets(0, 0, 5, 5);
		gbc_separator_11.gridx = 1;
		gbc_separator_11.gridy = 6;
		pnlProyecto.add(separator_11, gbc_separator_11);
		
		lblFechaDeFinalizacin = new JLabel("Fecha de finalización: ");
		GridBagConstraints gbc_lblFechaDeFinalizacin = new GridBagConstraints();
		gbc_lblFechaDeFinalizacin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeFinalizacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeFinalizacin.gridx = 1;
		gbc_lblFechaDeFinalizacin.gridy = 7;
		pnlProyecto.add(lblFechaDeFinalizacin, gbc_lblFechaDeFinalizacin);
		
		dchFin = new JDateChooser();
		dchFin.getCalendarButton().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dchFin.setEnabled(false);
		GridBagConstraints gbc_dchFin = new GridBagConstraints();
		gbc_dchFin.gridwidth = 2;
		gbc_dchFin.insets = new Insets(0, 0, 5, 5);
		gbc_dchFin.fill = GridBagConstraints.BOTH;
		gbc_dchFin.gridx = 2;
		gbc_dchFin.gridy = 7;
		pnlProyecto.add(dchFin, gbc_dchFin);
		
		separator_12 = new JSeparator();
		GridBagConstraints gbc_separator_12 = new GridBagConstraints();
		gbc_separator_12.insets = new Insets(0, 0, 5, 5);
		gbc_separator_12.gridx = 1;
		gbc_separator_12.gridy = 8;
		pnlProyecto.add(separator_12, gbc_separator_12);
		
		lblEstado = new JLabel("Estado: ");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.EAST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 9;
		pnlProyecto.add(lblEstado, gbc_lblEstado);
		
		cbxEstado = new JComboBox();
		cbxEstado.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		cbxEstado.setEnabled(false);
		GridBagConstraints gbc_cbxEstado = new GridBagConstraints();
		gbc_cbxEstado.gridwidth = 2;
		gbc_cbxEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cbxEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxEstado.gridx = 2;
		gbc_cbxEstado.gridy = 9;
		pnlProyecto.add(cbxEstado, gbc_cbxEstado);
		
		lblPrioridad = new JLabel("Prioridad: ");
		GridBagConstraints gbc_lblPrioridad = new GridBagConstraints();
		gbc_lblPrioridad.anchor = GridBagConstraints.EAST;
		gbc_lblPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrioridad.gridx = 1;
		gbc_lblPrioridad.gridy = 10;
		pnlProyecto.add(lblPrioridad, gbc_lblPrioridad);
		
		spPrioridad = new JSpinner();
		spPrioridad.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spPrioridad.setEnabled(false);
		GridBagConstraints gbc_spPrioridad = new GridBagConstraints();
		gbc_spPrioridad.anchor = GridBagConstraints.WEST;
		gbc_spPrioridad.insets = new Insets(0, 0, 5, 5);
		gbc_spPrioridad.gridx = 2;
		gbc_spPrioridad.gridy = 10;
		pnlProyecto.add(spPrioridad, gbc_spPrioridad);
		
		lblDescripcin = new JLabel("Descripción: ");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 12;
		pnlProyecto.add(lblDescripcin, gbc_lblDescripcin);
		
		txaDescipcion = new JTextArea();
		txaDescipcion.setEnabled(false);
		GridBagConstraints gbc_txaDescipcion = new GridBagConstraints();
		gbc_txaDescipcion.gridheight = 3;
		gbc_txaDescipcion.gridwidth = 11;
		gbc_txaDescipcion.insets = new Insets(0, 0, 5, 5);
		gbc_txaDescipcion.fill = GridBagConstraints.BOTH;
		gbc_txaDescipcion.gridx = 2;
		gbc_txaDescipcion.gridy = 12;
		pnlProyecto.add(txaDescipcion, gbc_txaDescipcion);
		
		separator_10 = new JSeparator();
		GridBagConstraints gbc_separator_10 = new GridBagConstraints();
		gbc_separator_10.insets = new Insets(0, 0, 5, 5);
		gbc_separator_10.gridx = 0;
		gbc_separator_10.gridy = 13;
		pnlProyecto.add(separator_10, gbc_separator_10);
		
		separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 5, 5);
		gbc_separator_7.gridx = 3;
		gbc_separator_7.gridy = 15;
		pnlProyecto.add(separator_7, gbc_separator_7);
		
		btnAadirImagen = new JButton("Añadir Imagen");
		btnAadirImagen.addActionListener(new BtnAadirImagenActionListener());
		
		btnVerImagenes = new JButton("Ver Imágenes");
		btnVerImagenes.addActionListener(new BtnVerImagenesActionListener());
		btnVerImagenes.setEnabled(false);
		GridBagConstraints gbc_btnVerImagenes = new GridBagConstraints();
		gbc_btnVerImagenes.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerImagenes.gridx = 2;
		gbc_btnVerImagenes.gridy = 16;
		pnlProyecto.add(btnVerImagenes, gbc_btnVerImagenes);
		btnAadirImagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAadirImagen.setEnabled(false);
		GridBagConstraints gbc_btnAadirImagen = new GridBagConstraints();
		gbc_btnAadirImagen.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirImagen.gridx = 3;
		gbc_btnAadirImagen.gridy = 16;
		pnlProyecto.add(btnAadirImagen, gbc_btnAadirImagen);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setEnabled(false);
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 10;
		gbc_btnEliminar.gridy = 16;
		pnlProyecto.add(btnEliminar, gbc_btnEliminar);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new BtnEditarActionListener());
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.setEnabled(false);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 11;
		gbc_btnEditar.gridy = 16;
		pnlProyecto.add(btnEditar, gbc_btnEditar);
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new BtnAñadirActionListener());
		btnAñadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAñadir.setEnabled(false);
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 12;
		gbc_btnAñadir.gridy = 16;
		pnlProyecto.add(btnAñadir, gbc_btnAñadir);
		
		separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.insets = new Insets(0, 0, 0, 5);
		gbc_separator_8.gridx = 1;
		gbc_separator_8.gridy = 17;
		pnlProyecto.add(separator_8, gbc_separator_8);

	}

	private class ModoVisualizarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			txtNombre.setEnabled(false);
			txaDescipcion.setEnabled(false);
			dchCreacion.setEnabled(false);
			dchFin.setEnabled(false);
			cbxEstado.setEnabled(false);
			spPrioridad.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnAñadir.setEnabled(false);
			btnEditar.setEnabled(false);
			btnEliminarUsuarios.setEnabled(false);
			btnAadirUsuarios.setEnabled(false);
			btnEliminarPopup.setEnabled(false);
			btnAñadirPopup.setEnabled(false);
			btnAadirImagen.setEnabled(false);
			btnVerImagenes.setEnabled(false);
			miTabla.setEnabled(false);
		}
	}
	private class ModoElimiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(false);
			txaDescipcion.setEnabled(false);
			dchCreacion.setEnabled(false);
			dchFin.setEnabled(false);
			cbxEstado.setEnabled(false);
			spPrioridad.setEnabled(false);
			btnEliminar.setEnabled(true);
			btnAñadir.setEnabled(false);
			btnEditar.setEnabled(false);
			btnEliminarUsuarios.setEnabled(false);
			btnAadirUsuarios.setEnabled(false);
			btnEliminarPopup.setEnabled(false);
			btnAñadirPopup.setEnabled(false);
			btnAadirImagen.setEnabled(false);
			btnVerImagenes.setEnabled(false);
			miTabla.setEnabled(true);
		}
	}
	private class ModoEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(true);
			txaDescipcion.setEnabled(true);
			dchCreacion.setEnabled(true);
			dchFin.setEnabled(true);
			cbxEstado.setEnabled(true);
			spPrioridad.setEnabled(true);
			btnEliminar.setEnabled(false);
			btnAñadir.setEnabled(false);
			btnEditar.setEnabled(true);
			btnEliminarUsuarios.setEnabled(true);
			btnAadirUsuarios.setEnabled(true);
			btnEliminarPopup.setEnabled(true);
			btnAñadirPopup.setEnabled(true);
			btnAadirImagen.setEnabled(true);
			btnVerImagenes.setEnabled(true);
			miTabla.setEnabled(true);
		}
	}
	private class ModoAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(true);
			txaDescipcion.setEnabled(true);
			dchCreacion.setEnabled(true);
			dchFin.setEnabled(true);
			cbxEstado.setEnabled(true);
			spPrioridad.setEnabled(true);
			btnEliminar.setEnabled(false);
			btnAñadir.setEnabled(true);
			btnEditar.setEnabled(false);
			btnEliminarUsuarios.setEnabled(true);
			btnAadirUsuarios.setEnabled(true);
			btnEliminarPopup.setEnabled(true);
			btnAñadirPopup.setEnabled(true);
			btnAadirImagen.setEnabled(true);
			btnVerImagenes.setEnabled(true);
			miTabla.setEnabled(true);
		}
	}
	private class BtnAadirUsuariosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			MiModeloTabla modeloTabla = (MiModeloTabla) miTabla.getModel();
			Object[] nuevaFila = {"...", "..."};
			modeloTabla.aniadeFila(nuevaFila);
			modeloTabla.fireTableDataChanged();
		}
	}
	private class BtnEliminarUsuariosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MiModeloTabla modeloTabla = (MiModeloTabla) miTabla.getModel();
			int n= miTabla.getSelectedRow();
			if (n != -1) modeloTabla.eliminaFila(miTabla.getSelectedRow());
			modeloTabla.fireTableDataChanged();
		}
	}
	private class BtnAadirImagenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			// Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				// En este punto la aplicación se debería encargar de realizar la operación
				// sobre el fichero
				ImageIcon fot = new ImageIcon(file.getAbsolutePath());
				
				/*
				 * Guardar Imagen en la tarea asociada
				 */
			}
		}
	}
	private class BtnVerImagenesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout) panelCard.getLayout()).show(panelCard, "Imagen");
		}
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar el proyecto?", "Eliminar",
					dialogButton);
			if (dialogResult == 0) {
				//COGER ID
				ControlTareas ct = new ControlTareas();
				ct.eliminarTarea(0001);
				JOptionPane.showMessageDialog(null, "Tarea eliminada");
			} else {
				JOptionPane.showMessageDialog(null, "Eliminación cancelada");
			}
		}
	}
	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere editar la tarea?", "Editar",
					dialogButton);
			if (dialogResult == 0) {
				//COGER ID
				Tarea task = new Tarea(1,txtNombre.getText(), dchCreacion.getDate(), dchFin.getDate(), cbxEstado.getActionCommand(),
						spPrioridad.getComponentCount(),  txaDescipcion.getText());
				ControlTareas ct = new ControlTareas();
				ct.actualizarTarea(task);
				JOptionPane.showMessageDialog(null, "Tarea editada");
			} else {
				JOptionPane.showMessageDialog(null, "Edición cancelada");
			}
		}
	}
	private class BtnAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere guardar la nueva tarea?", "Añadir",
					dialogButton);
			if (dialogResult == 0) {
				Tarea task = new Tarea(txtNombre.getText(), dchCreacion.getDate(), dchFin.getDate(), cbxEstado.getActionCommand(),
						spPrioridad.getComponentCount(),  txaDescipcion.getText());
				ControlTareas ct = new ControlTareas();
				ct.añadirTarea(task);

				JOptionPane.showMessageDialog(null, "Tarea eliminada");
			} else {
				JOptionPane.showMessageDialog(null, "Eliminación cancelada");
			}
		}
	}
	
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}