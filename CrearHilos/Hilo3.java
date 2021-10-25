
public class Hilo3 extends Thread {
	/* M�todos de la clase thread
	 String getName(), Devuelve el nombre del hilo
	 long getID() Devuelve el identificador del hilo
	 int getPriority Devuelve la prioridad del hilo. 
	 Valor entre  1 y 10 A mayor prioridad m�s probabilidad de ejecuci�n
	 String toString() Devuelve una cadena con informaci�n del hilo
	 int activeCount() devuelve el n�mero de hilos activos
	 
	 */
		
		public void run(){
			
			System.out.println("Creando el hilo "+this.getName()+
					" , prioridad "+ this.getPriority()+ " , ID "+ this.getId());
			for (int i=1; i<=100;i++) {
				System.out.println("El hilo "+ Thread.currentThread().toString() + " " + i);
				
				
			}
			
		}

	

}
