/*
循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为“Esc”就结束循环，最后显示这个相连的字符串
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一项字符串：");
		String b="",letter=in.next();
		for(int i=1;!letter.equals("Esc");i++){
			if(!letter.equals("Esc")){
				b+=letter;
			}
//			b+=letter;
			letter = in.next();
		}
		System.out.print(b);
	}
}