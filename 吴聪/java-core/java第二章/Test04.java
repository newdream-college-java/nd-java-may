/*
�����������������뵽���������У���̽�a��b�е�ֵ�����������
*/
import java.util.Scanner;
public class Test04{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�������һ��������");
		int a = in.nextInt();
		System.out.print("������ڶ���������");
		int b = in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+"\t"+b);
	}
}