import java.util.Scanner;

public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入买桃数：");
		int num=input.nextInt();
		if(num<3){
			System.out.println("买到"+num+"个桃子");
		}
		else if(3<=num&&num<=5){
			num=num+1;
			System.out.println("买到"+num+"个桃子");
		}
		else{
			num=num+2;
			System.out.println("买到"+num+"个桃子");
		}
	}
}