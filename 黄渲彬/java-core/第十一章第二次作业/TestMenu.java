import java.util.Scanner;


public class TestMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		menu.showLoginMenu();
		System.out.println("请选择,输入数字:");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			menu.showMainMenu();
			System.out.println("请选择,输入数字或按0返回上一级菜单:");
			int a = sc.nextInt();
			switch(a){
			case 1:
				menu.showCustMenu();
				break;
			case 2:
				menu.showSendGMenu();
				break;
			}
			
		case 2:
			menu.signOut();
			break;
		}
	}

}
