/*
����һ����ݣ��ж����ǲ�������
*/
import java.util.Scanner;
public class Rn{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if((num%4==0)&&(num%100!=0))
			System.out.println("������");
		else if(num%400==0)
			System.out.println("������");
		else
			System.out.println("��������");
	}

}