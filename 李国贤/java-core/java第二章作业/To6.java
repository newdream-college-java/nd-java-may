import java.util.Scanner;
public class To6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入第一个三位数整数");
		int a=input.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		int g=b*100+c*10+d;
		
		System.out.println(g);


	}
}