import java.util.Scanner;


public class TestStartSMS {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ�����������û�����ϵͳ");
		System.out.println("1.��¼ϵͳ");
		System.out.println("2.�˳�");
		System.out.println("********************");
		
		System.out.println("��ѡ��,��������");
		int a = input.nextInt();
		switch(a){
		case 1:
		System.out.println("��¼ϵͳ");
		System.out.print("�������û���:");
		String sc = input.next();
		System.out.print("����������:");
		String sb = input.next();
		if("1234".equals(sc) && "1234".equals(sb)){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("@@��û��Ȩ�޽���ϵͳ,�����µ�¼@@");
		}
		break;
		case 2:
		System.out.println("�˳�");
		break;
		}
	}

}
