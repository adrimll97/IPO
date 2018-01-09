package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AyudaAutentificacion extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrAyudaDeLa;

	/**
	 * Create the panel.
	 */
	public AyudaAutentificacion() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrAyudaDeLa = new JTextArea();
		txtrAyudaDeLa.setEditable(false);
		txtrAyudaDeLa.setText("En esta ventana es desde la que iniciamos sesión, además de poder seleccionar el idioma de\r\nla aplicación y acceder al formulario de registro.\r\n\r\nSi al escribir el usuario se escribe mal, se pondrá el cuadro de texto de color rojo,\r\ncuando se escribe bien el usuario, se pone de color verde y se habilita el cuadro de texto de la\r\ncontraseña, la cual, al igual que antes, si se escribe mal se pone el cuadro de texto de color rojo\r\ny si se pone bien se pone de color verde y además se habilita el botón de inicio de sesión.\r\nAdemás, el cuadro de texto de la contraseña tiene a la derecha un icono de un ojo que\r\npulsándolo te muestra el texto escrito.\r\n\r\nPor defecto el idioma de la aplicación es español, pero se puede cambiar a inglés.\r\n\r\nSe puede acceder al formulario de registro pulsando sobre el enlace que hay en la parte \r\ninferior de la ventana.");
		scrollPane.setViewportView(txtrAyudaDeLa);

	}
}