import java.util.Scanner;


public class TestLastJie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			LastJie lj = new LastJie();
			System.out.println("请随机输入一个整数:");
			int a = sc.nextInt();
			System.out.println(lj.jiechen(a));

	}

}
