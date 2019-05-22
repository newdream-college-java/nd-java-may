/*
输入一个整数n,如果n大于0.
则求和:1+1/2+1/3+...+1/n.否则输出:输入错误
*/
import java.util.Scanner;
public class To5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int n=input.nextInt();
		double sum=0.0;
		if(n>0){
		for(int i=1;i<=n;i++){
			sum+=1.0/i;
		}
			System.out.println(sum);
		}else{
			System.out.println("输入错误");
		
		}
	}
}