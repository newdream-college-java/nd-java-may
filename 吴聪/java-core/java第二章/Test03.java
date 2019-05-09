/*
输入一个四位数整数，要求编程将四位数的个位，十位，百位，千位分别输出
*/
import java.util.Scanner;
public class Test03{
	public static void main (String [] args){
		System.out.print("输入一个四位整数：");
		Scanner in = new Scanner(System.in); 
		int a = in.nextInt();
		int g,s,b,q;
		g=a%10;
		s=a/10%10;
		b=a/100%10;
		q=a/1000;
		System.out.println("个位："+g+"\n十位："+s+"\n百位："+b+"\n千位："+q);
	}
}