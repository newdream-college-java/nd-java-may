/*
��������� + - * /
*/
import java.util.Scanner;
public class JiSuan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		double a = input.nextDouble();
		System.out.println("������������ţ�");
		String b =input.next();
		System.out.println("������ڶ�������");
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
				System.out.println("�������");
				break;
		}
	}
}