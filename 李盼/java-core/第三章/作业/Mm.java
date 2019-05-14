/*
两道密码锁
*/
import java.util.Scanner;
public class Mm{
	public static void main(String[] args){
		Scanner input = new  Scanner(System.in);
		System.out.print("请输入第一道密码：");
		int mm1 = input.nextInt();
		if(mm1==654321)
		{
			System.out.print("请输入第二道密码：");
			int mm2 = input.nextInt();
			if(mm2==123456)
				System.out.println("恭喜拿到钱了！");
			else
				System.out.println("第二道密码错误");}
		else
			System.out.println("第一道密码错误");			
				
		
		
	}

}