import java.util.Random;
import java.util.Scanner;
public class To7{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
		Random rd=new Random();   //随机产生一个整数
		int number=rd.nextInt(10);
		System.out.println(number);
		int memberNumber = rd.nextInt(9000)+1000;  //随机产生一个四位数的会员号
		System.out.println("随机会员号为："+memberNumber);	
		int a=memberNumber/100%10;
		System.out.println("百位数为:"+a);
		if(a==number){
			System.out.println(memberNumber+"号客户是幸运用户，获精美MP3一个。");
		}else{
			System.out.println(memberNumber+"号客户，谢谢你的支持！");
		}
}

}