import java.util.Scanner;
public class To8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����һλС��a");
		double a=input.nextDouble();
		double b=a;
		int c=(int)a;
		double d;
		d=b-c;
		System.out.println("����="+c+"С��="+d);
	}
}