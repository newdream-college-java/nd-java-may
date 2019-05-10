import java.util.Scanner;
public class To7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.println("输入T恤数量:");
		int a=input.nextInt();

		System.out.println("输入网球鞋数量:");
		int b=input.nextInt();

		System.out.println("输入网球拍数量:");
		int c=input.nextInt();

		System.out.println("输入折扣(小数):");
		double d=input.nextDouble();

		System.out.println("输入实际支付的费用:");
		int e=input.nextInt();

		int g=245*a;   //T恤
		int h=570*b;   //网球鞋
	 	int j=320*c;   //网球拍
		double z=(g+h+j)*d;//三样物品的总金额
		double q=e-z;  //找钱
		int f = (int)z/100*3;
		System.out.println("******************消费单********************");
		System.out.println("购买单品\t单价\t\t个数\t\t金额");
		System.out.println("T恤\t\t￥245\t\t"+a+"\t\t"+g+"\n网球鞋\t\t￥570\t\t"+b+"\t\t"+h);
		System.out.println("网球拍\t\t￥320\t\t"+c+"\t\t"+j);
		System.out.println("折扣:\t\t"+d+"\n消费总金额"+"\t￥"+z+"\n实际交费"+"\t￥"+e+"\n找钱\t\t"+"￥"+q+"\n本次购物所得积分"+f);		



	}
}