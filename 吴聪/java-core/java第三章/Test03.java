/*
���չ��������룬�ֱ�������ȷ���ܴ򿪣���һ�δ����޷�����ڶ������룻���벻����6λ
*/
import java.util.Scanner;
public class Test03{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���������룺");
		int a = in.nextInt();
		int b=123456,c=654321;
		if ( a==b ) {
			System.out.print("������ڶ������룺");
			int d = in.nextInt();
			if ( d==c ){
				System.out.print("��ϲ�õ�Ǯ�ˣ���");
				}else {
				System.out.print("��2���������");
				}
			}else {
			System.out.println("��1���������");
		}
	}
}