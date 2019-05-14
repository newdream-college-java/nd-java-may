/*
编程实现一个简单的人与电脑的猜拳游戏软件
*/
import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random rd = new Random();
		int b=0;
		do{
			System.out.print("请输入:石头，剪刀，布：");
			int c = rd.nextInt(2);
			String a = in.next();
			if(a.equals("石头")){
				b=0;
			}
			if(a.equals("剪刀")){
				b=1;
			}	
			if(a.equals("布")){
				b=2;
			}
			if((b==0&&c==0)||(b==1&&c==1)||(b==2&&c==2)){
				System.out.println("平局");
			}
			if((b==0&&c==1)||(b==1&&c==2)||(b==2&&c==0)){
				System.out.println("你赢了");
			}
			if((b==0&&c==2)||(b==1&&c==0)||(b==2&&c==1)){
				System.out.println("你输了");
			}
//			c = rd.nextInt(2);
//			a = in.next();
		}while(1==1);
//	System.out.print(c);
	}
}