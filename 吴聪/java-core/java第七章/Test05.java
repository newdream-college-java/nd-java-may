/*
输入一个整数n，如果n>0,则求和：1+1/2+1/3+...+1/n,否则输出：输入错误
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("输入一个整数：");
		int num = in.nextInt();
		int b=0;
		if(num>0){
			for(int i=1;i<=num;i++){
				b+=1/i;
			}
		}else{
			System.out.print("输入错误");
		}
		System.out.print(b);
	}
}