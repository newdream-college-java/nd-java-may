import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input =new Scanner(System. in);
		System.out.println("请输入韩嫣的成绩: ");
		int a= input.nextInt();
			switch(a){
			case 1:
				System.out.println("麻省理工大学组织的1个月夏令营");
				break;
			case 2: 
				System.out.println("奖励惠普笔记本电脑一部");
				break;
			case 3: 
				System.out.println("励移动硬盘-个");
				break;
			default: 
				System.out.println("不给任何奖励");
		}
	}
}