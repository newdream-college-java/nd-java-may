/*
����������
*/
import java.util.Scanner;
public class Mm{
	public static void main(String[] args){
		Scanner input = new  Scanner(System.in);
		System.out.print("�������һ�����룺");
		int mm1 = input.nextInt();
		if(mm1==654321)
		{
			System.out.print("������ڶ������룺");
			int mm2 = input.nextInt();
			if(mm2==123456)
				System.out.println("��ϲ�õ�Ǯ�ˣ�");
			else
				System.out.println("�ڶ����������");}
		else
			System.out.println("��һ���������");			
				
		
		
	}

}