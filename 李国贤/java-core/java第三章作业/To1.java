import java.util.Scanner;
public class To1{
	public static void main(String[] args){
		System.out.println("输入一个三位数");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		if (d>c&&c>b){
			System.out.println("这是一个降序数");
		}else{
			System.out.println("这个不是降序数");
		}
	}

}