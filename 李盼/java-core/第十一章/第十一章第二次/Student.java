import java.util.Scanner;

public class Student{
	Scanner input = new Scanner(System.in);
	public void max(int a,int b, int c){
		int max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		System.out.println("最大值是："+max);
	}
	public double avg(int n){
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("请输入第"+(i+1)+"个同学成绩：");
			int score = input.nextInt();
			sum += score;
		}
		System.out.println(sum);
		return 1.0*sum/n;
	}
}
