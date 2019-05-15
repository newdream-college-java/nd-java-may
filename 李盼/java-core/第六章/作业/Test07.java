/*
循环输入大于 0 的数字进行累加，
直到输入的数字为 0，就结束循环，并最后输出累加的结果。
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do{
			System.out.print("请输入大于0的整数（输入0结束）：");
			num = input.nextInt();
			sum += num;
		}while(num!=0);
		System.out.println(sum);
	}
}