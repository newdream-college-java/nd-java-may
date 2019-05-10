//输入yes no或其他输出不同内容
import java.util.Scanner;
public class If{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("你爱我吗");
		String str = input.next();
		if(str.equals("yes"))
			System.out.println("你是爱我的");
		else if(str.equals("no"))
			System.out.println("原来你不爱我");
		else
			System.out.println("你到底是爱还是不爱，自己也不清楚");
	}

}