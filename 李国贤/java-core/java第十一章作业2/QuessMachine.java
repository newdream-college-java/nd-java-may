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
			showping="电视机";
		}
		if (num==2) {
			price=5300;
			showping="电脑";
		}
		if (num==3) {
			price=4500;
			showping="手机";
		}
		if (num==4) {
			price=2000;
			showping="自行车";
		}
		if (num==5) {
			price=3500;
			showping="洗衣机";
		}
		System.out.println("请竞猜"+showping+"的价格");
		guess();
	}
	public void guess(){
		int i=0;
		for (; i< 10; i++) {
			Scanner input=new Scanner(System.in);
			int a=input.nextInt();
			if(a<price){
				System.out.println("再大点");
			}
			if (a>price) {
				System.out.println("再小点");
			}
			if (a==price) {
				System.out.println("恭喜你，猜中了");
			}
		}
		if(i==10){
			System.out.println("十次没有竞猜正确，请继续努力");
		}
	}
}
