import java.util.Scanner;

public class Test03{
	public static void main(String[] args){
		int x=123456,y=555555;//��һ�ڶ�������
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ�����룺");
		int one=input.nextInt();
		if(one==x){
			System.out.print("������ڶ������룺");
			int two=input.nextInt();
			if(two==y){
				System.out.println("��ϲ�õ�Ǯ��");
			}else{
				System.out.println("��2���������");
			}
		}else{
			System.out.println("��1���������");
		}

	}
		

}