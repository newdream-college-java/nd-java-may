/*
ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�
����������������ԭ���У�**�������ʵ��
*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���������ʲô��");
		String a = in.next();
		while(a.equals("��������")){
			System.out.println("���������ʲô��");
			a = in.next();
		} 
		System.out.print("�������ԭ���У�"+a);
	}
}