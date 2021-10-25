import java.util.ArrayList;

public class Aplicacionhilo4 {

	public static void main(String[] args) {
		ArrayList<String> miLista=new ArrayList();
		
		
		Hilo4 h1= new Hilo4(miLista);
		h1.setName("pepe");
		Hilo4 h2= new Hilo4(miLista);
		h2.setName("ana");
		h1.start();
		h2.start();
		
		while (h1.isAlive()||h2.isAlive()) {}//Espera a que acaben los hilos
		System.out.println(miLista);
	}

}
