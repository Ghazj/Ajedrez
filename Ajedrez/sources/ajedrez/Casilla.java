package ajedrez;
//Sincronización GIT
import java.util.ArrayList;

public abstract class Casilla {
//Atributos
	protected String color;
	protected boolean ocupada;
	protected char letra;
	protected int numero;
	protected final ArrayList<Pieza> pieza = new ArrayList<>();
//constructores
	
	public Casilla() {
		pieza.add(new Fantasma());
	}

	public Casilla(String color, boolean ocupada,char letra,int numero) {
		pieza.add(new Fantasma());
		this.color = color;
		this.ocupada = ocupada;
		this.letra = letra;
		this.numero = numero;
	}
//getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void ocupar(Pieza pieza) {
		ocupada = true;
		this.pieza.set(0,pieza);
		
	}
	
	public void desocupar() {
		ocupada = false;
		this.pieza.set(0,new Fantasma());
	}
	
	public void Reemplazar(Pieza pieza) {
		ocupada = true;
		this.pieza.set(0,pieza);
	}
	
	public String toString() {
		
		return "Letra: " + letra + "\n" +
			   "Número: " + numero + "\n" +
			   "Color: " + color + "\n" +
			   "Ocupada: " + ocupada + "\n" +    
			   "Pieza: " + pieza.get(0).getNombre() + " " +
			   pieza.get(0).getColor() +
			   "(" + pieza.get(0).getValor() + ")(" + 
			   pieza.get(0).isEstado() + ")\n" ;
	}

	
	
}
