/*
循环输入10个数，统计偶数的个数。
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10个数：");
		int i=0,j=0;
		while(i<10){
			double m = input.nextDouble();
			if(m%2.0==0){
				j++;
			}
			i++;
		}
		System.out.println("偶数的个数是"+j+"个");
	}
}