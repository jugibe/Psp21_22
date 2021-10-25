import java.util.ArrayList;

public class Hilo4 extends Thread{

	ArrayList<String> list  ;
	
	Hilo4(ArrayList<String> l){
		this.list=l;
	}
	public void run() {
		for (int i=1;i<=10;i++) {
			
			list.add(Thread.currentThread().toString()+ " escribe "+ i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}	
	
	
}
