/*
输入一个3位数，将各个位上的数字分别放入到3个变量中，编程分别将换变量值后输出。
比如：
输入123，放入abc，交换变量值，输出abc的值为321
*/
import java.util.Scanner;
public class Test06{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);
	System.out.print("输入一个三位数：");
	int a = in.nextInt();
	int b,c,d,e;
	b=a%10;
	c=a/10%10;
	d=a/100;
	e=b*100+c*10+d;
	System.out.print(e);
	}
}