/*
编写 Java 程序，实现接收用户输入的正整数，输出该数的阶乘。要求：限制输入的数据在 1-10 之间，
无效数据进行提示，结束程序。输出结果如：4！=1*2*3*4=24
*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入1~10的正整数：");
		int a=input.nextInt();
		int sum=1;
		if(a<=10&&a>=1){
			for(int i=1;i<=a;i++){
				sum*=i;
			}
		}else{
			System.out.print("输入错误！！！");
		}
		System.out.print(sum);
	}
}