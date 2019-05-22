/*
输入一个整数n,统计1到n中有多少个奇数和偶数
*/
import java.util.Scanner;
public class To6{
	public static void  main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int n=input.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum1++;
			}else{
				sum2++;
			}
		System.out.println("基数:"+sum2+"个,偶数:"+sum1+"个");
		}
	}
}