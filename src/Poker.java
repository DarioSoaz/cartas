import java.util.ArrayList;

public class Poker {
	
	protected Francesa Baraja=new Francesa();
	protected  ArrayList<Jugador> JugadoresPoker=new ArrayList<Jugador>();
	
	Poker(ArrayList<Jugador> JugadoresPoker) throws Exception{
		if(JugadoresPoker.size()<3){
			throw new Exception("El minimo de jugadores es 2");
		}
		else {  JugadoresPoker=new ArrayList<Jugador>(JugadoresPoker);
				Baraja=new Francesa();			
		}
	}
	
	public void addJugador(Jugador j) {
		JugadoresPoker.add(j);
	}
	
}
 