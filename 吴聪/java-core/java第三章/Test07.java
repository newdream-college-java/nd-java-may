/*
�����û�����ԱID��λ����Ϊ������������ּ�Ϊ�����û�
*/
import java.util.Scanner;
import java.util.Random;
public class Test07{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���������Ļ�Ա�ţ�");
		int a = in.nextInt();
		Random in1 = new Random();
        int b = in1.nextInt(10);
		int c;
		if((c=a/100%10)==b){
			System.out.print(a+"�ſͻ����������û�"+b+"����þ�����Ʒһ��!");
		}else{
			System.out.print(a+"���û������������������"+b+",лл����֧�֣�");
		}
	}
}