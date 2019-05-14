/*
编程实现一个简单的人与电脑的猜拳游戏软件
*/
import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("0为石头，1为剪刀，2为布（其他数字退出）\n请输入：");
		Random randow = new Random();
		int n = input.nextInt();              //n为输入出拳
		while(n==0||n==1||n==2){
			int ran = randow.nextInt(3);
			switch(n){
				case 0:
					if(ran==0){
						System.out.println("平局");
					}
					else if(ran==1){
						System.out.println("你赢了");
					}
					else{
						System.out.println("你输了");
					}
					break;
				case 1:
					if(ran==1){
						System.out.println("平局");
					}
					else if(ran==2){
						System.out.println("你赢了");
					}
					else{
						System.out.println("你输了");
					}
					break;
				case 2:
					if(ran==2){
						System.out.println("平局");
					}
					else if(ran==0){
						System.out.println("你赢了");
					}
					else{
						System.out.println("你输了");
					}
					break;
			}
			System.out.println("\n\n\n0为石头，1为剪刀，2为布（其他数字退出）\n请输入：");
			n = input.nextInt();
		}
		
	}
}