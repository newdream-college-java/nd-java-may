import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//声明变量，赋值
		double[] money=new double[5];
		double sum=0;
		System.out.println("请输入本月会员的消费记录");
		//输出购物金额，
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"笔购物金额");
			money[i]=input.nextDouble();
			sum+=money[i];         //求和
		}
		System.out.println("序号\t金额（元）");
		//输出表格
		for(int i=0;i<5;i++){
			System.out.println(i+"\t"+money[i]);
		}
		System.out.println("总金额\t"+sum);
	}
}