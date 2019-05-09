/*
写一个Pay，需求结算时用户支付1500元，打印购物小票，计算此次购物获得的会员积分（每消费100元获得3分）
*/
import java.util.Scanner;
public class Test07{
	public static void main	(String	[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入T恤单价：");
		double a = in.nextDouble();		 //输入T恤单价
		System.out.print("请输入购买数量：");
		double b = in.nextDouble();
	//	int c = a*b;
	//	int c = (new Double(a)).intValue();
		double d = a*b;					//T恤总价
	//	System.out.print(d);
		System.out.print("请输入网球鞋单价：");
		double e = in.nextDouble();		 //输入网球鞋单价
		System.out.print("请输入购买数量：");
		double f = in.nextDouble();
		double g = e*f;	 				//网球鞋总价
		System.out.print("请输入网球拍单价：");
		double h = in.nextDouble();		 //输入网球拍单价
		System.out.print("请输入购买数量：");
		double i = in.nextDouble();
		double j = h*i;					 //网球拍总价
		double s = d+g+j;				//消费总金额
		System.out.print("请输入抽中折扣：");
		double z = in.nextDouble(); 	//输入折扣
		System.out.print("已付款：");
		double money = in.nextDouble(); //实际交费
		double	back = money-s*z;
	//	System.out.print(back);
		int k = (new Double(s)).intValue();
		int jf = k/100*3;
	//以下为打印购物小票
		System.out.println("***************消费单***************");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("网球鞋\t\t"+e+"\t"+f+"\t"+g);
		System.out.println("网球拍\t\t"+h+"\t"+i+"\t"+j+"\n");
		System.out.println("折扣：\t\t"+z+"折");
		System.out.println("消费总金额：\t"+s);
		System.out.println("实际交费：\t"+money);
		System.out.println("找钱：\t\t"+back);
		System.out.println("本次购物所获得的积分是："+jf);
	}
}