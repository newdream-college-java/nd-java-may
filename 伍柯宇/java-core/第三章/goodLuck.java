import java.util.Random;
import java.util.Scanner;

public class goodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		Random rd=new Random();
		int b=rd.nextInt(10);
		System.out.println(b);
		System.out.println("我行我素购物管理系统 > 幸运抽奖\n");
		System.out.print("请输入4位会员号：");
		int num=input.nextInt();
		int a=num/100%10;
		if(a==b){
			System.out.println(num+"号客户是幸运客户，获得精美MP3一个！");
		}
		else{
			System.out.println(num+"号客户谢谢您的支持！");
		}
	}		
}