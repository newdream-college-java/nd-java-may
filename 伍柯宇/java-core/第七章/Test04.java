/*
用户可以无限次输入数字，判断输入正数负数和0的 个数，直到输入999结束
*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i= 0,j = 0,k = 0;
		do{
			System.out.print("请输入一个数（999结束）：");
			int m = input.nextInt();
			if(m<0){
				i++;
			}
			else if(m>0){
				if(m==999){
					break;
				}
				else{
					j++;
				}
			}
			else{
				k++;
			}
		}while(true);
		System.out.println("正数个数为"+j);
		System.out.println("负数个数为"+i);
		System.out.println("0个数为"+k);
	}
}