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
		System.out.println("������0-2֮���������");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		while(i==0||i==1||i==2){
			switch(i){
				case 1: System.out.println("�������ʯͷ");break;
				case 2: System.out.println("������Ǽ���");break;
				case 3: System.out.println("������ǲ�");break;
			
			}
			System.out.println("������0-2֮���������");
			i = input.nextInt();
		}
	}
}