
public class Tac extends Thread{
	
	int n;
	public Tac(int num) {
		this.n=num;
	}
	
	public void run() {
		for(int i=1;i<=n;i++){ 
			System.out.println("tac");
			try {
				sleep(100);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			
		}
	}
}
