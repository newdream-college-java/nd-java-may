/*
输入一个整数，计算有多少天零多少个小时
*/
import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),b,c;
		//求天数
		b = a / 24;
		//求小时
		c = a %24;
		System.out.println(b+"天零"+c+"个小时");
	}

}