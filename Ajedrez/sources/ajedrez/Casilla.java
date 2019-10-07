package ajedrez;

import java.util.ArrayList;

public abstract class Casilla {
//Atributos
	private String color;
	private boolean ocupada;
	private final ArrayList<Pieza> pieza = new ArrayList<>();
	private char letra;
	private int numero;
	
	//constructores
	
	public Casilla() {
		
	}

	public Casilla(String color, boolean ocupada, char letra, int numero) {

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
		this.pieza.add(pieza);
		
	}
	
	public void desocupar() {
		ocupada = false;
		this.pieza.remove(0);
	}
	
}
