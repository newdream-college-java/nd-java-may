/*
������Ѽ�¼
*/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] money = new double[5];
		double sum = 0;
		System.out.println("�����뱾�»�Ա�����Ѽ�¼��");
		//���빺������
		for(int i = 0;i<5;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			money[i] = input.nextDouble();
			sum += money[i];
		}
		System.out.println("���\t��Ԫ��");
		//������
		for(int i = 0;i<5;i++){
			System.out.println(i+1+"\t"+money[i]);
		}
		System.out.println("�ܽ��\t"+sum);
	}
}