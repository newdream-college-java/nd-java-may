/*
商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例
*/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int b=0,c=0,a;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"个顾客年龄：");
			a = in.nextInt();
			if(a>=30){
				b++;
			}else{
				c++;
			}	
		}
		System.out.println("30岁以上顾客比例占"+b+"0%");
		System.out.println("30岁以下顾客比例占"+c+"0%");
	}
}