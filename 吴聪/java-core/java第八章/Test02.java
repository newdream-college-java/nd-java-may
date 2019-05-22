/*
循环接收5名学生的成绩，统计有多少人的成绩大于80分，要求使用continue语句完成
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 0;
		//循环接收成绩五次
		for(int i=1;i<6;i++){
			System.out.print("请输入学生成绩：");
			int score = in.nextInt();
			if(score<=80){
				continue;
			}
			count++;
		}
		System.out.print("成绩大于80的同学有"+count+"人");
	}
}
