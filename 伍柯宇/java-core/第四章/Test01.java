import java.util.Scanner;

public class Test01{
	public static void main(String[] args){
		System.out.println("\t\t\t欢迎使用我行我素购物管理系统\n\t\t\t\t1、登录系统\n\n\t\t\t\t2、退出\n\n**************************************************************************\n\n");
		Scanner input =new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int a=input.nextInt();
		switch(a){
		case 1:
			System.out.println("\t\t\t主菜单\n\n\t\t1、客户信息管理\n\n\t\t2、购物结算\n\n\t\t3、真情回馈\n\n\t\t4、注销");
			break;
		case 2:
			System.out.println("谢谢您的使用");
			break;
		default:
			System.out.println("输入错误!");
		}
	}
}