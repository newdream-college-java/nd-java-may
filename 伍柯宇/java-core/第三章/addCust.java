import java.util.Scanner;

public class addCust{
	public static void main(String[] args){
		System.out.println("我行我素购物管理系统 > 客户信息管理 > 添加客户信息\n\n");
		Scanner input=new Scanner(System.in);
		System.out.print("请输入会员号（<四位整数>）：");
		int a=input.nextInt();
		if(a/1000>0&&a/10000==0){
			System.out.println(a+"是一个四位整数！！");
		}else{
			System.out.println(a+"不是一个四位整数！！");
		}
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		String b=input.next();
		System.out.print("请输入积分：");
		int c=input.nextInt();
		System.out.println("已录入的会员信息是："+a+"\t"+b+"\t"+c);
	}	
}