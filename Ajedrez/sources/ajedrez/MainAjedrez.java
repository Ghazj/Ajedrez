package ajedrez;
import java.util.ArrayList;
public class MainAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pieza P1 = new Pieza("Reina",9,"Blanca",false);
	Tablero tab = new Tablero();
		
	tab.crearTablero();
	
	tab.getCasilla(0, 0).Reemplazar(P1);
	//System.out.println(tab.getCasilla(0, 0));
		tab.mostrarTablero();
		
		
	}
	//Sincronización GIT
	}


