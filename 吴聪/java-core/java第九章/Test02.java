import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		double[] arr =new double[5];
		double sum=0;
		for(int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			arr[i]=in.nextDouble();
			sum+=arr[i];
		}
		System.out.println("序号\t金额(元)");
		System.out.println("1\t"+arr[0]);
		System.out.println("2\t"+arr[1]);
		System.out.println("3\t"+arr[2]);
		System.out.println("4\t"+arr[3]);
		System.out.println("5\t"+arr[4]);
		System.out.print("总金额\t"+sum);
	}
}