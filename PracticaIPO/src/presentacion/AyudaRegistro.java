package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AyudaRegistro extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrAyudaDeLa;

	/**
	 * Create the panel.
	 */
	public AyudaRegistro() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrAyudaDeLa = new JTextArea();
		txtrAyudaDeLa.setEditable(false);
		txtrAyudaDeLa.setText("En esta ventana se pueden introducir todos los datos necesarios para crear un nuevo \r\nusuario en la aplicación así como una foto de usuario.\r\n\r\nSi la confirmación de email no es igual que el email se pondrá el cuadro de texto de la \r\nconfirmación de email de color rojo, cuando sea igual se podrá de color verde.\r\nIgual pasa para la confirmación de la contraseña.\r\n\r\nSi al darle al botón de aceptar falta algún campo por completar será indicado poniendo un\r\nsímbolo de warning al lado del cuadro de texto que falta por completar.\r\n");
		scrollPane.setViewportView(txtrAyudaDeLa);

	}

}
