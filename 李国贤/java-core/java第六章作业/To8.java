/*
��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue
�����ɡ�
*/
import java.util.Scanner;
public class To8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++){
			System.out.println("�������"+(i+1)+"λѧ���ĳɼ�:");
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			sum++;
		}
			System.out.println("80�����ϵ�����Ϊ:"+sum);
	}
}