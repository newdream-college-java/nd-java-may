/*
1.2 ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue�����ɡ�
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int p=5;
		int num=0;
		for(;p>=1;p--){
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			num++;
			
		}
		System.out.println("�ɼ����� 80 �ֵ��У�"+num);
	}
}