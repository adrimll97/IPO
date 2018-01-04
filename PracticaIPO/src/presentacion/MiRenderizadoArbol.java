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
		int n = nodo.getLevel();
		switch (c) {
		case "Inicio":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/inicio.png")));
			break;
		case "Proyectos":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/folder-with-documents.png")));
			break;
		case "Usuarios":
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/multiple-users-silhouette.png")));
			break;
		}
		if(n == 2 && nodo.getParent().toString() == "Proyectos") {
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/invoice.png")));
		} else if(n == 2 && nodo.getParent().toString() == "Usuarios") {
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/professional-profile-with-image.png")));
		} else if(n == 3 && nodo.getParent().getParent().toString() == "Proyectos") {
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/tasks.png")));
		} else if(n == 4 && nodo.getParent().getParent().getParent().toString() == "Proyectos") {
			setIcon(new ImageIcon(MiRenderizadoArbol.class.getResource("/presentacion/picture.png")));
		}
		return this;
	}
}