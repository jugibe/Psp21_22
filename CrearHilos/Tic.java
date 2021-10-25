
public class Tic extends Thread{
	
	int n;
	
	public Tic(int num) {
		this.n=num;
	}
	
	public void run() {
		
		for(int i=1;i<=n;i++){ 
			System.out.println("tic");
			try {
				sleep(100);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}	

}
