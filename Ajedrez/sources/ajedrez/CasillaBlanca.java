package ajedrez;

public class CasillaBlanca extends Casilla {

	public CasillaBlanca() {
		
	}

	public CasillaBlanca(String color, boolean ocupada, char letra, int numero) {
    super(color,ocupada,letra,numero);
    pieza.add(new Fantasma());
		this.color = color;
		this.ocupada = ocupada;
		this.letra = letra;
		this.numero = numero;
		
	}
	
}
