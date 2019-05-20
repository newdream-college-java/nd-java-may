/*
1.7、循环输入大于 0 的数字进行累加，
直到输入的数字为 0，就结束循环，并最后输出累加的结果。
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(;;){
			int a=input.nextInt();
			if(a!=0){
				sum+=a;
			}else{
				break;
			}
			System.out.print("累加的结果为："+sum+"---");
		}
	}
}