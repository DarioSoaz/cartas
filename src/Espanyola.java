
public class Espanyola extends Baraja {
	
	String[] palo=new String[] {"espadas","bastos","oross","copas"};
	String[] nombre=new String[] {"1","2","3","4","5","6","7","Sota","Caballo","Rey"};
	

 Espanyola() {
		
		reiniciar();
		
	}

	
	public void reiniciar() {
				 
		//borro las carta
		cartas.clear();
				
		//creo la baraja
		int valor;		
		for(int i=0;i<=palo.length;i++) {
			for(int j=0; j<=nombre.length;j++) {
				if (j>6) {  valor=10; }
				else { valor=j+1; }
				cartas.add (new Carta(palo[i],nombre[j],valor));
				}
			}
	}
}
