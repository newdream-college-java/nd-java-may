import java.util.Scanner;
public class To5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double max,min,avg,sum3=0;
		int[] score=new int[10];
		int sum=0;
		int sum1=0;
		int sum2=0;
		System.out.println("请输入10位学员的成绩：");
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
		System.out.println("最高分是"+max+"\n最低分是"+min+"\n平均分是"+avg+"\n60分以下有"+sum+"\n60-80分有"+sum1+"\n80分以上有"+sum2);
	}
}