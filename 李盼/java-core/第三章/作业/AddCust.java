/*
判断录入的会员号是否合法（必须为4位整数）
*/
import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员号（4位整数）：");
		int hao = input.nextInt();
		System.out.println("请输入会员生日<月/日>（用两位数表示：）");
		String shengRi = input.next();
		System.out.println("请输入积分：");
		int jiFen = input.nextInt();
		while(hao/1000==0||hao/10000>=1){
			System.out.println("会员号有误，请重新输入：");
			hao = input.nextInt();
		}
		System.out.println("已录入的会员信息是：\n"+hao+"\t"+shengRi+"\t"+jiFen+"\t");
	}
}