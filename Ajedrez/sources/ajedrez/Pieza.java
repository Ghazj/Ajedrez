package ajedrez;
//Sincronización GIT
public class Pieza {

	protected String nombre;
	protected String ubicacion;
	protected int valor;
	protected String color;
	protected boolean estado;
	
	public Pieza() {
		
	}
	
	public Pieza(String nombre, int valor, String color, boolean estado) {
		
		this.nombre = nombre;
		this.valor = valor;
		this.color = color;
		this.estado = estado;
		
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void moverse() {
		
	}
	
	
	
	
	
	
	
	
}
