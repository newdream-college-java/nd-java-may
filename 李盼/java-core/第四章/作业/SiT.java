/*
�����������������ж��Ƿ���ȣ���������ж��Ƿ����1000
*/
import java.util.Scanner;
public class SiT{
	public static void main(String[] args){
		System.out.println("����������������");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c  = input.nextInt();
		if(a==b&&b==c){
			System.out.println("�����������");
		}
		else{
			if(a+b+c>1000)
				System.out.println("��������֮�ʹ���1000");
			else
				System.out.println("��������֮�Ͳ�����1000");
		}
	}
}