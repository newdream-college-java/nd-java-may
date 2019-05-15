/*
循环输入大于 0 的数字进行累加，
直到输入的数字为 0，就结束循环，并最后输出累加的结果
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个数：");
		double a = in.nextDouble();
		double b=0;
		while(a!=0){
			b+=a;
			a = in.nextDouble();
		}
		System.out.print(b);
	}
}