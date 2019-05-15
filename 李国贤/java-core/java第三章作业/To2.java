import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个年份");
		int a=input.nextInt();
		int b=a%4;
		int c=a%100;
		if(b==0&&c!=0){
			System.out.println("这是一个闰年");
		}else{
			System.out.println("这一个是平年");
		}
	}
}