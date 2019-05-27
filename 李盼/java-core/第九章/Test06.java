/*
从键盘输入十个数，1,2,3,是合法数，其他为非法数字，统计合法数和非法数字个数
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count1 = 0,count2 = 0;
		int[] a = new int[10];
		for(int i = 0;i<10;i++){
			System.out.print("请输入"+(i+1)+"第个整数：");
			a[i] = input.nextInt();
			if(a[i]==1||a[i]==2||a[i]==3){
				count1++;
			}else{
				count2++;
			}
		}
		System.out.print("合法数字有"+count1+"个\n非法数字有"+count2+"个");
	}
}