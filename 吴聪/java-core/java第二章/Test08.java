/*
����ս�⣩���һ��С����Ȼ����������������ֺ�С�����֣���ʽ���£�
С��	��������	С������
3.14	3			0.14
*/
import java.util.Scanner;
public class Test08{
	public static void main	(String	[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("������һ��С����");
		double a = in.nextDouble();	//float
		int b = (new Double(a)).intValue();	
		double c =a-b;		
	//	c = ((int)(c)*100)/100.0f;
	//	System.out.println(String.format("%.2f", c));
		System.out.println("С��\t\t��������\tС������");
	//	System.out.println(String.format(a+"\t\t"+b+"\t\t"+"%.2f", c));
		System.out.println(a+"\t"+b+"\t\t"+c);
	}
}