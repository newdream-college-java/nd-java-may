import java.util.Scanner;

public class Test01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请存入小数a：");
		double a=input.nextDouble();
		System.out.print("请存入小数b：");
		double b=input.nextDouble();
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+","+"b="+b);
	}
}