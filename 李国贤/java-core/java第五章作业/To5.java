/*
ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
���������� 0 ��������������ʯͷ����
���������� 1 �������������Ǽ�������
���������� 2 �������������ǲ�����
������������ͽ�������
*/

import java.util.Scanner;
public class To5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������������:");
		int a=input.nextInt();
		switch(a){
			case 0:
				System.out.println("�������ʯͷ");
			break;
			case 1:
				System.out.println("������Ǽ���");
			break;
			case 2:
				System.out.println("������ǲ�");
			break;

		}
}
}