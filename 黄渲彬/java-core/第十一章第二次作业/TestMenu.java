import java.util.Scanner;


public class TestMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		menu.showLoginMenu();
		System.out.println("��ѡ��,��������:");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			menu.showMainMenu();
			System.out.println("��ѡ��,�������ֻ�0������һ���˵�:");
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
