import java.util.Scanner;

public class EX117 {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();		
		for(int i=1; i<=num; i++){
			String otro = s.next();
			String nombre = s.next();
			System.out.println("Hola, " +nombre+ ".");
        }
        s.close();
	}
}