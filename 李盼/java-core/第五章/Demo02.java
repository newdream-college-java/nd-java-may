import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("学习任务是否合格：");
		String i = input.next();
		while(i.equals("否")){
			System.out.println("上午阅读教材，学习理论部分，下午上机编程，掌握哦代码部分。");
			System.out.println("学习任务是否合格：");
			i = input.next();
		}
	}
}