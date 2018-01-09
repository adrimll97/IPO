package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JToolBar;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.time.DayOfWeek;
import com.toedter.calendar.JDateChooser;

import dominio.ControlProyectos;
import dominio.Proyecto;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelProyecto extends JPanel {
	private JPanel pnlOpciones;
	private JPanel pnlProyecto;
	private JLabel lblNombre;
	private JLabel lblFechaDeCreacin;
	private JLabel lblResponsableDelProyecto;
	private JLabel lblDescripcin;
	private JTextField txtNombre;
	private JTextField txtResponsable;
	private JDateChooser dateChooser;
	private JScrollPane scrollPane;
	private JList listaTareas;
	private JTextArea txaDescipcion;
	private JScrollPane scrollPane_1;
	private JList listaMiembros;
	private JSeparator separator_2;
	private JSeparator separator_4;
	private JButton btnEliminar;
	private JButton btnEditar;
	private JButton btnAñadir;
	private JLabel lblModo;
	private JSeparator separator_7;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JToggleButton modoVisualizar;
	private JToggleButton modoElimiar;
	private JToggleButton modoEditar;
	private JToggleButton modoAñadir;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSeparator separator_10;
	private JSeparator separator;
	private JToolBar toolBar;
	private JButton btnAadirTarea;
	private JPopupMenu popupMenu;
	private JButton btnAadirTarea_1;
	public JPanel panelCard;

	/**
	 * Create the panel.
	 */
	public PanelProyecto(JPanel panelCard) {
		this.panelCard = panelCard;
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
		gbl_pnlProyecto.columnWidths = new int[]{0, 0, 182, 0, 101, 38, 106, 57, 0, 0, 0, 0};
		gbl_pnlProyecto.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlProyecto.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlProyecto.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlProyecto.setLayout(gbl_pnlProyecto);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 0;
		pnlProyecto.add(separator, gbc_separator);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new TitledBorder(null, "Miembros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 6;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 4;
		gbc_scrollPane_1.gridy = 1;
		pnlProyecto.add(scrollPane_1, gbc_scrollPane_1);
		
		listaMiembros = new JList();
		listaMiembros.setEnabled(false);
		scrollPane_1.setViewportView(listaMiembros);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Tareas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 6;
		gbc_scrollPane.gridy = 1;
		pnlProyecto.add(scrollPane, gbc_scrollPane);
		
		listaTareas = new JList();
		listaTareas.setEnabled(false);
		scrollPane.setViewportView(listaTareas);
		
		popupMenu = new JPopupMenu();
		addPopup(listaTareas, popupMenu);
		
		btnAadirTarea_1 = new JButton("Añadir tarea");
		btnAadirTarea_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAadirTarea_1.setEnabled(false);
		popupMenu.add(btnAadirTarea_1);
		
		toolBar = new JToolBar();
		scrollPane.setColumnHeaderView(toolBar);
		
		btnAadirTarea = new JButton("Añadir tarea");
		btnAadirTarea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAadirTarea.setEnabled(false);
		toolBar.add(btnAadirTarea);
		
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
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 3;
		pnlProyecto.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		separator_9 = new JSeparator();
		GridBagConstraints gbc_separator_9 = new GridBagConstraints();
		gbc_separator_9.insets = new Insets(0, 0, 5, 0);
		gbc_separator_9.gridx = 10;
		gbc_separator_9.gridy = 3;
		pnlProyecto.add(separator_9, gbc_separator_9);
		
		lblFechaDeCreacin = new JLabel("Fecha de creación: ");
		GridBagConstraints gbc_lblFechaDeCreacin = new GridBagConstraints();
		gbc_lblFechaDeCreacin.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeCreacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeCreacin.gridx = 1;
		gbc_lblFechaDeCreacin.gridy = 4;
		pnlProyecto.add(lblFechaDeCreacin, gbc_lblFechaDeCreacin);
		
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dateChooser.setEnabled(false);
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 4;
		pnlProyecto.add(dateChooser, gbc_dateChooser);
		
		lblResponsableDelProyecto = new JLabel("Responsable del proyecto: ");
		GridBagConstraints gbc_lblResponsableDelProyecto = new GridBagConstraints();
		gbc_lblResponsableDelProyecto.anchor = GridBagConstraints.EAST;
		gbc_lblResponsableDelProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblResponsableDelProyecto.gridx = 1;
		gbc_lblResponsableDelProyecto.gridy = 5;
		pnlProyecto.add(lblResponsableDelProyecto, gbc_lblResponsableDelProyecto);
		
		txtResponsable = new JTextField();
		txtResponsable.setEnabled(false);
		GridBagConstraints gbc_txtResponsable = new GridBagConstraints();
		gbc_txtResponsable.insets = new Insets(0, 0, 5, 5);
		gbc_txtResponsable.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtResponsable.gridx = 2;
		gbc_txtResponsable.gridy = 5;
		pnlProyecto.add(txtResponsable, gbc_txtResponsable);
		txtResponsable.setColumns(10);
		
		separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 1;
		gbc_separator_4.gridy = 7;
		pnlProyecto.add(separator_4, gbc_separator_4);
		
		lblDescripcin = new JLabel("Descripción: ");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 8;
		pnlProyecto.add(lblDescripcin, gbc_lblDescripcin);
		
		txaDescipcion = new JTextArea();
		txaDescipcion.setEnabled(false);
		GridBagConstraints gbc_txaDescipcion = new GridBagConstraints();
		gbc_txaDescipcion.gridheight = 3;
		gbc_txaDescipcion.gridwidth = 8;
		gbc_txaDescipcion.insets = new Insets(0, 0, 5, 5);
		gbc_txaDescipcion.fill = GridBagConstraints.BOTH;
		gbc_txaDescipcion.gridx = 2;
		gbc_txaDescipcion.gridy = 8;
		pnlProyecto.add(txaDescipcion, gbc_txaDescipcion);
		
		separator_10 = new JSeparator();
		GridBagConstraints gbc_separator_10 = new GridBagConstraints();
		gbc_separator_10.insets = new Insets(0, 0, 5, 5);
		gbc_separator_10.gridx = 0;
		gbc_separator_10.gridy = 9;
		pnlProyecto.add(separator_10, gbc_separator_10);
		
		separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 5, 5);
		gbc_separator_7.gridx = 2;
		gbc_separator_7.gridy = 11;
		pnlProyecto.add(separator_7, gbc_separator_7);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setEnabled(false);
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 7;
		gbc_btnEliminar.gridy = 12;
		pnlProyecto.add(btnEliminar, gbc_btnEliminar);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new BtnEditarActionListener());
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.setEnabled(false);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 8;
		gbc_btnEditar.gridy = 12;
		pnlProyecto.add(btnEditar, gbc_btnEditar);
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new BtnAñadirActionListener());
		btnAñadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAñadir.setEnabled(false);
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 9;
		gbc_btnAñadir.gridy = 12;
		pnlProyecto.add(btnAñadir, gbc_btnAñadir);
		
		separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.insets = new Insets(0, 0, 0, 5);
		gbc_separator_8.gridx = 1;
		gbc_separator_8.gridy = 13;
		pnlProyecto.add(separator_8, gbc_separator_8);

	}

	private class ModoVisualizarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			txtNombre.setEnabled(false);
			txtResponsable.setEnabled(false);
			txaDescipcion.setEnabled(false);
			dateChooser.setEnabled(false);
			listaMiembros.setEnabled(false);
			listaTareas.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnAñadir.setEnabled(false);
			btnEditar.setEnabled(false);
			btnAadirTarea.setEnabled(false);
			btnAadirTarea_1.setEnabled(false);
		}
	}
	private class ModoElimiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(false);
			txtResponsable.setEnabled(false);
			txaDescipcion.setEnabled(false);
			dateChooser.setEnabled(false);
			listaMiembros.setEnabled(false);
			listaTareas.setEnabled(false);
			btnEliminar.setEnabled(true);
			btnAñadir.setEnabled(false);
			btnEditar.setEnabled(false);
			btnAadirTarea.setEnabled(false);
			btnAadirTarea_1.setEnabled(false);
		}
	}
	private class ModoEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(true);
			txtResponsable.setEnabled(true);
			txaDescipcion.setEnabled(true);
			dateChooser.setEnabled(true);
			listaMiembros.setEnabled(true);
			listaTareas.setEnabled(true);
			btnEliminar.setEnabled(false);
			btnAñadir.setEnabled(false);
			btnEditar.setEnabled(true);
			btnAadirTarea.setEnabled(true);
			btnAadirTarea_1.setEnabled(true);
		}
	}
	private class ModoAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtNombre.setEnabled(true);
			txtResponsable.setEnabled(true);
			txaDescipcion.setEnabled(true);
			dateChooser.setEnabled(true);
			listaMiembros.setEnabled(true);
			listaTareas.setEnabled(true);
			btnEliminar.setEnabled(false);
			btnAñadir.setEnabled(true);
			btnEditar.setEnabled(false);
			btnAadirTarea.setEnabled(true);
			btnAadirTarea_1.setEnabled(true);
		}
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar el proyecto?", "Eliminar",
					dialogButton);
			if (dialogResult == 0) {
				//COGER ID
				ControlProyectos cp = new ControlProyectos();
				cp.eliminarProyecto(0001);
				JOptionPane.showMessageDialog(null, "Proyecto eliminado");
			} else {
				JOptionPane.showMessageDialog(null, "Eliminación cancelada");
			}
		}
	}
	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere editar el proyecto?", "Editar",
					dialogButton);
			if (dialogResult == 0) {
				//COGER ID
				Proyecto project = new Proyecto(0001, txtNombre.getText(), dateChooser.getDate(),
						Integer.parseInt(txtResponsable.getText()), txaDescipcion.getText());
				ControlProyectos cp = new ControlProyectos();
				cp.actualizarProyecto(project);
				JOptionPane.showMessageDialog(null, "Proyecto editado");
			} else {
				JOptionPane.showMessageDialog(null, "Edición cancelada");
			}
		}
	}
	private class BtnAñadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "¿Quiere guardar el nuevo proyecto?", "Añadir",
					dialogButton);
			if (dialogResult == 0) {
				Proyecto project = new Proyecto(txtNombre.getText(), dateChooser.getDate(),
						Integer.parseInt(txtResponsable.getText()), txaDescipcion.getText());
				ControlProyectos cp = new ControlProyectos();
				cp.añadirProyecto(project);
				JOptionPane.showMessageDialog(null, "Proyecto guardado");
			} else {
				JOptionPane.showMessageDialog(null, "Guardado cancelado");
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