/*
����ʮ�Ƶ��Ƴɼ�����60�����£�60-80�֣�80�����ϵ�ѧ�����ж��ٸ���������ͷ���߷�
*/
import java.util.Scanner;
public class Test05{
	public  static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double max,min,avg,sum = 0;
		int count1=0,count2=0,count3=0;
		double[] score = new double[10];
		for(int i = 0;i<10;i++){
			System.out.print("�������"+(i+1)+"��ͬѧ�ɼ���");
			score[i] = input.nextDouble();
			if(score[i]<60){
				count1++;
			}else if(score[i]>=60&&score[i]<80){
				count2++;
			}else{
				count3++;
			}
		}
		max = score[0];
		min = score[0];
		for(int i = 0;i<10;i++){
			if(max<score[i]){
				max = score[i];
			}else{
				min = score[i];
			}
			sum += score[i];
		}
		avg = sum/10;
		System.out.print("��߷���"+max+"\n��ͷ���"+min+"\nƽ������"+avg+"\n60��������"+count1+"\n60-80��"+count2+"\n80��������"+count3);
	}
}