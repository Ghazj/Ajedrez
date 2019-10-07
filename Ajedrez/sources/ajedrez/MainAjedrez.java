package ajedrez;

public class MainAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tablero tab1 = new Tablero();
		
		String[][] tablero = new String[8][8];
		
for (int i = 0;i<tablero.length;i++) {
			
			for (int j = 0;j<tablero[i].length;j++) {
				
				if((i+j)%2==0) {
					tablero[i][j] = "Negra";
				}else {
					tablero[i][j] = "Blanca";
				}
			}
		}
		
for (int i = 0;i<tablero.length;i++) {
	
	for (int j = 0;j<tablero[i].length;j++) {
		
		System.out.print(tablero[i][j] + i+","+j+"|");
		
		}
	System.out.println("");
		}
	
}
	//Sincronización GIT?
	}


