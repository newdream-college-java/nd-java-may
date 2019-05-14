/*
循环要求用户输入一个 0 到 2 之间的整数，
如果输入的是 0 就输出“你出的是石头”，
如果输入的是 1 就输出“你出的是剪刀”，
如果输入的是 2 就输出“你出的是布”，
如果是其它数就结束程序。
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		System.out.println("请输入0-2之间的整数：");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		while(i==0||i==1||i==2){
			switch(i){
				case 1: System.out.println("你出的是石头");break;
				case 2: System.out.println("你出的是剪刀");break;
				case 3: System.out.println("你出的是布");break;
			
			}
			System.out.println("请输入0-2之间的整数：");
			i = input.nextInt();
		}
	}
}