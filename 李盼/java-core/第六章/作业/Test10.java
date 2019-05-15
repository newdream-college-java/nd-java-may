/*
循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败
*/
import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i = 1;i<4;i++){
			System.out.print("请输入会员号（4位整数）：");
			int num = input.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
			String bir = input.next();
			System.out.print("请输入会员积分：");
			int fen = input.nextInt();
			if(num/1000<1||num/10000>=1){
				System.out.print("您输入的会员号有误！\n\n");
			}
			else{
				System.out.print("您录入的会员信息是：\n"+num+"\t"+bir+"\t"+fen+"\n\n");
			}
		}
	}
}