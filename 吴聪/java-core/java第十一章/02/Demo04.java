package day2;
//Calculator
import java.util.Scanner;
public class Demo04 {
	int num1;
	int num2;
	public int add(){
		Scanner in = new Scanner(System.in);
		System.out.println("�������һ������");
		num1 = in.nextInt();
		System.out.println("������ڶ�������");
		num2 = in.nextInt();
		return num1+num2;
	}
	public int minus(){
		Scanner in = new Scanner(System.in);
		System.out.println("�������һ������");
		num1 = in.nextInt();
		System.out.println("������ڶ�������");
		num2 = in.nextInt();
		return num1-num2;
	}
	public int multiple(){
		Scanner in = new Scanner(System.in);
		System.out.print("�������һ������");
		num1 = in.nextInt();
		System.out.print("������ڶ�������");
		num2 = in.nextInt();
		return num1*num2;
	}
	public double divide(){
		Scanner in = new Scanner(System.in);
		System.out.println("�������һ������");
		num1 = in.nextInt();
		System.out.println("������ڶ�������");
		num2 = in.nextInt();
		return num1*1.0/num2;
	}
}