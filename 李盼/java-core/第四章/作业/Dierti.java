/*
������������� ��switch�ṹ
*/
import java.util.Scanner;
public class Dierti{
	public static void main(String[] args){
		System.out.println("���������Σ�");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch(i){
			case 1:
				System.out.println("�μ���ʡ����ѧ��֯��1��������Ӫ");
				break;
			case 2:
				System.out.println("�������ձʼǱ�����һ��");
				break;
			case 3:
				System.out.println("�����ƶ�Ӳ��һ��");
				break;
			default:
				System.out.println("û���κν���");
				break;
		}
	}
}