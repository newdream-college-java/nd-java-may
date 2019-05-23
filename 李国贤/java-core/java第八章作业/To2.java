/*循环接收5名学生的成绩，统计有多少人的成绩大于80分，要求使用
cont inue语句完成
*/
import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("请输入第"+i+"名学生的成绩:");
			int score=input.nextInt();
			if(score>80){
				sum++;
			continue;
			}
		}
		System.out.println("80分以上的有"+sum+"个");
	}
}