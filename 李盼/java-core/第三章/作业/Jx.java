/*
输入一个三位数，判断是不是降序数
*/
import java.util.Scanner;
public class Jx{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(),a,b,c;
		a = num/100;      //百位
		b = num/10%10;      //十位
		c = num%10;      //个位
		if((a>b)&&(b>c))
		{
			System.out.println("这是一个降序数");
		}
		else
		{
			System.out.println("这不是一个降序数");
		}
	}

}