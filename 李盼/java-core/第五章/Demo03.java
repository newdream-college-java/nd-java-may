/*
ѭ������5��������Ȼ����ͣ������5�������ĺ�
*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���������������");
		int i = 0,sum=0;
		while(i<5){
			int j = input.nextInt();
			sum = j+sum;
			i++;
		}
		System.out.println("��Ϊ"+sum);
	}
}