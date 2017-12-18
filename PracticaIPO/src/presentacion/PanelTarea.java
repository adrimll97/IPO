package presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PanelTarea extends JPanel {
	private JLabel lblMiPanelTarea;

	/**
	 * Create the panel.
	 */
	public PanelTarea() {
		
		lblMiPanelTarea = new JLabel("Mi panel Tarea");
		add(lblMiPanelTarea);

	}

}
