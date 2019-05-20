/*
循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败
*/
import java.util.Scanner;
public class To10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("请输入4位数字的会员号:");
			int a=input.nextInt();
			System.out.println("请输入会员生日:");
			int b=input.nextInt();
			System.out.println("请输入会员积分:");
			int c=input.nextInt();
			if(a/1000<1||a/10000>=1){
				System.out.print("您输入的会员号有误！\n\n");
			}else{
				System.out.println("您输入的会员信息是:\n"+a+"\t"+b+"\t"+c+"\n\n");

			}

		}
	}
}