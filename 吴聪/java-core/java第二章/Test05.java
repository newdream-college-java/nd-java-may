/*
输入一个整数，代表由N个小时，计算n个小时等于多少天零多少个小时
如：输入25 那么输出1天零1个小时
*/
import java.util.Scanner;
public class Test05{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("输入一个整数：");
		int a = in.nextInt();
		int b,c;
		b=a/24;
		c=a%24;
		System.out.println(b+"天"+c+"小时");	
	}
}