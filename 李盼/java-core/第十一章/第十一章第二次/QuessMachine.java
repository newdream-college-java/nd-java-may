import java.util.Random;
import java.util.Scanner;


public class QuessMachine {
	int price = 0;
	String goods = "";
	public void initial(){
		Random random = new Random();
		int rad = random.nextInt(5)+1;
		if(rad == 1){
			price = 100;
			goods = "��Ҷ";
		}
		if(rad == 2){
			price = 150;
			goods = "�豭";
		}
		if(rad == 3){
			price = 300;
			goods = "���г�";
		}
		if(rad == 4){
			price = 5200;
			goods = "����";
		}
		if(rad == 5){
			price = 4600;
			goods = "�ֻ�";
		}
		System.out.println("��²�"+"��"+goods+"��"+"�ļ۸�");
	}
	public void guess(){
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		initial();
		int a = input.nextInt();
		for (int i = 0; i < 10; i++) {
			if(a < price){
				System.out.println("�ٴ�㣡");
			}else if(a > price){
				System.out.println("��С�㣡");
			}else{
				System.out.println("��ϲ�����ˣ�");
				flag = true;
				break;
			}
			System.out.println("���ٲ�һ�Σ�");
			a = input.nextInt();
		}
		if(!flag){
			System.out.println("10����û�в��У��´�Ŭ���ɣ�");
		}
	}
}
