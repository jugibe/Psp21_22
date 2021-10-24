package hilos;

public class HiloTarea extends Thread{
	int tareaHilo[];
	HiloTarea(int [] tarea) {
		this.tareaHilo=tarea;	
	}
	public void run() {
		realizar(tareaHilo);
		System.out.println("hilo "+getName()+ " terminado");
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