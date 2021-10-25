
public class Hilo2 extends Thread {
	//Le doy nombre al hilo en el constructor
	public Hilo2(String nombre) {
		super(nombre);
		//imprimo el nombre del hilo
		//getName() devuelve un string con el nombre del hilo
		System.out.println("Creando el hilo "+getName());
		
	}
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("En el hilo "+getName());
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	
	
	
	//procedimiento main
	public static void main(String args []) {
		//Creo dos hilos con nombres distintos
		Hilo2 h1=new Hilo2("pepe");
		Hilo2 h2=new Hilo2("luis");
		
		//Ejecuto el mçetodo run()
		h1.start();
		h2.start();
		System.out.println("En el hilo main  "+Thread.currentThread().getName());
			
	}		

}

