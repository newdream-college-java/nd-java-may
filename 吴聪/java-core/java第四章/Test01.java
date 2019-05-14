/*
使用switch选择结构实现从登录菜单切换到主菜单。
*/
import java.util.Scanner;
public class Test01{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
//登陆菜单第一级
		System.out.println("\t\t欢迎使用我行我素购物管理系统\n\t\t\t1.登陆系统\n\t\t\t2.退出\n\t**********************************************");
		System.out.print("请选择，输入数字：");
		int a = in.nextInt();
		switch(a){
			case 1:
				System.out.println("\t\t我行我素购物管理系统主菜单\n\t\t\t1.客户信息管理\n\t\t\t2.购物清算\n\t\t\t3.真情回馈\n\t\t\t4.注销");
			break;
			case 2:
				System.out.println("谢谢您的使用!");
			break;
			default:
			System.out.print("输入错误!!");
		}
	}
}