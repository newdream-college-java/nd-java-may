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
			goods = "茶叶";
		}
		if(rad == 2){
			price = 150;
			goods = "茶杯";
		}
		if(rad == 3){
			price = 300;
			goods = "自行车";
		}
		if(rad == 4){
			price = 5200;
			goods = "电脑";
		}
		if(rad == 5){
			price = 4600;
			goods = "手机";
		}
		System.out.println("请猜测"+"“"+goods+"”"+"的价格：");
	}
	public void guess(){
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		initial();
		int a = input.nextInt();
		for (int i = 0; i < 10; i++) {
			if(a < price){
				System.out.println("再大点！");
			}else if(a > price){
				System.out.println("再小点！");
			}else{
				System.out.println("恭喜你答对了！");
				flag = true;
				break;
			}
			System.out.println("请再猜一次：");
			a = input.nextInt();
		}
		if(!flag){
			System.out.println("10次内没有猜中，下次努力吧！");
		}
	}
}
