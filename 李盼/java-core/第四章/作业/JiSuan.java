/*
迷你计算器 + - * /
*/
import java.util.Scanner;
public class JiSuan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double a = input.nextDouble();
		System.out.println("请输入运算符号：");
		String b =input.next();
		System.out.println("请输入第二个数：");
		double c = input.nextDouble();
		double d;
		switch(b){
			case "+":
				d = a+c;
				System.out.println(d);
				break;
			case "-":
				d = a-c;
				System.out.println(d);
				break;
			case "*":
				d = a*c;
				System.out.println(d);
				break;
			case "/":
				d = a/c;
				System.out.println(d);
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}
}