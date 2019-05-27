import java.util.Scanner;
public class To6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] num=new int[10];
		int sum=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		System.out.println("请输入十个数");
		for(int i=0;i<10;i++){
			num[i]=input.nextInt();
			switch(num[i]){
				case 1:
					sum++;
					break;
				case 2:
					sum1++;
					break;
				case 3:
					sum2++;
					break;
				default:
					sum3++;
					break;
			}
		}
		System.out.println("合法数字有"+(sum+sum1+sum2)+"个");
		System.out.println("非法数字有"+sum3+"个");
	}
}