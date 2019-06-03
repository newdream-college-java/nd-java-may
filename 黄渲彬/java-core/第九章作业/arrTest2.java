package sc;
import java.util.Scanner;
public class arrTest2 {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		double sum = 0; 
	double[] arr = new double[6];
	System.out.println("请输入会员本月的消费记录");
		for(int a = 1;a<arr.length;a++)
			{		
				System.out.print("请输入第"+a+"笔购物金额:");
				arr[a]=input.nextDouble();				
		}
		System.out.println("序号                "+"金额(元)");
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i+"            "+arr[i]);
			sum +=arr[i];			
		}
		System.out.println("总金额             "+sum);
	}
	
}
