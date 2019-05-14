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
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个 0 到 2 之间的整数：");
		int a = in.nextInt();
		while(a==0||a==1||a==2){
//		if(a>=0&&a<=2){
			if(a==0){
				System.out.println("你出的是石头!");
				System.out.print("请继续输入：");
			}
			if(a==1){
				System.out.println("你出的是剪刀!");
				System.out.print("请继续输入：");
			}
			if(a==2){
				System.out.println("你出的是布!");
				System.out.print("请继续输入：");
			}
			a = in.nextInt();
//		}else{
//			System.out.print("输入错误，请重新输入！");
//		}
		}
	}
}