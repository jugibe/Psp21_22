import java.util.Scanner;

public class TicTac {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		
		System.out.println("¿Cuantas veces quieres que se repita?");
		int num=t.nextInt();
		
		Tic h1=new Tic(num);
		Tac h2=new Tac(num);
		h1.start();
		h2.start();

	}

}
