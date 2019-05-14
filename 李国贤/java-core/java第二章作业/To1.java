import java.util.Scanner;
public class To1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入第一位小数a");
		double a=input.nextDouble();
		System.out.println("输入第一位小数b");
		double b=input.nextDouble();
		double c;
		c=b;
		b=a;
		a=c;
		System.out.println("a="+a+"\t"+"b="+b);

	}
}