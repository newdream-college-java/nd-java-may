/*
登录菜单切换主菜单功能
*/
import java.util.Scanner;
public class CaiDan{
	public static void main(String[] args){
		System.out.println("\t\t欢迎使用我行我素购物管理系统\n\n\t\t\t1、登录系统\n\n\t\t\t2、退出\n\n*******************************************************************************\n\n请选择输入数字：");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch(i){
			case 1:
				System.out.println("\t\t\t主菜单\n\n\t\t\t1、客户信息管理\n\t\t\t2、购物结算\n\t\t\t3、真情回馈\n\t\t\t4、注销\n\n******************************************************************************");
				break;
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default:
				System.out.println("输入错误！");
				break;
		}
	}
}