package presentacion;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class AyudaPrincipal extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrAyudaDeLa;

	/**
	 * Create the panel.
	 */
	public AyudaPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrAyudaDeLa = new JTextArea();
		txtrAyudaDeLa.setEditable(false);
		txtrAyudaDeLa.setText("Esta es la ventana principal de la aplicación donde se encuentra la información del usuario\r\nque ha iniciado sesión y los proyectos, tareas y demás usuarios.\r\n\r\nEn la parte superior se muestra información del usuario que ha iniciado sesión, como es \r\nel nombre, apellidos, la fecha último acceso y su foto de usuario, así como un botón de ayuda \r\ny un botón para cerrar sesión y volver a la ventana de autentificación.\r\n\r\nEn la parte izquierda se muestran todos los proyectos con sus tareas y las imágenes asociadas \r\na esas tareas y también los usuarios que tiene la aplicación. \r\nPulsando sobre algún proyecto, tarea, imagen o usuario se muestra información sobre ello.");
		scrollPane.setViewportView(txtrAyudaDeLa);

	}

}