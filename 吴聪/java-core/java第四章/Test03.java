/*
�������
*/
import java.util.Scanner;
public class Test03{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���������Σ�");
		String a = in.next();
		switch(a){
			case "��һ��":
			System.out.print("��ʡ����ѧ��֯��һ��������Ӫ");
			break;
			case "�ڶ���":
			System.out.print("���ձʼǱ�����һ̨");
			break;
			case "������":
			System.out.print("�ƶ�Ӳ��һ��");
			break;
			default:
			System.out.print("�޽���");
		}
	}
}