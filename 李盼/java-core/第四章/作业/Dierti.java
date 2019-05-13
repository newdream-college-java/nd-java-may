/*
计算机大赛奖励 简单switch结构
*/
import java.util.Scanner;
public class Dierti{
	public static void main(String[] args){
		System.out.println("请输入名次：");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch(i){
			case 1:
				System.out.println("参加麻省理工大学组织的1个月夏令营");
				break;
			case 2:
				System.out.println("奖励惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("奖励移动硬盘一个");
				break;
			default:
				System.out.println("没有任何奖励");
				break;
		}
	}
}