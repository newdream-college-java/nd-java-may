/*
输入10个学生的单科成绩，求成绩在60分以下~60~80和80分以上的学生各有多少个 求最高分 最低分和平均分
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] score=new int[10];
		int a=0,b=0,c=0;//统计分数的变量
		for(int i=0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"个人的成绩：");
			score[i]=in.nextInt();
			if(score[i]>=80){
				a++;
			}else if(score[i]>=60&&score[i]<80){
				b++;
			}else{
				c++;
			}	
		}
		System.out.println("80分以上学生人数:"+a);
		System.out.println("60分到80分学生人数:"+b);
		System.out.println("60分以下学生人数:"+c);
		int min = score[0];int max = score[0];
		for(int i=1;i<score.length;i++){
			if(score[i]<min){
				min = score[i];
			}
		}
		System.out.println("最低分："+min);
		for(int i=1;i<score.length;i++){
			if(score[i]>max){
				max = score[i];
			}
		}
		System.out.println("最高分："+max);
		double sum=0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		System.out.print("平均分："+(sum/10.0));
	}
}