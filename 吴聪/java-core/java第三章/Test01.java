/*
输入一个三位数，判断是否为降序数，例：
321为降序数，百位>十位>个位
*/
import java.util.Scanner;
public class Test01{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int a = in.nextInt();
		int b,c,d;	//b个位，c十位，d百位
		b=a%10;
		c=a/10%10;
		d=a/100;
		if( b<c&&c<d ){
			System.out.println(a+"是一个降序数");
		}else{
			System.out.println(a+"不是一个降序数");
		}
	}
}