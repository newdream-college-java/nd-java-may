import java.util.Scanner;


public class Showping {
	Scanner input=new Scanner(System.in);
	public void sign(){
		System.out.println("��ӭʹ���������ع������ϵͳ\n\t1.��¼ϵͳ\n\t2.�˳�\n************************\n��ѡ���������֣�");
		int a=input.nextInt();
		if(a==1){
			System.out.println("�������û�����");
			String name=input.next();
			System.out.println("���������룺");
			int m=input.nextInt();
			if(name.equals("asd")&&m==123321){
				menu();
			}else{
				System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼��");
			}
			System.out.println("�˳�ϵͳ");
		}
	}
	public void menu(){
		System.out.println("�������ع���ϵͳ���˵�\n************************\n\t1.�ͻ���Ϣ����\n\t2.�������\n***********************\n��ѡ���������ֻ�0������һ���˵���");
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
		System.out.println("�ͻ���Ϣ����\n\t1.��ʾ���пͻ���Ϣ\n\t2.��ӿͻ���Ϣ\n\t3.�޸Ŀͻ���Ϣ\n\t4.��ѯ�ͻ���Ϣ\n************************\n��ѡ���������ֻ�0������һ���˵���");
		int n=input.nextInt();
		if(n==0){
			menu();
		}else if(n==1){
			System.out.println("��ʾ���пͻ���Ϣ");
		}else if(n==2){
			System.out.println("��ӿͻ���Ϣ");
		}else if(n==3){
			System.out.println("�޸Ŀͻ���Ϣ");
		}else if(n==4){
			System.out.println("��ѯ�ͻ���Ϣ");
		}else{
			System.out.println("��������ȷ�����֣�");
		}
	}
	public void back(){
		System.out.println("�������ع������ϵͳ���������\n*************************\n\t1.���˴�齱\n\t2.���˳齱\n\t3.�����ʺ�\n************************\n��ѡ���������ֻ�0������һ���˵���");
		int c=input.nextInt();
		if(c==0){
			menu();
		}else if(c==1){
			System.out.println("ִ�����˴����");
		}else if(c==2){
			System.out.println("ִ�����˳齱");
		}else if(c==3){
			System.out.println("ִ�������ʺ�");
		}else{
			
		}
	}
	
}
