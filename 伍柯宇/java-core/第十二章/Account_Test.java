import java.util.*;
public class Account_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Account acc = new Account();
		
		while(true){
			System.out.println("1�����   2��ȡ��    0���˳�");
			System.out.print("��ѡ����Ҫ�����ҵ��");
			int x=input.nextInt();
			if(x!=0){
				switch(x){
				case 1:
					System.out.print("��������Ҫ����Ľ�");
					int a=input.nextInt();
					acc.addmoney(a);
					break;
				case 2:
					System.out.print("��������Ҫȡ���Ľ�");
					int b=input.nextInt();
					acc.deletemoney(b);
					break;
				
				}
			}else{
				System.out.print("***�˳�***\n");
				System.exit(-1);
			}
		}
		
	}

}
