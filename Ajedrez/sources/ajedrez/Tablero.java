package ajedrez;
// Par = negras Impar = blancas (casillas) (Índice de la matríz)
public class Tablero {

	private final Casilla tablero[][] = new Casilla[8][8];

	public Tablero() {
		
	}
	
	public void iniciarTablero() {
		
		for (int i = 0;i<tablero.length;i++) {
			
			for (int j = 0;j<tablero[i].length;j++) {
				
				if((i+j)%2==0) {
					tablero[i][j] = new CasillaNegra();//hija de casilla(crear)
				}else {
					tablero[i][j] = new CasillaBlanca();//hija de casilla(crear)
				}
			}
		}
		
		}
		
	public String toString() {
		return "";
	
	}
	
	
	
	
	
	
	
	
	
}
