
import java.util.ArrayList;

public class Francesa extends Baraja {

	String[] palo=new String[] {"picas","tréboles","diamantes","corazones"};
	String[] nombre=new String[] {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	
	Francesa() {
		
		reiniciar();
		
	}


	public void reiniciar() {
		
	//borramos las carta
		cartas.clear();	
		
			
	//creo la baraja
		int valor;
		for(int i=0;i<=palo.length;i++) {
			for(int j=0; j<=nombre.length;j++) {
				if (j>9) { valor=10;	}
				else {valor=j+1;	}
				cartas.add(new Carta(palo[i],nombre[j],valor));
			}
		}
	}
}
	
	
	
	
	
	

