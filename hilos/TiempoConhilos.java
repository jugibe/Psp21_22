package hilos;

public class TiempoConhilos {
	public static void main(String[] args) {
		//Determino el tiempo de inicio
		long inicio = System.currentTimeMillis();
		//Defino las tareas a realizar
		int tarea1[]= {12,3,5,6};
		int tarea2[]= {2,45,12,11,3};
		int tarea3[]= {17,21,4,5};
		int tarea4[]= {25,9,33,1};
		//Creo los hilos y les mando las tareas.
		HiloTarea h1=new HiloTarea(tarea1);
		HiloTarea h2=new HiloTarea(tarea2);
		HiloTarea h3=new HiloTarea(tarea3);
		HiloTarea h4=new HiloTarea(tarea4);
		h1.start();h2.start();h3.start();h4.start();
		
		try {
			h1.join();h2.join();h3.join();h4.join();
		} catch (InterruptedException e) {
			System.out.println("interruptedException");
			e.printStackTrace();
		}
		//Determino el tiempo final y lo muestro por pantalla
		long fin = System.currentTimeMillis();
		double tiempo = ((double)fin - inicio)/1000;
		System.out.println("hilo "+ Thread.currentThread().getName()+ " terminado");
		System.out.println("El tiempo transcurrido es "+ tiempo + " segundos");
	}
	
}
