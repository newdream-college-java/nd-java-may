/*
ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�
����������������ԭ���У�**�������ʵ��
*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		System.out.println("������ֽ�ʲô��");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		while(name.equals("��������")){
			System.out.println("������ֽ�ʲô");
			name = input.next();
		} 
		System.out.println("ԭ��������ֽ�"+name);
	}
}