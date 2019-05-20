/*
商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例
*/
import java.util.Scanner;
public class To9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=0,b=0;
		double m,n;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"为顾客的年龄:");
			int age=input.nextInt();
			if(age>30){
				b++;
			}else{
				a++;
			}
		}	
		m=b/10.0*100;
		n=a/10.0*100;
		System.out.println("30岁以上的比例是"+m+"%");
		System.out.println("30岁以下的比例是"+n+"%");
	}
}