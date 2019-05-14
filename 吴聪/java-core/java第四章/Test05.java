/*
输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”
				否则在判断这三个数之和是否大于1000：
				如果大于1000输出“这三个数之和大于1000”
				否则输出“这三个数之和不大于1000”
*/
import java.util.Scanner;
public class Test05{
	public static void main (String [] args ){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入三个整数：");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if(a==b&&a==c){
			System.out.print("这三个数相等!");
		}else if(a+b+c>1000) {
			System.out.print("这三个数之和大于1000!");
		}else{
			System.out.print("这三个数之和不大于1000!");
		}
	}
}