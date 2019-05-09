/*
输入一个三位数，翻转后输出
*/
import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),b,c,d;
		b = a%10;
		c = a/10%10;
		d = a/100;
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
	}
}