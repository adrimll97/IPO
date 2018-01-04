package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VerImagenes extends JPanel {
	private JList list;
	private JButton btnGuardar;
	private JButton btnAadir;
	static VerImagenes frame = new VerImagenes();
	private ImageIcon imagen;
	private JScrollPane scrollPane;
	private MiAreaDibujo lblAreaDibujo;
	private JTextField txtTexto = new JTextField();
	
	/**
	 * Create the panel.
	 */
	public VerImagenes() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{156, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 4;
		gbc_list.insets = new Insets(0, 0, 5, 0);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		add(list, gbc_list);
		
		btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new BtnAadirActionListener());
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		lblAreaDibujo = new MiAreaDibujo();
		lblAreaDibujo.addMouseListener(new LblAreaDibujoMouseListener());
		scrollPane.setViewportView(lblAreaDibujo);
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 0, 5);
		gbc_btnAadir.gridx = 2;
		gbc_btnAadir.gridy = 3;
		add(btnAadir, gbc_btnAadir);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridx = 3;
		gbc_btnGuardar.gridy = 3;
		add(btnGuardar, gbc_btnGuardar);

	}

	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				imagen = new ImageIcon(file.getAbsolutePath());
				lblAreaDibujo.setIcon(imagen);
			}
		}
	}
	private class LblAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			if (imagen != null) {
				txtTexto.setBounds(x, y, 200, 30);
				txtTexto.setVisible(true);
				txtTexto.requestFocus();
				txtTexto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg) {
						if (!txtTexto.getText().equals(""))
							lblAreaDibujo.addObjetoGrafico(new TextoGrafico(x, y + 15, txtTexto.getText(), Color.BLUE));
						txtTexto.setText("");
						txtTexto.setVisible(false);
						lblAreaDibujo.repaint();
					}
				});
				lblAreaDibujo.add(txtTexto);
			}
		}
	}
}