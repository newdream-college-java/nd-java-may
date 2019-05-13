/*
输如入三个整数，判断是否相等，不相等再判断是否大于1000
*/
import java.util.Scanner;
public class SiT{
	public static void main(String[] args){
		System.out.println("请输入三个整数：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c  = input.nextInt();
		if(a==b&&b==c){
			System.out.println("这三个数相等");
		}
		else{
			if(a+b+c>1000)
				System.out.println("这三个数之和大于1000");
			else
				System.out.println("这三额数之和不大于1000");
		}
	}
}