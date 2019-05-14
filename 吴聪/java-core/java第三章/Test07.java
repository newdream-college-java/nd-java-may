/*
幸运用户，会员ID百位数字为随机产生的数字即为幸运用户
*/
import java.util.Scanner;
import java.util.Random;
public class Test07{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入您的会员号：");
		int a = in.nextInt();
		Random in1 = new Random();
        int b = in1.nextInt(10);
		int c;
		if((c=a/100%10)==b){
			System.out.print(a+"号客户，是幸运用户"+b+"，获得精美礼品一份!");
		}else{
			System.out.print(a+"号用户，今天的幸运数字是"+b+",谢谢您的支持！");
		}
	}
}