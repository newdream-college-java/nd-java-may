/*
����һ��3λ����������λ�ϵ����ֱַ���뵽3�������У���̷ֱ𽫻�����ֵ�������
���磺
����123������abc����������ֵ�����abc��ֵΪ321
*/
import java.util.Scanner;
public class Test06{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);
	System.out.print("����һ����λ����");
	int a = in.nextInt();
	int b,c,d,e;
	b=a%10;
	c=a/10%10;
	d=a/100;
	e=b*100+c*10+d;
	System.out.print(e);
	}
}