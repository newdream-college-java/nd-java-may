/*
用户登录验证。验证次数最多 3 次
*/
import java.util.Scanner;
public class Test11{
	public static void main(String[] args ){
		Scanner in = new Scanner(System.in);
		String name;
		int num = 123456,b;
		for(int i=1;i<=3;i++){
			System.out.print("请输入用户名：");
			name = in.next();
			System.out.print("请输入密码：");
			b = in.nextInt();
			if(b==123456){
				System.out.print("欢迎登陆MyShopping系统!");
				break;
			}else if((3-i)>=1){
				System.out.println("你还剩"+(3-i)+"次机会!");
			}else if((3-i)==0){
			System.out.println("三次密码错误！登陆失败!!!");
			}
		}
	}
}