/*
ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ��
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("������һ������");
		double a = in.nextDouble();
		double b=0;
		while(a!=0){
			b+=a;
			a = in.nextDouble();
		}
		System.out.print(b);
	}
}