/*
�������������������������������ȣ���ô���������������ȡ�
				�������ж���������֮���Ƿ����1000��
				�������1000�������������֮�ʹ���1000��
				�����������������֮�Ͳ�����1000��
*/
import java.util.Scanner;
public class Test05{
	public static void main (String [] args ){
		Scanner in = new Scanner(System.in);
		System.out.print("����������������");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if(a==b&&a==c){
			System.out.print("�����������!");
		}else if(a+b+c>1000) {
			System.out.print("��������֮�ʹ���1000!");
		}else{
			System.out.print("��������֮�Ͳ�����1000!");
		}
	}
}