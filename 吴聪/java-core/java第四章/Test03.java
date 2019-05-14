/*
编程名次
*/
import java.util.Scanner;
public class Test03{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入名次：");
		String a = in.next();
		switch(a){
			case "第一名":
			System.out.print("麻省理工大学组织的一个月夏令营");
			break;
			case "第二名":
			System.out.print("惠普笔记本电脑一台");
			break;
			case "第三名":
			System.out.print("移动硬盘一个");
			break;
			default:
			System.out.print("无奖励");
		}
	}
}