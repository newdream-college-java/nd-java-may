import java.util.Scanner;
public class To8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入一位小数a");
		double a=input.nextDouble();
		double b=a;
		int c=(int)a;
		double d;
		d=b-c;
		System.out.println("整数="+c+"小数="+d);
	}
}