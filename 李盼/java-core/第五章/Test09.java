/*
����ϵͳ���˵�����ʾ�û��������֣�����ѡ�������Ӧģ��
�û����������Ҫ���ظ����룬ֱ��������ȷ��ִ����Ӧ���ܺ��˳�ѭ��
*/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ\n\n***********************************************************\n\t1���ͻ���Ϣ����\n\t2���������\n\t3���������\n\t4��ע��\n*************************************************************\n��ѡ���������֣�");
		int i = input.nextInt();
		while(i>4||i<1){
			System.out.println("����������������룺");
			i = input.nextInt();
		}
		switch(i){
			case 1:
				System.out.println("ִ�пͻ���Ϣ����");
				break;
			case 2:
				System.out.println("ִ�й������");
				break;
			case 3:
				System.out.println("ִ���������");
				break;
			case 4:
				System.out.println("ִ��ע��");
				break;
		}
	}
}