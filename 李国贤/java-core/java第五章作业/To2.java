/*
计算 1+1/4+1/9+....+1/(20*20)
*/
import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		double sum=0.0;
		for(int i=1;i<21;i++){
			sum=sum+1.0/(i*i);
		}
			System.out.println("结果为"+sum);
	}
}