/*
编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据4，则输出4！=4*3*2*1=24.要求限制输入1~10，否则提示错误
*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("输入一个正整数：");
		int a=in.nextInt();
		int b=1;
//		for(int i=1;i<=a;i++){
//			b*=i;
			if(a<1||a>10){
			System.out.print("输入错误！");
			}else{
				for(int i=1;i<=a;i++){
					b*=i;
				}
				System.out.print(b);
			}
//		}
	}
}