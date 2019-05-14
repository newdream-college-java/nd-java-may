import java.util.Scanner;

public class Test01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int x=sc.nextInt();
		int a=x%10;
		int b=x/10%10;
		int c=x/100%10;
		if(c>b&&b>a){
			System.out.println("此数是降序数");
		}else{
			System.out.println("此数不是降序数");
		}
	}		
}