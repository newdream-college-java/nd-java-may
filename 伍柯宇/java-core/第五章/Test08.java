/*
循环要求用户输入一个 0 到 2 之间的整数，
如果输入的是 0 就输出“你出的是石头”，
如果输入的是 1 就输出“你出的是剪刀”，
如果输入的是 2 就输出“你出的是布”，
如果是其它数就结束程序。
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		 while (true) {
       			System.out.println("输入一个0到2之间的整数:");
       			int num= input.nextInt();
       			switch (num) {
           				case 0:
               					System.out.println("你出的是石头");
               					break;
           				case 1:
               					System.out.println("你出的是剪刀");
               					break;
           				case 2:
               					System.out.println("你出的是布");
               					break;
           				default:
               					System.out.println("警告：只能输入012");
               					break;

       			}
		}
	}
}