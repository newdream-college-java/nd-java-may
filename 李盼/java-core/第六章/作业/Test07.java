/*
ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do{
			System.out.print("���������0������������0��������");
			num = input.nextInt();
			sum += num;
		}while(num!=0);
		System.out.println(sum);
	}
}