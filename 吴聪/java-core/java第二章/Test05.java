/*
����һ��������������N��Сʱ������n��Сʱ���ڶ���������ٸ�Сʱ
�磺����25 ��ô���1����1��Сʱ
*/
import java.util.Scanner;
public class Test05{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("����һ��������");
		int a = in.nextInt();
		int b,c;
		b=a/24;
		c=a%24;
		System.out.println(b+"��"+c+"Сʱ");	
	}
}