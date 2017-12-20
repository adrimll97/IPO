package dominio;
//Poner en el arbol un pop-pup de boton derecho de raton en el que te deje añadir proyectos y tareas
public class Proyecto {
	
	private int idProyecto;
	private String nombre;
	private String fechaCrecion;
	private int responsable;
	private String descripcion;
	
	public Proyecto(int idProyecto, String nombre, String fechaCreacion, int responsable, String descripcion) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.fechaCrecion = fechaCreacion; 
		this.responsable = responsable;
		this.descripcion = descripcion;
	}
	
	public int getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaCrecion() {
		return fechaCrecion;
	}
	public void setFechaCrecion(String fechaCrecion) {
		this.fechaCrecion = fechaCrecion;
	}
	public int getResponsable() {
		return responsable;
	}
	public void setResponsable(int responsable) {
		this.responsable = responsable;
	}
	public String getDesripcion() {
		return descripcion;
	}
	public void setDesripcion(String desripcion) {
		this.descripcion = desripcion;
	}
	
	@Override
	public String toString() {
		return nombre+": "+descripcion;
	}
}
