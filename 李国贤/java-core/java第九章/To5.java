import java.util.Scanner;
public class To5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double max,min,avg,sum3=0;
		int[] score=new int[10];
		int sum=0;
		int sum1=0;
		int sum2=0;
		System.out.println("������10λѧԱ�ĳɼ���");
		for(int i=0;i<10;i++){
			score[i]=input.nextInt();
			if(score[i]<60){
				sum++;
			}else if(score[i]>=60&&score[i]<80){
				sum1++;
			}else{
				sum2++;
			}
		}
		max=score[0];
		min=score[0];
		for(int i=0;i<10;i++){
			if(max<score[i]){
				max=score[i];
			}else{
				min=score[i];
			}
				sum3+=score[i];
		}
			avg=sum3/10;
		System.out.println("��߷���"+max+"\n��ͷ���"+min+"\nƽ������"+avg+"\n60��������"+sum+"\n60-80����"+sum1+"\n80��������"+sum2);
	}
}