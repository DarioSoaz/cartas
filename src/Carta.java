
public class Carta {

	private String palo;
	private String nombre;
	private int valor;
	
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Carta(String palo2, String nombre, int valornum) {
		this.palo = palo2;
		this.nombre = nombre;
		this.valor = valornum;
	}
	
	@Override
	public String toString() {
		return valor + "de" +palo; 
	}
	
	
	
}
