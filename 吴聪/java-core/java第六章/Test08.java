/*
ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue������
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int b=0,a;
		for(int i=1;i<=5;i++){
			System.out.print("������ѧ���ɼ���");
			a = in.nextInt();
			if(a<=80){
				continue;
			}
			b++;
		}
		System.out.print("�ɼ�����80 �ֵ�����"+b+"��");
	}
}