/*
输入两个整数，存入到两个变量中，编程将a与b中的值交换，输出。
*/
import java.util.Scanner;
public class Test04{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int a = in.nextInt();
		System.out.print("请输入第二个整数：");
		int b = in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+"\t"+b);
	}
}