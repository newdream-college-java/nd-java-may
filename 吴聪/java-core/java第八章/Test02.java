/*
ѭ������5��ѧ���ĳɼ���ͳ���ж����˵ĳɼ�����80�֣�Ҫ��ʹ��continue������
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 0;
		//ѭ�����ճɼ����
		for(int i=1;i<6;i++){
			System.out.print("������ѧ���ɼ���");
			int score = in.nextInt();
			if(score<=80){
				continue;
			}
			count++;
		}
		System.out.print("�ɼ�����80��ͬѧ��"+count+"��");
	}
}
