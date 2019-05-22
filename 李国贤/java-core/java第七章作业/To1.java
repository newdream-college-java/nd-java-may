/*
编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据4，则输出4!=4*3*2*1=24.要求限制输入1~10，否则提示错误
*/
import java.util.Scanner;
public class To1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个1~10的数字");
		int num=input.nextInt();
		int sum=1;
		for(int i=1;i<=num;i++){
			sum=sum*i;
		}
			System.out.println(sum);
	}
}