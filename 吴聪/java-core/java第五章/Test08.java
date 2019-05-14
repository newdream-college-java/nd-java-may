/*
循环输入商品编号，显示对应的商品价格，输入“n”结束循环
继续循环输入商品编号和购买数量,自动计算每种商品的价钱(单价*购买数量)，并
累加到总金额
当输入 n 时结账，结账时假设享受八折优惠，计算应付金额并找零
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("****************************************\n请选择购买的商品编号：\n1、T恤\t2、网球鞋\t3、网球拍\n****************************************\n\n");
		String a="y";
		int b=0,s;
		do{
			System.out.println("请输入商品编号：");
			int i = input.nextInt();
			System.out.println("请输入购买数量：");
			int j = input.nextInt();
			if(i==1){
				s = 100*j;
				b = b +s;
				System.out.println("T恤￥100\t数量"+j+"\t合计"+"￥"+s);  
			}
			else if(i==2){
				s = 200*j;
				b = b +s;
				System.out.println("网球鞋￥200\t数量"+j+"\t合计"+"￥"+s);
			}
			else if(i==3){
				s = 300*j;
				b = b +s;
				System.out.println("网球拍￥300\t数量"+j+"\t合计"+"￥"+s);
			}
			else{
					System.out.println("输入错误！");
			}
			System.out.println("是否继续(y/n)：");
			a = input.next();
		}while(a.equals("y"));
		System.out.println("请输入付款金额：");
		int money = input.nextInt();
		System.out.println("折扣：0.8\n应付金额："+(b*0.8)+"\n付款金额："+money+"\n找钱："+(money-b*0.8));
	}
}