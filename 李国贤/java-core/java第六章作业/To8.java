/*
、循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue
语句完成。
*/
import java.util.Scanner;
public class To8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"位学生的成绩:");
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			sum++;
		}
			System.out.println("80分以上的人数为:"+sum);
	}
}