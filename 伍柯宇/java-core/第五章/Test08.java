/*
ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
���������� 0 ��������������ʯͷ����
���������� 1 �������������Ǽ�������
���������� 2 �������������ǲ�����
������������ͽ�������
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		 while (true) {
       			System.out.println("����һ��0��2֮�������:");
       			int num= input.nextInt();
       			switch (num) {
           				case 0:
               					System.out.println("�������ʯͷ");
               					break;
           				case 1:
               					System.out.println("������Ǽ���");
               					break;
           				case 2:
               					System.out.println("������ǲ�");
               					break;
           				default:
               					System.out.println("���棺ֻ������012");
               					break;

       			}
		}
	}
}