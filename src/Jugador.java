import java.util.ArrayList;

public class Jugador {
	
	public static ArrayList<Carta> cartas;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Jugador( String nombre) {
		cartas = new ArrayList<Carta>();
		this.nombre = nombre;
	}
	
	public static void darCarta(Carta carta) {
		
		cartas.add(carta);
	}
	
	public Carta retirarCarta(int indice) {
		  
		return (cartas.remove(indice));
	}
	
	public String juego() {
		
		String CartasJugador = "";
		
		for(int i=0; i<=cartas.size();i++) {
		CartasJugador+=cartas.get(i);		
		}
		return "["+CartasJugador+"]";
	
	}

}
