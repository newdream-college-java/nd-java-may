import java.util.Scanner;
public class To5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入第一个整数a 代表小时");
		int a=input.nextInt();
		int b=a/24;
		int c=a%24;
		System.out.println("天数"+b+","+"剩余小时"+c);

	}
}