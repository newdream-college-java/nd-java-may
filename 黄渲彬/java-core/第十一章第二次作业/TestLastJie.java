import java.util.Scanner;


public class TestLastJie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			LastJie lj = new LastJie();
			System.out.println("���������һ������:");
			int a = sc.nextInt();
			System.out.println(lj.jiechen(a));

	}

}
