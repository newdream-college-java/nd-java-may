/*计算折扣购物小票，每消费100元获得3分*/

import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入T恤数量");
		int shuliang1 = input.nextInt();
		System.out.println("请输入网球鞋数量");
		int shuliang2= input.nextInt();
		System.out.println("请输入网球拍数量");
		int shuliang3 = input.nextInt();
		System.out.println("请输入折扣(小于1的小数)");
		double zhekou = input.nextDouble();
		System.out.println("请输入实际支付费用");
		int jiaofei = input.nextInt();
		int jine1=245*shuliang1,
		     jine2=570*shuliang2,
		     jine3=320*shuliang3;
		double zongjine=(jine1+jine2+jine3)*zhekou,
		             zhaoqian=jiaofei-zongjine;
		int jifen = (int)zongjine/100*3;
		System.out.println("******************消费单********************\n购买单品\t单价\t个数\t金额\nT恤\t$245\t"+shuliang1+"\t"+jine1+"\n网球拍\t$570\t"+shuliang2+"\t"+jine2+"\n网球鞋\t$320\t"+shuliang3+"\t"+jine3+"\n\n\n\n折扣："+zhekou+"\n消费总金额：$"+zongjine+"\n实际交易：$"+jiaofei+"\n找钱：$"+zhaoqian+"\n本次购物所获得的积分是"+jifen);
		
	}
}