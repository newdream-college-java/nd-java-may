/*
2.1、商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例
*/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int p=1,num=0;
		for(;p<=10;p++){
			System.out.print("请输入第"+p+"位顾客的年龄：");
			int i=input.nextInt();
			if(i<=30){
				continue;
			}
			num++;
		}
		System.out.println("30岁以下的比例是："+((num*1.0)/10.0)*100+"%");
		System.out.println("30岁以上的比例是："+((10-num)*1.0/10.0)*100+"%");
	}
}
