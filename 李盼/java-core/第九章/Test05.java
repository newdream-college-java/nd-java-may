/*
输入十科单科成绩，求60分以下，60-80分，80分以上的学生各有多少个，并求最低分最高分
*/
import java.util.Scanner;
public class Test05{
	public  static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double max,min,avg,sum = 0;
		int count1=0,count2=0,count3=0;
		double[] score = new double[10];
		for(int i = 0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"名同学成绩：");
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
		System.out.print("最高分是"+max+"\n最低分是"+min+"\n平均分是"+avg+"\n60分以下有"+count1+"\n60-80有"+count2+"\n80分以上有"+count3);
	}
}