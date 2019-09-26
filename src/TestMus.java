import java.util.Scanner;

public class TestMus {

	public static void main(String[] args) {
		
		Mus juego = new Mus();
		
				
		Jugador[] JugadoresMus=new Jugador[3];
		String nombreJugador;
		
		for (int i=0;i<=3;i++) {
			do {
				Scanner nombre = new Scanner(System.in);
				System.out.println("Introduce el nombre del jugador: ");
				nombreJugador=nombre.nextLine(); 
				JugadoresMus[i]=new Jugador(nombreJugador);
				juego.addjugador(JugadoresMus[i]);
			}while(nombreJugador.equals(""));
		}
	}
}
	

