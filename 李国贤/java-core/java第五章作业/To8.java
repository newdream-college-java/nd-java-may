/*
循环输入商品编号，显示对应的商品价格，输入“n”结束循环;
当输入 n 时结账，结账时假设享受八折优惠，计算应付金额并找零
*/
import java.util.Scanner;
public class To8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("***********************************************************\n请选择购买的商品编号：\n1、T恤\t2、网球鞋\t3、网球拍\n***********************************************************\n\n");
		String m="y";
		int sum=0,s;
		do{
			System.out.println("请输入商品编号：");
			int i = input.nextInt();
			System.out.println("请输入购买数量：");
			int a = input.nextInt();
			if(i==1){
				s = 245*a;
				sum = sum +s;
				System.out.println("T恤￥245\t数量"+a+"\t合计"+"￥"+s);  
			}
			else if(i==2){
				s = 570*a;
				sum = sum +s;
				System.out.println("网球鞋￥570\t数量"+a+"\t合计"+"￥"+s);
			}
			else if(i==3){
				s = 390*a;
				sum = sum +s;
				System.out.println("网球拍￥390\t数量"+a+"\t合计"+"￥"+s);
			}
			else{
					System.out.println("输入错误！");
			}
			System.out.println("是否继续(y/n)：");
			m = input.next();
		}while(m.equals("y"));
		System.out.println("请输入实付金额：");
		int b= input.nextInt();
		System.out.println("折扣：0.8\n应付金额："+(sum*0.8)+"\n实付金额："+b+"\n找钱："+(b-sum*0.8));
	}
}