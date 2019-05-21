/*
循环输入字符串，要求将输入的字符串连接起来，直到输入"Esc"结束
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str = input.next();
		String a = "0";
		if(!str.equals("Esc")){
			while(!a.equals("Esc")){
				System.out.print("请继续输入：");
				a = input.next();
				if(!a.equals("Esc")){
					str = str +a;
				}
			}
			System.out.print(str);
		}
	}
}