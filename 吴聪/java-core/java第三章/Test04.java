/*
������㰮���𣿡����ش�Yes������������ǰ��ҵġ�
				  �ش�No���������ԭ���㲻���ҡ�
				  �ش������������������㵽���ǰ����ǲ������Լ��������
*/
import java.util.Scanner;
public class Test04{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�㰮���𣿻ش���yes,����no:");
		String a = in.next();
		if("yes".equals(a)){
			System.out.print("���ǰ��ҵ�!");
		}else if ("no".equals(a)){
			System.out.print("ԭ���㲻����!");
		}else{
			System.out.print("�㵽���ǰ����ǲ������Լ������!");
		}
/*		System.out.print("�������ź��Ա�:");
		String a = in.next();
		if("��".equals(a)){
			System.out.print("�ź�������");
		}else if ("Ů".equals(a)){
			System.out.print("�ź���Ů��");
		}else{
			System.out.print("�ź�������");
		}*/
	}
}