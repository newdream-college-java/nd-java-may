/*
输入一个年份，判断是闰年还是平年：
1.能被4整除且不能被100整除为闰年
2.能被400整除的是闰年（世纪年）
*/
import java.util.Scanner;
public class Test02{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入年份：");
		int a = in.nextInt();
		if( a%4==0&&a%100!=0||a%400==0 ){
			System.out.println(a+"年是闰年");
		}else{
			System.out.println(a+"年是平年");
		}
	}
}