/*
循环输入5个整数，然后求和，输出这5个整数的和
*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入五个整数：");
		int i = 0,sum=0;
		while(i<5){
			int j = input.nextInt();
			sum = j+sum;
			i++;
		}
		System.out.println("和为"+sum);
	}
}