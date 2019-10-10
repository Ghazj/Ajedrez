package ajedrez;

import java.util.Arrays;

// Par = negras Impar = blancas (casillas) (Índice de la matríz)
public class Tablero {

	private final Casilla tablero[][] = new Casilla[8][8];

	public Tablero() {
		
	}
	
	public Casilla getCasilla(int i,int j) {
		return tablero[i][j];
	}
	
	public void crearTablero() {
		
		int numAux = 0;
		char letraAux = 'a';
		
		for (int i = 0;i<tablero.length;i++) {
			
			switch (i) {
			case 0:
				letraAux = 'a';
					break;
			case 1:
				letraAux = 'b';
					break;
			case 2:
				letraAux = 'c';
					break;
			case 3:
				letraAux = 'd';
					break;
			case 4:
				letraAux = 'e';
					break;
			case 5:
				letraAux = 'f';
					break;
			case 6:
				letraAux = 'g';
					break;
			case 7:
				letraAux = 'h';
					break;		
			}
			
			for (int j = 0;j<tablero[i].length;j++) {
				
				switch (j) {
				case 0:
					numAux = 1;
						break;
				case 1:
					numAux= 2;
						break;
				case 2:
					numAux = 3;
						break;
				case 3:
					numAux = 4;
						break;
				case 4:
					numAux = 5;
						break;
				case 5:
					numAux = 6;
						break;
				case 6:
					numAux = 7;
						break;
				case 7:
					numAux = 8;
						break;		
				}
				
				if((i+j)%2==0) {
					tablero[i][j] = new CasillaNegra("Negra",false,letraAux,numAux);
				}else {
					tablero[i][j] = new CasillaBlanca("Blanca",false,letraAux,numAux);
				}
			}
		}
		
		}
		
	public void iniciarPiezasBlancas() {
		//Towers
		tablero[0][0].ocupar(new Torre());
		tablero[7][0]
		
	}
	
	public void iniciarPiezasNegras() {
		
	}
	
	public void mostrarTablero() {
		int contador = 0;
for (int i = 0;i<tablero.length;i++) {
			
			for (int j = 0;j<tablero[i].length;j++) {
				
				System.out.print(tablero[i][j]);
				contador = contador + i + j;
			}
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Tablero [tablero=" + Arrays.toString(tablero) + "]";
	}
	
	////Sincronización GIT
	
	
	
	
	
	
	
}
