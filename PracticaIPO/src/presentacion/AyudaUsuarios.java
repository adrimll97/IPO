package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AyudaUsuarios extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrAyudaDelPanel;

	/**
	 * Create the panel.
	 */
	public AyudaUsuarios() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrAyudaDelPanel = new JTextArea();
		txtrAyudaDelPanel.setEditable(false);
		txtrAyudaDelPanel.setText("En este panel muestra la información del usuario seleccionado, y además muestra una lista \r\ncon los proyectos y otra con las tareas a los que está asociado, estos datos solo se pueden \r\nvisualizar, no editar.\r\n\r\nTambién se da la posibilidad de enviar mensajes a ese usuario, para ello solo hay que escribir\r\nel mensaje en el area de texto inferior y darle a enviar mensaje.");
		scrollPane.setViewportView(txtrAyudaDelPanel);

	}

}
