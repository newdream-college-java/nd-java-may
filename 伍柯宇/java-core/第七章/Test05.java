/*
输入一个整数求和1+1/2+1/3+1/4+......+1/n，否则输出：输入错误
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = input.nextInt();
		double sum = 0;
		if(n>0){
			for(int i = 1;i<=n;i++){
				sum = sum+1.0/i;
			}
			System.out.print(sum);
		}
		else{
			System.out.print("输入错误");
		}
	}
}