import java.util.Random;
import java.util.Scanner;

public class rand {
	public int rd() {
		Random random = new Random();
		int rad = random.nextInt(10)+1;
		return rad;
	}
	public String name(){
		Scanner input = new Scanner(System.in);
		System.out.print("������������֣�");
		String a = input.next();
		return a;
	}
}
