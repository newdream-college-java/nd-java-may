/*
输入一个小数，输出其整数部分和小数部分
*/
import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		int b = (int)a;
		double d = (double)b;
		double c  = a-d;
		System.out.println(b);
		System.out.println(c);
	}
}
