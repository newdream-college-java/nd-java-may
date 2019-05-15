/*
循环问“你的名字叫什么？”，如果回答的是“不告诉你”，就继续问，
否则输出“你的名字原来叫：**”。编程实现。
*/
import java.util.Scanner;
public class Test07{
	public static void  main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("你的名字叫什么？");
		String answer=input.next();
		while(answer.equals("不告诉你")){
			System.out.println("你的名字叫什么？");
			answer=input.next();
		}
		System.out.println("你的名字叫"+answer);
	}
}