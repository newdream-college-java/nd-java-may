/*
计算 100 以内的奇数之和
*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a=0;
		for(int i=0;i<=100;i++){
			if(i%2==1){
				a+=i;
			}
		}
		System.out.print(a);	
	}
}