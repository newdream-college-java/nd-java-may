/*
保险柜两道密码，分别输入正确才能打开，第一次错误无法输入第二次密码；密码不低于6位
*/
import java.util.Scanner;
public class Test03{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入密码：");
		int a = in.nextInt();
		int b=123456,c=654321;
		if ( a==b ) {
			System.out.print("请输入第二道密码：");
			int d = in.nextInt();
			if ( d==c ){
				System.out.print("恭喜拿到钱了！！");
				}else {
				System.out.print("第2道密码错误");
				}
			}else {
			System.out.println("第1道密码错误");
		}
	}
}