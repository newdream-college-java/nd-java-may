import java.util.Scanner;
public class To6{
	public static void main(String[] args){
		System.out.println("输入一个整数");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if(a%2==0){
			System.out.println("这个是偶数");
		}else{
			System.out.println("这个是奇数");

		}
	}
}