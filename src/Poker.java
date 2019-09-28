import java.util.ArrayList;

public class Poker {
	
	protected Francesa Baraja=new Francesa();
	protected  ArrayList<Jugador> JugadoresPoker=new ArrayList<Jugador>();
	
	Poker(ArrayList<Jugador> JugadoresPoker) throws Exception{
		if(JugadoresPoker.size()<=2){
			throw new Exception("No pueden jugar 2 o menos jugadores!!");
		}
		else {  JugadoresPoker=new ArrayList<Jugador>(JugadoresPoker);
				Baraja=new Francesa();			
		}
	}
	
	void addJugador(Jugador j) {
		JugadoresPoker.add(j);
	}
	
}
 