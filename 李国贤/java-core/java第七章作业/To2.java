/*
ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ"Esc"�ͽ���ѭ���������ʾ��������������ַ���������:����abe  ����def  ����Esc          �����abedef
*/
import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������ַ���:");
		String a=input.next();
		 String b="";
		while(!a.equals("Esc")){
			System.out.println("�������ַ���:");
			b=b+a;
			a=input.next();
		}
			System.out.println(b);
	}
}