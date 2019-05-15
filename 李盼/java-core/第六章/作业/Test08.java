/*
循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue
语句完成。
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = 0,score = 0;;
		for(int i = 1;i<6;i++){
			System.out.print("请输入第"+i+"名学生成绩：");
			score = input.nextInt();
			if(score<80){
				continue;                                    //没超过80分跳出此次循环进入下次循环
			}
			num++;
		}
		System.out.println(num+"人超过80分");
	}
}