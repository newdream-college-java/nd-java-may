/*
输入一个int型数据，判断这个数是偶数还是奇数。
*/
import java.util.Scanner;
public class Test06{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("输入一个整数:");
		int a = in.nextInt();
		if(a%2==0){
			System.out.print(a+"是偶数");
		}else{
			System.out.print(a+"是奇数");
		}
	}
}