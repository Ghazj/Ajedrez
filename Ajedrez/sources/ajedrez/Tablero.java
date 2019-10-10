package ajedrez;

import java.util.Arrays;

// Par = negras Impar = blancas (casillas) (Índice de la matríz)
public class Tablero {

	public final Casilla tablero[][] = new Casilla[8][8];

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
	
	public void IniciarPiezas() {
		iniciarPiezasBlancas();
		iniciarPiezasNegras();
	}
		
	public void iniciarPiezasBlancas() {
		//Towers
		tablero[0][0].ocupar(new Torre("Blanca"));
		tablero[7][0].ocupar(new Torre("Blanca"));
		//Horses
		tablero[1][0].ocupar(new Caballo("Blanco"));
		tablero[6][0].ocupar(new Caballo("Blanco"));
		//Alfiles
		tablero[2][0].ocupar(new Alfil("Blanco"));
		tablero[5][0].ocupar(new Alfil("Blanco"));
		//Queen
		tablero[4][0].ocupar(new Reina("Blanca"));
		//King
		tablero[3][0].ocupar(new Rey("Blanco"));
		//Peones
		for (int i = 0;i<tablero.length;i++) {
			
			tablero[i][1].ocupar(new Peon("Blanco"));
			
		}
	}
	
	public void iniciarPiezasNegras() {
		//Towers
		tablero[0][7].ocupar(new Torre("Negra"));
		tablero[7][7].ocupar(new Torre("Negra"));
		//Horses
		tablero[1][7].ocupar(new Caballo("Negro"));
		tablero[6][7].ocupar(new Caballo("Negro"));
		//Alfiles
		tablero[2][7].ocupar(new Alfil("Negro"));
		tablero[5][7].ocupar(new Alfil("Negro"));
		//Queen
		tablero[3][7].ocupar(new Reina("Negra"));
		//King
		tablero[4][7].ocupar(new Rey("Negro"));
		//Peones
		for (int i = 0;i<tablero.length;i++) {
			
			tablero[i][6].ocupar(new Peon("Negro"));
			
		}
	}
	
	public void mostrarTablero() {
		System.out.println(tablero.length);
for (int i = 0;i<tablero.length;i++) {
			
			for (int j = 0;j<tablero[i].length;j++) {
				
				System.out.print(tablero[j][i]);
			}
			System.out.println("");
		}
	}
	
	public void mostrarLindo() {
		
		System.out.println(tablero.length);
		for (int i = 0;i<tablero.length;i++) {
					
					for (int j = 0;j<tablero[i].length;j++) {
						
						System.out.print(tablero[j][i].getPieza().getNombre() + "||");
						
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
