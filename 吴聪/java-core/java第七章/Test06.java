/*
输入一个数n，统计1到n中奇数和偶数的个数；
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num = in.nextInt(),a=0,b=0;
		if(num!=0){
			for(int i=0;i<=num;i++){
				if(i%2==0){
					a++;
				}else{
					b++;
				}
			}
			System.out.print("偶数"+a+"个\n奇数"+b+"个");
		}else{
			System.out.print("偶数1个\n奇数0个");
		}
	}
}