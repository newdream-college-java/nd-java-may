/*
���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ���
*/
import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		int b=0;
		do{
			System.out.print("������:ʯͷ������������");
			int c = rd.nextInt(2);
			String a = in.next();
			if(a.equals("ʯͷ")){
				b=0;
			}
			if(a.equals("����")){
				b=1;
			}	
			if(a.equals("��")){
				b=2;
			}
			if((b==0&&c==0)||(b==1&&c==1)||(b==2&&c==2)){
				System.out.println("ƽ��");
			}
			if((b==0&&c==1)||(b==1&&c==2)||(b==2&&c==0)){
				System.out.println("��Ӯ��");
			}
			if((b==0&&c==2)||(b==1&&c==0)||(b==2&&c==1)){
				System.out.println("������");
			}
//			c = rd.nextInt(2);
//			a = in.next();
		}while(1==1);
//	System.out.print(c);
	}
}