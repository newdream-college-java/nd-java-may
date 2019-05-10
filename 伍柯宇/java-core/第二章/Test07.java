import java.util.Scanner;

public class Test07 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小数：");
		double num = sc.nextDouble();
		double b=num;
		int a = (int)num;
		double c;
		c=b-a;
		System.out.println("整数部分="+a+","+"小数部分="+c);
	}
}