/*
����һ����λ�����ж��Ƿ�Ϊ������������
321Ϊ����������λ>ʮλ>��λ
*/
import java.util.Scanner;
public class Test01{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("������һ����λ������");
		int a = in.nextInt();
		int b,c,d;	//b��λ��cʮλ��d��λ
		b=a%10;
		c=a/10%10;
		d=a/100;
		if( b<c&&c<d ){
			System.out.println(a+"��һ��������");
		}else{
			System.out.println(a+"����һ��������");
		}
	}
}