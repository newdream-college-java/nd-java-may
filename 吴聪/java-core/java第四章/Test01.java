/*
ʹ��switchѡ��ṹʵ�ִӵ�¼�˵��л������˵���
*/
import java.util.Scanner;
public class Test01{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
//��½�˵���һ��
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ\n\t\t\t1.��½ϵͳ\n\t\t\t2.�˳�\n\t**********************************************");
		System.out.print("��ѡ���������֣�");
		int a = in.nextInt();
		switch(a){
			case 1:
				System.out.println("\t\t�������ع������ϵͳ���˵�\n\t\t\t1.�ͻ���Ϣ����\n\t\t\t2.��������\n\t\t\t3.�������\n\t\t\t4.ע��");
			break;
			case 2:
				System.out.println("лл����ʹ��!");
			break;
			default:
			System.out.print("�������!!");
		}
	}
}