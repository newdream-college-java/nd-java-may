import java.util.Scanner;

public class Test07 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��С����");
		double num = sc.nextDouble();
		double b=num;
		int a = (int)num;
		double c;
		c=b-a;
		System.out.println("��������="+a+","+"С������="+c);
	}
}