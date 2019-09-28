import java.util.Scanner;

public class TestMus {

	public static void main(String[] args) {
		
		Mus juegoMus = new Mus();
		
			
		Jugador[] JugadoresMus=new Jugador[3];
		String nombreJugador;
		
		for (int i=0;i<=JugadoresMus.length;i++) {
			do {
				Scanner nombre = new Scanner(System.in);
				System.out.println("Introduce el nombre del jugador: ");
				nombreJugador=nombre.nextLine(); 				
			}while(nombreJugador.equals(""));
			juegoMus.addjugador(new Jugador(nombreJugador));
		}
		
		
		
		
	}
}
	

