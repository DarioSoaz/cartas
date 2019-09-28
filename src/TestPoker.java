import java.util.ArrayList;
import java.util.Scanner;

public class TestPoker {
	
	public static void main(String[] args) throws Exception {
	ArrayList<Jugador> jugadoresPoker=new ArrayList<Jugador>();
	Poker juegoPoker;
	int numJug;
	String jugador;	
	Scanner info= new Scanner(System.in);
	Scanner info2= new Scanner(System.in);
	System.out.println("Introduce el numero de participantes: ");
	numJug=info.nextInt();
		
	for (int i=0;i<numJug;i++) {
		do {
			System.out.println("Introduce el nombre del jugador: ");
			jugador=info2.nextLine(); 		
		} while (jugador.equals(""));
		jugadoresPoker.add(new Jugador(jugador));
	}//juegoPoker=new Poker(jugadoresPoker);
	try {
		juegoPoker=new Poker(jugadoresPoker);
		} 
	catch(Exception e) {
		System.out.println(e);
	}
}
}
