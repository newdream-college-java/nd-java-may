import java.util.Scanner;
public class Menu {
	Scanner input = new Scanner(System.in);
	public void welcome(){
		System.out.println("��ӭʹ���������ع������ϵͳ\n\t1����¼ϵͳ\n\t2���˳�\n*****************************************\n��ѡ���������֣�");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a==1){
			mainmenu();
		}else{
			System.out.println("�˳�ϵͳ�ɹ�");
		}
	}
	public void back(){
		System.out.println("�������ع������ϵͳ > �������\n\t1�����˴����\n\t2�����˳齱\n\t3�������ʺ�\n*****************************************\n��ѡ���������ֻ�0������һ���˵���");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a==0){
			mainmenu();
		}else if(a==1){
			System.out.println("ִ�����˴����");
		}else if(a==2){
			System.out.println("ִ�����˳齱");
		}else if(a==3){
			System.out.println("ִ�������ʺ�");
		}else{
			System.out.println("����������������룺");
			back();
		}
	}
	public void mainmenu(){
		System.out.println("�������ع������ϵͳ���˵�\n*****************************************\n\t1���ͻ���Ϣ����\n\t2���������\n*****************************************\n��ѡ���������ֻ�0������һ���˵���");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a==0){
			welcome();
		}else if(a==2){
			back();
		}else{
			System.out.println("����δ��ͨ�����������룺");
			mainmenu();
		}
	}
}
