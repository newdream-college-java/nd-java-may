/*
循环问“你的名字叫什么？”，如果回答的是“不告诉你”，就继续问，
否则输出“你的名字原来叫：**”。编程实现
*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("你的名字是什么？");
		String a = in.next();
		while(a.equals("不告诉你")){
			System.out.println("你的名字是什么？");
			a = in.next();
		} 
		System.out.print("你的名字原来叫："+a);
	}
}