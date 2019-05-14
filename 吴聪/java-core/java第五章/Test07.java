/*
 从键盘上输入一个数，当输入 1~7 时，显示下面对应的信息；输入 1~7 之外
的值时，提示错误重新输入，直到输入 0 退出循环。
1：MON 2：TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入键盘上一个键：");
		int a = in.nextInt();
		while(a!=0){
			if(a>0&&a<8){
				if(a==1){
					System.out.println("MON");
					System.out.print("请输入下一个数：");
				}
				if(a==2){
					System.out.println("TUE");
					System.out.print("请输入下一个数：");
				}
				if(a==3){
					System.out.println("WED");
					System.out.print("请输入下一个数：");
				}
				if(a==4){
					System.out.println("THU");
					System.out.print("请输入下一个数：");
				}
				if(a==5){
					System.out.println("FRI");
					System.out.print("请输入下一个数：");
				}
				if(a==6){
					System.out.println("SAT");
					System.out.print("请输入下一个数：");
				}
				if(a==7){
					System.out.println("SUN");
					System.out.print("请输入下一个数：");
				}
			}else{
				System.out.print("输入错误，重新输入：");
			}
			a=in.nextInt();	
		}
	}
}