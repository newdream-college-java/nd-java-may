/*
������λ�������λʮλ��λǧλ
*/
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),b,c,d,e;
		//���λ
		b = a%10;
		//��ʮλ
		c = a/10%10;
		//���λ
		d = a/100%10;
		//��ǧλ
		e = a/1000;
		System.out.println("��λ��"+b+"\nʮλ��"+c+"\n��λ��"+d+"\nǧλ��"+e);
	}

}