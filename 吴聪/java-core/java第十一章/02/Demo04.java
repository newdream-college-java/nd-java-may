package day2;
//Calculator
import java.util.Scanner;
public class Demo04 {
	int num1;
	int num2;
	public int add(){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		num1 = in.nextInt();
		System.out.println("请输入第二个数：");
		num2 = in.nextInt();
		return num1+num2;
	}
	public int minus(){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		num1 = in.nextInt();
		System.out.println("请输入第二个数：");
		num2 = in.nextInt();
		return num1-num2;
	}
	public int multiple(){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		num1 = in.nextInt();
		System.out.print("请输入第二个数：");
		num2 = in.nextInt();
		return num1*num2;
	}
	public double divide(){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		num1 = in.nextInt();
		System.out.println("请输入第二个数：");
		num2 = in.nextInt();
		return num1*1.0/num2;
	}
}