import java.util.Random;
import java.util.Scanner;

public class goodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		Random rd=new Random();
		int b=rd.nextInt(10);
		System.out.println(b);
		System.out.println("�������ع������ϵͳ > ���˳齱\n");
		System.out.print("������4λ��Ա�ţ�");
		int num=input.nextInt();
		int a=num/100%10;
		if(a==b){
			System.out.println(num+"�ſͻ������˿ͻ�����þ���MP3һ����");
		}
		else{
			System.out.println(num+"�ſͻ�лл����֧�֣�");
		}
	}		
}