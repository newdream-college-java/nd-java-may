/*
����һ����λ�����ж��ǲ��ǽ�����
*/
import java.util.Scanner;
public class Jx{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(),a,b,c;
		a = num/100;      //��λ
		b = num/10%10;      //ʮλ
		c = num%10;      //��λ
		if((a>b)&&(b>c))
		{
			System.out.println("����һ��������");
		}
		else
		{
			System.out.println("�ⲻ��һ��������");
		}
	}

}