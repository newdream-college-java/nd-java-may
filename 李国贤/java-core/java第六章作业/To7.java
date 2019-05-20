/*
、循环输入大于 0 的数字进行累加，
直到输入的数字为 0，就结束循环，并最后输出累加的结果
*/
import java.util.Scanner;
public class To7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(;;){	
			System.out.println("请输入一个大于0的数:");
			int num = input.nextInt();
			if(num==0){
			break;
			}else{
				sum+=num;
			}
		}
		System.out.println(sum);
	}
}