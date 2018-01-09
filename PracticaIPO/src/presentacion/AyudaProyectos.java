package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AyudaProyectos extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrAyudaDelPanel;

	/**
	 * Create the panel.
	 */
	public AyudaProyectos() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrAyudaDelPanel = new JTextArea();
		txtrAyudaDelPanel.setEditable(false);
		txtrAyudaDelPanel.setText("En este panel se muestra toda la información del proyecto seleccionado, como es el nombre, \r\nla fecha de creación, el responsable del proyecto, una lista con los miembros asociados al\r\nproyecto, una lista con las tareas del proyecto, y una descripción del mismo.\r\nLas tareas se pueden añadir con el botón \"Añadir tarea\", y con un menú pop-up que aparece al\r\npulsar con el botón derecho sobre la lista.\r\n\r\nEl panel tiene cuatro botones en la parte superior: Visualizar, Eliminar, Editar y Añadir\r\nEstos botones son para seleccionar el modo en el que está el panel.\r\nPor defecto, el panel está en modo \"Visualizar\", y solo muestra la información sin la posibilidad\r\nde hacer nada más.\r\n\r\nEn modo \"Eliminar\", se habilita el botón \"Eliminar\" de la parte inferior, permitiendo\r\neliminar el proyecto.\r\n\r\nEn modo \"Editar\", se habilitan todos los campos del proyecto para poder ser modificados y se\r\nhabilita el botón \"Editar\" de la parte inferior para guardar las modificaciones.\r\n\r\nEn modo \"Añadir\". se habilitan todos los campos del proyecto para poder introducir la \r\ninformación de un nuevo proyecto y se habilita también el botón \"Añadir\" de la parte \r\ninferior para guardar el nuevo proyecto.");
		scrollPane.setViewportView(txtrAyudaDelPanel);

	}

}
