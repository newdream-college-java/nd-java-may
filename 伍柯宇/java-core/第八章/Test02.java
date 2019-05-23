/*
1.2 循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue语句完成。
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int p=5;
		int num=0;
		for(;p>=1;p--){
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			num++;
			
		}
		System.out.println("成绩大于 80 分的有："+num);
	}
}