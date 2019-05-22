/*
用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数的个数，0的个数。直到用户输入999就结束，输出统计结果
*/
import java.util.Scanner;
public class To4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum1=0,sum2=0,sum3=0;
		for(int i=1;;i++){
			System.out.println("请输入一个数字:");
			int a=input.nextInt();
			if(a==999){
				break;
			}
			else if(a>0){
				sum1++;
			}else if(a==0){
				sum2++;
			}else{
				sum3++;
			}
		
		}
				System.out.println("正数的个数为:"+sum1+"\t负数的个数为:"+sum3+"\t0的个数为:"+sum2);





}
}