/*
��������� ֧��+ - * /
*/
import java.util.Scanner;
public class Test07{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		String b = in.next();
		double c = in.nextDouble();
/*		switch(b){
			case "+"��//���� ð��������
			System.out.print(a+c);
			break;
			case "-":
			System.out.print(a-c);
			break;
			case "*":
			System.out.print(a*c);
			break;
			case "/":
			System.out.print(a/c);
		} */
		switch(b){
			case "+":
			System.out.print(a+c);
			break;
			case "-":
			System.out.print(a-c);
			break;
			case "*":
			System.out.print(a*c);
			break;
			case "/":
			System.out.print(a/c);
		}
	}
}