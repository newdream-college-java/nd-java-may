/*
�������ң���3�����²��ͣ�3-5����һ���ң�5�����Ͼ���������
*/
import java.util.Scanner;
public class Diyiti{
	public static void main(String[] args){
		//��ʾ
		System.out.println("�����������������");	
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch(i){
			case 0:
			case 1:
			case 2:
				System.out.println(i+"����");
				break;
			case 3:
			case 4:
			case  5:
				System.out.println(i+1+"����");
				break;
			default:
				System.out.println(i+2+"����");
				break;
		}
	}
}