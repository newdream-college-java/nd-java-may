import java.util.Scanner;
public class To8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入会员号:");//四位数的整数
		int a=input.nextInt();
		System.out.println("请输入会员生日:");//月/日表示
		String b=input.next();
		System.out.println("请输入积分:");
		int c=input.nextInt();
		if(a>=1000&&a<=9999){	
			System.out.println(a+"\t"+b+"\t"+c);
		}else{
			System.out.println("输入的会员号不合法");
		}
	}

}