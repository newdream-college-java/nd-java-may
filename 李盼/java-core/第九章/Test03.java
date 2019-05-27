/*
输出消费记录
*/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] money = new double[5];
		double sum = 0;
		System.out.println("请输入本月会员的消费记录：");
		//输入购物金额，求和
		for(int i = 0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			money[i] = input.nextDouble();
			sum += money[i];
		}
		System.out.println("序号\t金额（元）");
		//输出表格
		for(int i = 0;i<5;i++){
			System.out.println(i+1+"\t"+money[i]);
		}
		System.out.println("总金额\t"+sum);
	}
}