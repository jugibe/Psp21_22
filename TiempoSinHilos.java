package hilos;

public class TiempoSinHilos {

	public static void main(String[] args) {
		//Determino el tiempo de inicio
		long inicio = System.currentTimeMillis();
		//Defino las tareas a realizar
		int tarea1[]= {12,3,5,6};
		int tarea2[]= {2,45,12,11,3};
		int tarea3[]= {17,21,4,5};
		int tarea4[]= {25,9,33,1};
		//Mando realizar las tareas
		realizar(tarea1);
		realizar(tarea2);
		realizar(tarea3);
		realizar(tarea4);
		//Determino el tiempo final y lo muestro por pantalla
		long fin = System.currentTimeMillis();
		double tiempo = ((double)fin - inicio)/1000;
		System.out.println("El tiempo transcurrido es "+ tiempo + " segundos");
	}
	static void realizar(int [] tarea) {
		for (int i=1; i<tarea.length;i++) { 
			try {
				Thread.sleep(tarea[i]*5);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}}
		
	}

}
