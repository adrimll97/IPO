package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InformacionAutores extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrngelSnchezGonz;

	/**
	 * Create the panel.
	 */
	public InformacionAutores() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrngelSnchezGonz = new JTextArea();
		txtrngelSnchezGonz.setEditable(false);
		txtrngelSnchezGonz.setText("Práctica realizada por los alumnos:\r\n- Ángel Sánchez González\r\n- Adrián Muñoz Llano\r\n");
		scrollPane.setViewportView(txtrngelSnchezGonz);

	}

}
