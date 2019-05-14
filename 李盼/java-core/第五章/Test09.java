/*
进入系统主菜单后，提示用户输入数字，根据选择进入相应模块
用户若输入错误，要求重复输入，直到输入正确，执行相应功能后退出循环
*/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统\n\n***********************************************************\n\t1、客户信息管理\n\t2、购物结算\n\t3、真情回馈\n\t4、注销\n*************************************************************\n请选择，输入数字：");
		int i = input.nextInt();
		while(i>4||i<1){
			System.out.println("输入错误，请重新输入：");
			i = input.nextInt();
		}
		switch(i){
			case 1:
				System.out.println("执行客户信息管理");
				break;
			case 2:
				System.out.println("执行购物结算");
				break;
			case 3:
				System.out.println("执行真情回馈");
				break;
			case 4:
				System.out.println("执行注销");
				break;
		}
	}
}