import java.util.Scanner;


public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Account d1=new Account();
			
		Scanner input=new Scanner(System.in);
		for (int i = 1; i>0; i++) {
		System.out.println("1.��� \t2.ȡ��\t0.�˳�\n��ѡ������Ҫ�����ҵ��");
			int a=input.nextInt();
			if (a==1) {
				System.out.println("�������");
				d1.money=input.nextInt();
				d1.save(d1.money);
				continue;
			}else if (a==2) {
				System.out.println("�������");
				d1.money=input.nextInt();
				d1.with(d1.money);
				continue;
			}else if (a==0) {
				System.out.println("ллʹ�ã�");
				break;
			}
			System.out.println("��������ȷ������");
			
		}

	
	}

}
