/*
ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue
�����ɡ�
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = 0,score = 0;;
		for(int i = 1;i<6;i++){
			System.out.print("�������"+i+"��ѧ���ɼ���");
			score = input.nextInt();
			if(score<80){
				continue;                                    //û����80�������˴�ѭ�������´�ѭ��
			}
			num++;
		}
		System.out.println(num+"�˳���80��");
	}
}