import java.util.Random;
import java.util.Scanner;
public class To7{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
		Random rd=new Random();   //�������һ������
		int number=rd.nextInt(10);
		System.out.println(number);
		int memberNumber = rd.nextInt(9000)+1000;  //�������һ����λ���Ļ�Ա��
		System.out.println("�����Ա��Ϊ��"+memberNumber);	
		int a=memberNumber/100%10;
		System.out.println("��λ��Ϊ:"+a);
		if(a==number){
			System.out.println(memberNumber+"�ſͻ��������û�������MP3һ����");
		}else{
			System.out.println(memberNumber+"�ſͻ���лл���֧�֣�");
		}
}

}