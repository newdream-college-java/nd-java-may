import java.util.Scanner;

public class Test04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请存入整数a：");
		int a=input.nextInt();
		System.out.print("请存入整数b：");
		int b=input.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+","+"b="+b);
	}
}