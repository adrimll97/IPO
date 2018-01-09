package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AyudaTareas extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrAyudaDelPanel;

	/**
	 * Create the panel.
	 */
	public AyudaTareas() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrAyudaDelPanel = new JTextArea();
		txtrAyudaDelPanel.setEditable(false);
		txtrAyudaDelPanel.setText("En este panel se muestra toda la información de la tarea seleccionada, como es el nombre, \r\nla fecha de creación, la fecha de finalización, el estado, la prioridad y una lista con los \r\nusuarios asociados a esa tarea con sus respectivos roles dentro de la tarea, y una descripción de\r\nla misma.\r\nPara añadir usuarios con sus roles se puede hacer con el botón  \"Añadir usuario\", y con un menú\r\npop-up que aparece al pulsar con el botón derecho sobre la lista, y también se pueden\r\nseleccionar y eliminar usuarios.\r\n\r\nEl panel tiene cuatro botones en la parte superior: Visualizar, Eliminar, Editar y Añadir\r\nEstos botones son para seleccionar el modo en el que está el panel.\r\nPor defecto, el panel está en modo \"Visualizar\", y solo muestra la información sin la posibilidad\r\nde hacer nada más.\r\n\r\nEn modo \"Eliminar\", se habilita el botón \"Eliminar\" de la parte inferior, permitiendo\r\neliminar la tarea.\r\n\r\nEn modo \"Editar\", se habilitan todos los campos de la tarea para poder ser modificados y se\r\nhabilita el botón \"Editar\" de la parte inferior para guardar las modificaciones.\r\n\r\nEn modo \"Añadir\". se habilitan todos los campos de la tarea para poder introducir la \r\ninformación de una nueva tarea y se habilita también el botón \"Añadir\" de la parte inferior para\r\nguardar la nueva tarea.\r\n\r\nAdemás, en los modos \"Editar\" y \"Añadir\" se habilitan los botones \"Ver Imágenes\" y \r\n\"Añadir Imagen\". El botón \"Añadir Imagen\" permite añadir una imagen y asociarla a esa tarea,\r\ny el botón \"Ver Imágenes\" te muestra un nuevo panel con una lista de todas las imágenes\r\nasociadas a esa tarea, pulsando sobre una imagen de la lista permite visualizarla y escribir sobre \r\nella, para guardar lo escrito sobre la imagen basta con pulsar el botón \"Guardar\". Al lado de\r\neste botón \"Guardar\", está el botón \"Añadir\", el cual te permite seleccionar una imagen, \r\nasociarla a la tarea y visualizarla y editarla.");
		scrollPane.setViewportView(txtrAyudaDelPanel);

	}

}

