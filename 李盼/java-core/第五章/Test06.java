/*
���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ���
*/
import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("0Ϊʯͷ��1Ϊ������2Ϊ�������������˳���\n�����룺");
		Random randow = new Random();
		int n = input.nextInt();              //nΪ�����ȭ
		while(n==0||n==1||n==2){
			int ran = randow.nextInt(3);
			switch(n){
				case 0:
					if(ran==0){
						System.out.println("ƽ��");
					}
					else if(ran==1){
						System.out.println("��Ӯ��");
					}
					else{
						System.out.println("������");
					}
					break;
				case 1:
					if(ran==1){
						System.out.println("ƽ��");
					}
					else if(ran==2){
						System.out.println("��Ӯ��");
					}
					else{
						System.out.println("������");
					}
					break;
				case 2:
					if(ran==2){
						System.out.println("ƽ��");
					}
					else if(ran==0){
						System.out.println("��Ӯ��");
					}
					else{
						System.out.println("������");
					}
					break;
			}
			System.out.println("\n\n\n0Ϊʯͷ��1Ϊ������2Ϊ�������������˳���\n�����룺");
			n = input.nextInt();
		}
		
	}
}