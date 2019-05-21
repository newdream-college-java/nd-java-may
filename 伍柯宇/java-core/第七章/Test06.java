/*
输入一个整数n，统计1到n中有多少个奇数和偶数
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		int m=0,n=0;
		for(int i = 1;i<=num;i++){
			if(i%2==0){
				m++;
			}
			else{
				n++;
			}
		}
		System.out.println("从1到"+num+"中有"+m+"个偶数");
		System.out.println("从1到"+num+"中有"+n+"个奇数");
	}
}