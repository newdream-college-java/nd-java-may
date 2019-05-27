/*
从键盘上输入10个整数，合法值为1 2 3，不是这3个数则为非法数字。编程统计每个 整数和非法数字的个数
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] num=new int[10];
		int ff=0,zs=0;
		for(int i=0;i<num.length;i++){
			System.out.print("请输入第"+(i+1)+"个数：");
			num[i]=in.nextInt();
			if(num[i]==1||num[i]==2||num[i]==3){
				zs++;
			}else{
				ff++;
			}		
		}
		System.out.println("合法整数个数:"+zs);
		System.out.println("非法整数个数:"+ff);		
	}
}