/*
���ڣ�
���룺1 ���������һ ...��������� �������
*/
import java.util.Scanner;
public class Test04{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���������֣�");
		int a = in.nextInt();
		switch(a){
			case 1:
			System.out.print("����һ");
			break;
			case 2:
			System.out.print("���ڶ�");
			break;
			case 3:
			System.out.print("������");
			break;
			case 4:
			System.out.print("������");
			break;
			case 5:
			System.out.print("������");
			break;
			case 6:
			System.out.print("������");
			break;
			case 7:
			System.out.print("������");
			break;
			default:
			System.out.print("�������");
		}
	}
}