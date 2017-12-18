package presentacion;

import java.awt.Component;
import javax.swing.tree.TreeCellRenderer;
import java.awt.Component;
import javax.swing.*;
import javax.swing.tree.*;

class MiRenderizadoArbol extends DefaultTreeCellRenderer {
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
		String c = (String) (nodo.getUserObject());
		switch (c) {
		case "Inicio":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/inicio.png")));
			break;
		}
		return this;
	}
}