/*
����һ����λ��������Ҫ���̽���λ���ĸ�λ��ʮλ����λ��ǧλ�ֱ����
*/
import java.util.Scanner;
public class Test03{
	public static void main (String [] args){
		System.out.print("����һ����λ������");
		Scanner in = new Scanner(System.in); 
		int a = in.nextInt();
		int g,s,b,q;
		g=a%10;
		s=a/10%10;
		b=a/100%10;
		q=a/1000;
		System.out.println("��λ��"+g+"\nʮλ��"+s+"\n��λ��"+b+"\nǧλ��"+q);
	}
}