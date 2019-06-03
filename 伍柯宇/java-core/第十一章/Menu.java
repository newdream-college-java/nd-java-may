import java.util.Scanner;
public class Menu {
	Scanner input = new Scanner(System.in);
	public void welcome(){
		System.out.println("欢迎使用我行我素购物管理系统\n\t1、登录系统\n\t2、退出\n*****************************************\n请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a==1){
			mainmenu();
		}else{
			System.out.println("退出系统成功");
		}
	}
	public void back(){
		System.out.println("我行我素购物管理系统 > 真情回馈\n\t1、幸运大放送\n\t2、幸运抽奖\n\t3、生日问候\n*****************************************\n请选择，输入数字或按0返回上一级菜单：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a==0){
			mainmenu();
		}else if(a==1){
			System.out.println("执行幸运大放送");
		}else if(a==2){
			System.out.println("执行幸运抽奖");
		}else if(a==3){
			System.out.println("执行生日问候");
		}else{
			System.out.println("输入错误请重新输入：");
			back();
		}
	}
	public void mainmenu(){
		System.out.println("我行我素购物管理系统主菜单\n*****************************************\n\t1、客户信息管理\n\t2、真情回馈\n*****************************************\n请选择，输入数字或按0返回上一级菜单：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a==0){
			welcome();
		}else if(a==2){
			back();
		}else{
			System.out.println("功能未开通，请重新输入：");
			mainmenu();
		}
	}
}
