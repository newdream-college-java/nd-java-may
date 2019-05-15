/*
循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue语句完成
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int b=0,a;
		for(int i=1;i<=5;i++){
			System.out.print("请输入学生成绩：");
			a = in.nextInt();
			if(a<=80){
				continue;
			}
			b++;
		}
		System.out.print("成绩大于80 分的人有"+b+"个");
	}
}