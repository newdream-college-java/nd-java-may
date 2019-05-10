/*
输出“你爱我吗？”，回答Yes，则输出“你是爱我的”
				  回答No，则输出“原来你不爱我”
				  回答的是其它，则输出“你到底是爱还是不爱，自己想清楚”
*/
import java.util.Scanner;
public class Test04{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("你爱我吗？回答我yes,还是no:");
		String a = in.next();
		if("yes".equals(a)){
			System.out.print("你是爱我的!");
		}else if ("no".equals(a)){
			System.out.print("原来你不爱我!");
		}else{
			System.out.print("你到底是爱还是不爱，自己想清楚!");
		}
/*		System.out.print("请输入张浩性别:");
		String a = in.next();
		if("男".equals(a)){
			System.out.print("张浩是男人");
		}else if ("女".equals(a)){
			System.out.print("张浩是女人");
		}else{
			System.out.print("张浩是人妖");
		}*/
	}
}