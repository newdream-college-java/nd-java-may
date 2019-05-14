/*
星期：
输入：1 输出：星期一 ...如果是其他 输出错误
*/
import java.util.Scanner;
public class Test04{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入数字：");
		int a = in.nextInt();
		switch(a){
			case 1:
			System.out.print("星期一");
			break;
			case 2:
			System.out.print("星期二");
			break;
			case 3:
			System.out.print("星期三");
			break;
			case 4:
			System.out.print("星期四");
			break;
			case 5:
			System.out.print("星期五");
			break;
			case 6:
			System.out.print("星期六");
			break;
			case 7:
			System.out.print("星期天");
			break;
			default:
			System.out.print("输入错误");
		}
	}
}