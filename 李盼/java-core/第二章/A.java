/*
ʵ��a��b����ֵ����
*/
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������a=");
		int a=input.nextInt();
		System.out.print("������b=");
		int b=input.nextInt();
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}