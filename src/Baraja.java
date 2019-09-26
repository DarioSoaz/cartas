

import java.util.ArrayList;

import java.util.Collections;

public abstract class Baraja {

	protected ArrayList<Carta> cartas=new ArrayList<Carta>();
	
	
	/*public Baraja(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}*/

	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	
	public void repartir() {
		//ArrayList<Carta> barajaNueva=new ArrayList<Carta>();
		Carta nuevaCarta = cartas.get(0);
		Jugador.darCarta(nuevaCarta);
				
		cartas.remove(0);
		
	}
	
	public abstract void reiniciar();

	
	
}
