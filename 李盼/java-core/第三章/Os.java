/*
判断一个数是不是偶数
*/
import java.util.Scanner;
public class Os{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a%2==0)
			System.out.println("这是个偶数");
		else
			System.out.println("这是个奇数");
	}
}