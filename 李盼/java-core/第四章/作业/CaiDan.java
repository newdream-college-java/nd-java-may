/*
��¼�˵��л����˵�����
*/
import java.util.Scanner;
public class CaiDan{
	public static void main(String[] args){
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ\n\n\t\t\t1����¼ϵͳ\n\n\t\t\t2���˳�\n\n*******************************************************************************\n\n��ѡ���������֣�");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch(i){
			case 1:
				System.out.println("\t\t\t���˵�\n\n\t\t\t1���ͻ���Ϣ����\n\t\t\t2���������\n\t\t\t3���������\n\t\t\t4��ע��\n\n******************************************************************************");
				break;
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;
			default:
				System.out.println("�������");
				break;
		}
	}
}