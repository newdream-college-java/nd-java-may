/*
输出计算 100+101+102+……+200 之和。
*/
import java.util.Scanner;
public class To1{
	public static void main(String[] args){
		int sum=0;
		int i=1;
		for(;i<=200;i++){
			sum+=i;
		}
			System.out.println("和为"+sum);
}
}