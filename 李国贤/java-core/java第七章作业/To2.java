/*
循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为"Esc"就结束循环，最后显示这个连接起来的字符串。比如:输入abe  输入def  输入Esc          就输出abedef
*/
import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入字符串:");
		String a=input.next();
		 String b="";
		while(!a.equals("Esc")){
			System.out.println("请输入字符串:");
			b=b+a;
			a=input.next();
		}
			System.out.println(b);
	}
}