/*
ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
���������� 0 ��������������ʯͷ����
���������� 1 �������������Ǽ�������
���������� 2 �������������ǲ�����
������������ͽ�������
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("������һ�� 0 �� 2 ֮���������");
		int a = in.nextInt();
		while(a==0||a==1||a==2){
//		if(a>=0&&a<=2){
			if(a==0){
				System.out.println("�������ʯͷ!");
				System.out.print("��������룺");
			}
			if(a==1){
				System.out.println("������Ǽ���!");
				System.out.print("��������룺");
			}
			if(a==2){
				System.out.println("������ǲ�!");
				System.out.print("��������룺");
			}
			a = in.nextInt();
//		}else{
//			System.out.print("����������������룡");
//		}
		}
	}
}