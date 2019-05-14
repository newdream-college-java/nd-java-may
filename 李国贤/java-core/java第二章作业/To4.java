import java.util.Scanner;
public class To4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("输入第一位整数a");
		int a=input.nextInt();
		
		System.out.println("输入第二位整数b");
		int b=input.nextInt();
		int c;
		c=b;
		b=a;
		a=c;
		
		System.out.println("a="+a+","+"b="+b);
	}
}