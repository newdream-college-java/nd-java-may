import java.util.Scanner;
public class To1{
	public static void main(String[] args){
		//Scanner input=new Scanner(System.in);
		System.out.println("\t\t\t��ӭʹ���������ع������ϵͳ\n\t\t\t\t1.��¼ϵͳ\n\t\t\t\t2.�˳�\n\t*************************************************************");
		Scanner input=new	Scanner(System.in);
		System.out.println("����������:");
		int a=input.nextInt();
		switch(a){
		case 1:		
			System.out.println("\t\t\t���˵�\n\n\t\t1���ͻ���Ϣ����\n\n\t\t2���������\n\n\t\t3���������\n\n\t\t4��ע��");
		break;
		case 2:
			System.out.println("лл����ʹ��!");
		break;
		default:
			System.out.println("��������");
		}	
}
}