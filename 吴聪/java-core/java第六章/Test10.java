/*
循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败
*/
import java.util.Scanner;
public class Test10{
	public static void main(String[] args ){
		Scanner in = new Scanner(System.in);
		int num,a;
		String bir;
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号(4位整数)：");
			num =in.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>:");
			bir =in.next();
			System.out.print("请输入会员积分：");
			a =in.nextInt();
			if(num/1000<10&&num/1000>0){
			System.out.println("您输入的会员信息是：\n"+num+"\t"+bir+"\t"+a);
			}else{
			System.out.println("录入失败！");
			}
		}
	}
}