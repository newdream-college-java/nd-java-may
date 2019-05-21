/*
用户可以无限次输入数字，请统计用户输入的数字中正数的个数，负数的个数，0的个数，直到用户输入999就结束，输出统计结果
*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int zs=0,fs=0,l=0;
		System.out.print("请输入一个数：");
		int num = in.nextInt();
		for(int i=1;num!=999;i++){
			if(num>0){
				zs++;
			}else if(num<0){
				fs++;
			}else{
				l++;
			}
			System.out.print("请输入下一个数：");
			num = in.nextInt();
		}
		System.out.print("正数"+(zs+1)+"个，负数"+fs+"个，零"+l+"个");
	}
}