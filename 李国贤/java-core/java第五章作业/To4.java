/*
ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�
����������������ԭ���У�**�������ʵ�֡�
*/
import java.util.Scanner;
public class To4{	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String name=input.next();
		do{
			System.out.println("������ֽ�ʲô?");
			name = input.next();
		}while(name.equals("��������"));
			System.out.println("�������ԭ����:"+name);
	}
}