/*
输入一个年份，判断其是不是闰年
*/
import java.util.Scanner;
public class Rn{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if((num%4==0)&&(num%100!=0))
			System.out.println("是闰年");
		else if(num%400==0)
			System.out.println("是闰年");
		else
			System.out.println("不是闰年");
	}

}