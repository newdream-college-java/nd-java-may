/*
猴子买桃，买3个以下不送，3-5个送一个桃，5个以上就送两个桃
*/
import java.util.Scanner;
public class Diyiti{
	public static void main(String[] args){
		//提示
		System.out.println("请输入猴子买桃数：");	
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch(i){
			case 0:
			case 1:
			case 2:
				System.out.println(i+"个桃");
				break;
			case 3:
			case 4:
			case  5:
				System.out.println(i+1+"个桃");
				break;
			default:
				System.out.println(i+2+"个桃");
				break;
		}
	}
}