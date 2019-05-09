/*
实现a，b变量值交换
*/
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入a=");
		int a=input.nextInt();
		System.out.print("请输入b=");
		int b=input.nextInt();
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}