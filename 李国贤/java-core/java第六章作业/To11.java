/*
���û���¼��֤����֤������� 3 ��
*/
import java.util.Scanner;
public class To11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i = 1;i<4;i++){
			System.out.print("�������û���:");
			String name = input.next();
			System.out.print("����������:");
			int num = input.nextInt();
			if(name.equals("jim")&&num==123456){
				System.out.println("��ӭ��½MyShoppingϵͳ��");
				break;					
			}
			else{
				System.out.println("�������������"+(3-i)+"�λ���");
			}
		}
	}
}