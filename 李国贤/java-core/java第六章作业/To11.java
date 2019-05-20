/*
、用户登录验证。验证次数最多 3 次
*/
import java.util.Scanner;
public class To11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i = 1;i<4;i++){
			System.out.print("请输入用户名:");
			String name = input.next();
			System.out.print("请输入密码:");
			int num = input.nextInt();
			if(name.equals("jim")&&num==123456){
				System.out.println("欢迎登陆MyShopping系统！");
				break;					
			}
			else{
				System.out.println("输入错误！您还有"+(3-i)+"次机会");
			}
		}
	}
}