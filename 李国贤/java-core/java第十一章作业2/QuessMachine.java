import java.util.Random;
import java.util.Scanner;


public class QuessMachine {
	int price=0;
	String showping= "";
	public void com(){
		Random rd=new Random();
		int num=rd.nextInt(5)+1;
		if(num==1){
			price=5000;
			showping="���ӻ�";
		}
		if (num==2) {
			price=5300;
			showping="����";
		}
		if (num==3) {
			price=4500;
			showping="�ֻ�";
		}
		if (num==4) {
			price=2000;
			showping="���г�";
		}
		if (num==5) {
			price=3500;
			showping="ϴ�»�";
		}
		System.out.println("�뾺��"+showping+"�ļ۸�");
		guess();
	}
	public void guess(){
		int i=0;
		for (; i< 10; i++) {
			Scanner input=new Scanner(System.in);
			int a=input.nextInt();
			if(a<price){
				System.out.println("�ٴ��");
			}
			if (a>price) {
				System.out.println("��С��");
			}
			if (a==price) {
				System.out.println("��ϲ�㣬������");
			}
		}
		if(i==10){
			System.out.println("ʮ��û�о�����ȷ�������Ŭ��");
		}
	}
}
