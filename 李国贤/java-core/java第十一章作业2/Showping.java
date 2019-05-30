import java.util.Scanner;


public class Showping {
	Scanner input=new Scanner(System.in);
	public void sign(){
		System.out.println("欢迎使用我行我素购物管理系统\n\t1.登录系统\n\t2.退出\n************************\n请选择，输入数字：");
		int a=input.nextInt();
		if(a==1){
			System.out.println("请输入用户名：");
			String name=input.next();
			System.out.println("请输入密码：");
			int m=input.nextInt();
			if(name.equals("asd")&&m==123321){
				menu();
			}else{
				System.out.println("@@您没有权限进入系统，请重新登录：");
			}
			System.out.println("退出系统");
		}
	}
	public void menu(){
		System.out.println("我行我素购物系统主菜单\n************************\n\t1.客户信息管理\n\t2.真情回馈\n***********************\n请选择，输入数字或按0返回上一级菜单：");
		int b=input.nextInt();
		if(b==0){
			sign();
		}else if(b==2){
			back();
		}else if(b==1){
			cus();
		}
	}
	public void cus(){
		System.out.println("客户信息管理\n\t1.显示所有客户信息\n\t2.添加客户信息\n\t3.修改客户信息\n\t4.查询客户信息\n************************\n请选择，输入数字或按0返回上一级菜单：");
		int n=input.nextInt();
		if(n==0){
			menu();
		}else if(n==1){
			System.out.println("显示所有客户信息");
		}else if(n==2){
			System.out.println("添加客户信息");
		}else if(n==3){
			System.out.println("修改客户信息");
		}else if(n==4){
			System.out.println("查询客户信息");
		}else{
			System.out.println("请输入正确的数字：");
		}
	}
	public void back(){
		System.out.println("我行我素购物管理系统》真情回馈\n*************************\n\t1.幸运大抽奖\n\t2.幸运抽奖\n\t3.生日问候\n************************\n请选择，输入数字或按0返回上一级菜单：");
		int c=input.nextInt();
		if(c==0){
			menu();
		}else if(c==1){
			System.out.println("执行幸运大放送");
		}else if(c==2){
			System.out.println("执行幸运抽奖");
		}else if(c==3){
			System.out.println("执行生日问候");
		}else{
			
		}
	}
	
}
