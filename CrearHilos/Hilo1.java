public class Hilo1 extends Thread{
	//Debo implementar el procedimiento run.
	//Se ejecutara cada vez que cree el hilo
	//y lo lance con hilo.start()
	
	public void run() {
		
		for (int c=1; c<=100;c++) {
			System.out.println("En el hilo ");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}	
	}
	
	//procedimiento main
	public static void main(String args []) {
		//Creo el hilo
		Hilo1 h1=new Hilo1();
		//Ejecuto el mçetodo run()
		h1.start();
		for (int c=1; c<=100;c++) {
			System.out.println("Fuera del hilo ");	
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}		
}


