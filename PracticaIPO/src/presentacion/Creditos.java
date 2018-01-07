package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Creditos extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrCrditosDeLos;

	/**
	 * Create the panel.
	 */
	public Creditos() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrCrditosDeLos = new JTextArea();
		txtrCrditosDeLos.setEditable(false);
		txtrCrditosDeLos.setText("All icons made by Freepik from www.flaticon.com \r\n\r\n");
		scrollPane.setViewportView(txtrCrditosDeLos);

	}

}
