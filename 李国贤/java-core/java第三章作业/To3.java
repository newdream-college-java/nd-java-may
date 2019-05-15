import java.util.Scanner;
public class To3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=123456,b=456789;
		System.out.println("请输入第一道银行密码");
		int c=input.nextInt();
		if(c==a){
			System.out.println("请输入第二道密码");
		int d=input.nextInt();
			if(d==b){
			System.out.println("恭喜拿到钱了");
			}else{
			System.out.println("第二道密码错误");
			}	
		}else{
			System.out.println("第一道密码错误");
		}

	}
} 

