
public class AplicacionHilo3 {

	public static void main(String[] args) {
		
		Hilo3 h1=new Hilo3();
		h1.setName("pepe");
		h1.setPriority(1);
		
		Hilo3 h2=new Hilo3();
		h2.setName("luis");
		h2.setPriority(5);
		
		Hilo3 h3=new Hilo3();
		h3.setName("ana");
		h3.setPriority(5);
		
		h1.start();
		h2.start();
		h3.start();
		for (int i=1; i<=100;i++) {
			System.out.println("El hilo "+ Thread.currentThread().toString() + " " + i);
			System.out.println("Hilos activos"+ Thread.activeCount());
			
			
		}

	}

}
