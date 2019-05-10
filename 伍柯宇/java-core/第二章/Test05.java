import java.util.Scanner;

public class Test05{
	public static void main(String[] args){
		System.out.println("请输入一个整数：");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int day=n/24;
		int hour=n%24;
		System.out.println(day+"天"+hour+"个小时");
	}
}