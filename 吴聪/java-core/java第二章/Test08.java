/*
（挑战题）输出一个小数，然后输出其他整数部分和小数部分，格式如下：
小数	整数部分	小数部分
3.14	3			0.14
*/
import java.util.Scanner;
public class Test08{
	public static void main	(String	[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个小数：");
		double a = in.nextDouble();	//float
		int b = (new Double(a)).intValue();	
		double c =a-b;		
	//	c = ((int)(c)*100)/100.0f;
	//	System.out.println(String.format("%.2f", c));
		System.out.println("小数\t\t整数部分\t小数部分");
	//	System.out.println(String.format(a+"\t\t"+b+"\t\t"+"%.2f", c));
		System.out.println(a+"\t"+b+"\t\t"+c);
	}
}