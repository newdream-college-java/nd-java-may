/*
��Ա�齱����λ���ֵ����������ֵĻ�
*/
import java.util.Scanner;
import java.util.Random;                     //����������İ�
public class GoodLuck{
	public static void main(String[] args){
		Random random = new Random();
		int ran = random.nextInt(10);		//������0-9���������
		System.out.println("������4λ��Ա�ţ�");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt(),j = i/100%10;
		if(j==ran){
			System.out.println("����������"+ran+"��"+i+"�ſͻ������˿ͻ�����þ���MP3һ����");
		}
		else{
			System.out.println("����������"+ran+"��"+i+"�ſͻ���лл����֧�֣�");
		}
		
	}
}