package day2;
import java.util.Scanner;
public class Demo07 {
	String name;
	int member;
	int Class;
	String sex;
	int age;
	String address;
	public void sayHello(){
		Scanner in = new Scanner(System.in);
		System.out.print("������ѧ��������");
		name=in.next();
		System.out.print("������ѧ��ѧ�ţ�");
		member=in.nextInt();
		System.out.print("������ѧ���༶��");
		Class=in.nextInt();
		System.out.print("������ѧ���Ա�");
		sex=in.next();
		System.out.print("������ѧ�����䣺");
		age=in.nextInt();
		System.out.print("������ѧ����ͥ��ַ��");
		address=in.next();
	}
}
