import java.util.Scanner;

public class Test03{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int y=0;//偶数个数
		int x=1;//循环输入次数
		while(x<=10){
			int a=input.nextInt();
			x++;
			if(a%2==0){
				y++;
			}
		}
		System.out.println("偶数个数为："+y);
	}
}