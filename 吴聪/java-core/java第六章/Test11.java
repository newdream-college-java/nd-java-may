/*
�û���¼��֤����֤������� 3 ��
*/
import java.util.Scanner;
public class Test11{
	public static void main(String[] args ){
		Scanner in = new Scanner(System.in);
		String name;
		int num = 123456,b;
		for(int i=1;i<=3;i++){
			System.out.print("�������û�����");
			name = in.next();
			System.out.print("���������룺");
			b = in.nextInt();
			if(b==123456){
				System.out.print("��ӭ��½MyShoppingϵͳ!");
				break;
			}else if((3-i)>=1){
				System.out.println("�㻹ʣ"+(3-i)+"�λ���!");
			}else if((3-i)==0){
			System.out.println("����������󣡵�½ʧ��!!!");
			}
		}
	}
}