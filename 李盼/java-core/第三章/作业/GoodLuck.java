/*
会员抽奖：百位数字等于幸运数字的获奖
*/
import java.util.Scanner;
import java.util.Random;                     //产生随机数的包
public class GoodLuck{
	public static void main(String[] args){
		Random random = new Random();
		int ran = random.nextInt(10);		//产生从0-9随机个数字
		System.out.println("请输入4位会员号：");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt(),j = i/100%10;
		if(j==ran){
			System.out.println("幸运数字是"+ran+"，"+i+"号客户是幸运客户，获得精美MP3一个。");
		}
		else{
			System.out.println("幸运数字是"+ran+"，"+i+"号客户，谢谢您的支持！");
		}
		
	}
}